package AtmSoruTekrari;

import java.util.Scanner;

public class B1 {

    /*
        ATM
        Kullanicidan giriş için kart numarasi ve şifresini isteyin,
        eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
        Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme,
        sifre değiştirme ve cikis islemleri olacaktır.
        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
        eger değilse menü ekranina geri donsun.
        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra,
        sifre değişiklik işlemini yapmali,
         */

    static Scanner scan=new Scanner(System.in);
    static String kartNo="1234123412341234";
    static String sifre="1234";
    static double bakiye=50000;

    public static void main(String[] args) {
        giris();
    }

    private static void giris() {
        System.out.println("Kart numarası giriniz: ");
        String kKartNo= scan.nextLine().replace(" ","");
        System.out.println("Şifre giriniz: ");
        String kSifre= scan.next();

        if (kSifre.equals(sifre) && kKartNo.equals(kartNo)){
            menu();
        }else {
            System.out.println("Kart No veya şifre hatalı!!!");
            scan.nextLine(); // Dummy>>> art arda kullanılan scan objelerinde oluşan
            // hatayı önlemek için kullanılır.
            giris();
        }

    }

    private static void menu() {
        System.out.println("******FALAN FİLAN BANK******\n" +
                "1. Bakiye sorgulama\n" +
                "2. Para yatırma\n" +
                "3. Para çekme\n" +
                "4. Para gönderme\n" +
                "5. Şifre değiştirme\n" +
                "6. ÇIKIŞ\n" +
                "SEÇİMİNİZ: ");
        int secim= scan.nextInt();

        switch (secim){
            case 1:{
                bakiyeSorgula();
                break;
            }
            case 2:{
                System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                double miktar=scan.nextDouble();
                paraYatirma(miktar);
                break;
            }
            case 3:{
                paraCekme();
                break;
            }
            case 4:{
                paraGonderme();
                break;
            }
            case 5:{
                sifreDegistir();
                break;
            }
            case 6:{
                System.out.println("******GÜLE GÜLE******");
                System.exit(0);
                break;
            }
            default:{
                System.out.println("Yanlış değer girdiniz");
                menu();
            }

        }
    }

    private static void sifreDegistir() {
        System.out.println("Eski şifreyi giriniz: ");
        String eSifre= scan.next();

        if (eSifre.equals(sifre)){
            System.out.println("Yeni şifre giriniz: ");
            sifre=scan.next();
            scan.nextLine();
            giris();
        }else {
            System.out.println("Eski şifreyi yanlış girdiniz!!!");
            sifreDegistir();
        }
    }

    private static void paraGonderme() {
        scan.nextLine();
        System.out.println("IBAN NO giriniz(IBAN NO TR ile başlamalı): ");
        String iban= scan.nextLine().toUpperCase().replace(" ","");

        if (iban.length()==26 && iban.startsWith("TR")){

            System.out.println("Gönderilecek miktarı giriniz: ");
            double miktar= scan.nextDouble();
            if (miktar<=bakiye){
                bakiye-=miktar;
                bakiyeSorgula();
            }else {
                System.out.println("Göndermek istediğiniz miktar bakiyeden büyük!!!");
                paraGonderme();
            }

        }
    }

    private static void paraCekme() {
        System.out.println("Çekmek istediğiniz tutarı giriniz: ");
        double miktar= scan.nextDouble();

        if (miktar<=bakiye){
            bakiye-=miktar;
            bakiyeSorgula();
        }else {
            System.out.println("Çekmek istediğiniz miktar bakiyeden büyük");
            paraCekme();
        }

    }



    private static void paraYatirma(double miktar) {
        bakiye+=miktar;
        bakiyeSorgula();
    }

    private static void bakiyeSorgula() {
        System.out.println("Bakiyeniz : " + bakiye + " TL");
        menu();
    }
}

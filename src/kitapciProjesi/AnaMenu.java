package kitapciProjesi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnaMenu  {
    static Scanner scan=new Scanner(System.in);
  static void menu(){
    System.out.println("========= KİTAP PROGRAMI =============\n" +
            "\t\t\t1: Kitap ekle\n" +
            "\t\t\t2: Numara ile kitap sil\n" +
            "\t\t\t3: Tüm kitapları listele\n" +
            "\t\t\t4: Bitir");

    try {
        int secim= scan.nextInt();

        switch (secim){
            case 1 :{
                kitapMethod.kitapEkle();
            }
            case 2 :{
                kitapMethod.kitapNoileKitapSilme();
            }
            case 3 :{
                kitapMethod.tumKitaplariListeleme();
            }
            case 4 :{
                System.out.println("SİSTEMDEN ÇIKILIYOR");
                System.exit(0);
            }

        }

    }catch (InputMismatchException e ){
        System.out.println("Hatalı Giriş");
    }
}
}

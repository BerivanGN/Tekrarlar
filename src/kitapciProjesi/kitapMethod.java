package kitapciProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kitapMethod {
    static Scanner scan=new Scanner(System.in);
    static  int kitapNo=1001;
   static List<String> kitapList=new ArrayList<>();
    public static void kitapEkle() {
        System.out.println("kitap adı giriniz");
        String kitapNo=scan.nextLine();
        System.out.println("yazar adı giriniz");
        String yazarAdi= scan.nextLine();
        System.out.println("yayın yılını giriniz");
        String yayinYili= scan.next();
        System.out.println("kitabın fiyatını giriniz");
        double fiyat= scan.nextDouble();
        kitapList.add(kitapNo);//??

    }

    public static void kitapNoileKitapSilme() {
    }

    public static void tumKitaplariListeleme() {
    }

}

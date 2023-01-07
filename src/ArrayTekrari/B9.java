package ArrayTekrari;

import java.util.Scanner;

public class B9 {
    public static void main(String[] args) {

        // Kullanıcıdan yeni isimler alıp var olan bir array'e ekleyen bir metod oluşturun
        // Kullanıcı yeni değer verdiği müddetçe
        // B8'deki hazır metodu kullanarak eklemeye devam edin
        // Kullanıcı Q'ya bastığında array'in son halini döndürün

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen eklemek istediğiniz isimleri giriniz");
        String eklenenIsim= scan.nextLine();

        String[] arr={"Ceyda"};
        String[] temp=new String[6];

        for (int i = 0; i < temp.length; i++) {
            temp[i]=arr[i];


        }



    }
}

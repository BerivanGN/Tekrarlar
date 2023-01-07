package ArrayTekrari;

import java.util.Arrays;

public class B3 {
    public static void main(String[] args) {

        // Verilen bir String array'da
        // istenen bir harfi içeren kelimeleri silip yerine null yazdırın

        String[] isimler= {"Hüseyin","Yusuf","Mehmet","Akile","Berivan"};
        String silinecekHarf= "e";

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].contains(silinecekHarf)){
                isimler[i]=null;
            }
        }
        System.out.println(Arrays.toString(isimler));
    }
}

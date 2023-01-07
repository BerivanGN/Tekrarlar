package ArrayTekrari;

import java.util.Arrays;

public class B8 {
    public static void main(String[] args) {

        // Soru 7- Verilen bir array’e istenen bir elemani ekleyip
        //         bize donduren bir method yazin, eski array’e yeni degeri atayin.

        String[] isimler= {"Berivan","Yalçın","Deniz"};
        String  eklenecekIsim= "Eylül";
        isimler=(ArrayeElemanEkleme(isimler, eklenecekIsim));
        System.out.println(Arrays.toString(isimler));

    }

    public static String[] ArrayeElemanEkleme(String[] varolanArray, String eklenenElement){

        String[] temp=new String[varolanArray.length+1];

        for (int i = 0; i < varolanArray.length; i++) {

            temp[i]=varolanArray[i];
        }
        temp[temp.length-1]=eklenenElement;

        return temp;
    }
}

package NestedTekrari;

public class B2 {
    public static void main(String[] args) {

        //input olarak verilen bir string'de
        // index'i tek sayı olanları küçük harfle
        //index'i çift sayı olanları büyük harfler yazdırın

        String input="Berryone";

        /* 1.Çözüm
        for (int i = 0; i < input.length(); i++) {

            if (i%2==0){
                input.substring(i,i+1).toUpperCase();
            }else {
                input.substring(i,i+1).toLowerCase();
            }
            System.out.println(input);
        }

         */

        for (int i = 0; i < input.length(); i++) {

            System.out.print(i%2==0  // index çift mi ?
                    ? input.substring(i, i+1).toUpperCase() // index çift ise
                    : input.substring(i, i+1).toLowerCase() // index tek ise
            );
        }

    }
}

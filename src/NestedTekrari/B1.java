package NestedTekrari;

public class B1 {
    public static void main(String[] args) {

        //verilen input'a göre çarpım tablosu oluşturun.
        //java'da iç içe yapılara nested denir.
        //burada sadece farklı olan i'nin katsayısı olduğundan onun için de bir loop oluşturalım.

        int input1=5;
        int input2=5;

        for (int i = 1; i <input1; i++) {
            for (int j = 1; j < input2; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println(" ");
        }

    }
}

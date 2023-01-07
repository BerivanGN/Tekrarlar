package ArrayTekrari;

import java.util.Arrays;

public class B7 {
    public static void main(String[] args) {

        // Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun,
        // array’i yeni haliyle kaydedin.
        // Orn : input : [7,97,89,98,17]  array’in son hali. : [17,7,97,89,98]

        int[] arr={7,97,89,98,17};
        ElementleriSagaKaydir(arr); // [17, 7, 97, 89, 98]


    }
    public static void ElementleriSagaKaydir(int[] arr){

         int temp=arr[arr.length-1];

        for (int i = arr.length-1; i>=1; i--) {

            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
}

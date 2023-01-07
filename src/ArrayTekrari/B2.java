package ArrayTekrari;

public class B2 {
    public static void main(String[] args) {

        // Verilen bir int array'daki tüm elementleri 5 arttırın

        int[] arr={2,4,6,8};
        int toplam= 0;

        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];

        }
        System.out.println(toplam);
    }
}

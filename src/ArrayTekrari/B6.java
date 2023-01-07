package ArrayTekrari;

public class B6 {
    public static void main(String[] args) {

        // Verilen bir array’de istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr={2,3,4,2,5,2,6,7,4,5,1,2,4,6,3,1,9};
        int arananSayi=2;
        ElemanVarligiVeTekrari(arr,2);

    }
    public static void ElemanVarligiVeTekrari(int[]arr, int arananSayi){

        int sayac=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==arananSayi){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("Aranan sayı Array'de yok");
        }else {
            System.out.println(arananSayi + " sayısı array'de " + sayac + " defa kullanılmıştır.");
        }

    }
}

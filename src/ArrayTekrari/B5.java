package ArrayTekrari;

public class B5 {
    public static void main(String[] args) {

        // Bir marketin fiyatlarını tutan bir array var
        // Bu marketteki en yüksek ve en düşük fiyatları yazdıran bir metod oluşturun

        double[] fiyatlar={23, 34.5, 42.1, 5.7, 3.4, 23.5};
        FiyatlariYazdir(fiyatlar);

    }
    public static void FiyatlariYazdir(double[] arr){

        double enDusukFiyat=arr[0];
        double enYuksekFiyat=arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]<enDusukFiyat){
                enDusukFiyat=arr[i];
            }

            if (arr[i]>enYuksekFiyat){
                enYuksekFiyat=arr[i];
            }
        }
        System.out.println("Marketteki en düşük fiyat : " + enDusukFiyat);
        System.out.println("Marketteki en yüksek fiyat : " + enYuksekFiyat);

    }
}

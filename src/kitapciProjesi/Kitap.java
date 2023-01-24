package kitapciProjesi;

public class Kitap {

    private int kitapNo;
    private String kitapAdi;
    private String yazarAdi;
    private String yayinYili;
    private double fiyat;

    public Kitap(int kitapNo, String kitapAdi, String yazarAdi, String yayinYili, double fiyat) {
        this.kitapNo = kitapNo;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.yayinYili = yayinYili;
        this.fiyat = fiyat;
    }

    public Kitap() {
    }

    public int getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(int no) {
        this.kitapNo = no;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public String getYayinYili() {
        return yayinYili;
    }

    public void setYayinYili(String yayinYili) {
        this.yayinYili = yayinYili;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return
                "no=" + kitapNo +
                ", kitapAdi='" + kitapAdi + '\'' +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", yayinYili='" + yayinYili + '\'' +
                ", fiyat=" + fiyat ;
    }
}

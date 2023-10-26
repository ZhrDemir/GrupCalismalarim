package GeoSekilHesaplama;

public class Kare extends Dikdortgen{


    public Kare(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

  //  public static void kareAlanCevre(double uzunKenar , double kisaKenar) {super(uzunKenar, kisaKenar);}




    public String toString() {
        return "Kenar Uzunluğu=" + uzunKenar + " \nÇevre= "+cevreHesaplama(uzunKenar,kisaKenar)+" \nAlan= "+alanHesapla(uzunKenar,kisaKenar);
    }
}







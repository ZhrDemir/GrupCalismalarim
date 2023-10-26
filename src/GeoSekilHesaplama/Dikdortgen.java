package GeoSekilHesaplama;

public class Dikdortgen extends sekil{




    public Dikdortgen(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    public String toString() {
        return "Kenar Uzunluğu=" + uzunKenar + ", " +kisaKenar+"\nÇevre= "+cevreHesaplama(uzunKenar,kisaKenar)+" \nAlan= "+alanHesapla(uzunKenar,kisaKenar);
    }
}


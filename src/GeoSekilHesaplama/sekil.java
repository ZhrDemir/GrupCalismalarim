package GeoSekilHesaplama;

public class sekil {

 static    double kisaKenar;
  static    double uzunKenar;

static  double cevre;
static double alan;

 public sekil(double uzunKenar, double kisaKenar) {
     this.uzunKenar = uzunKenar;
     this.kisaKenar = kisaKenar;
 }

 public static double  cevreHesaplama(double uzunKenar,double kisaKenar){
     cevre =(uzunKenar+kisaKenar)*2;
     return cevre;

    }
public static double alanHesapla(double uzunKenar,double kisaKenar){
     alan = uzunKenar*kisaKenar;
     return alan;
}



}

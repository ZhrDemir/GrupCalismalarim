package GeoSekilHesaplama;

public class sekil {

 static  double kisaKenar;
 static double uzunKenar;
static double yaricap;
static  double cevre;
static double alan;

 public sekil(double uzunKenar, double kisaKenar) {
     this.uzunKenar = uzunKenar;
     this.kisaKenar = kisaKenar;
 }
 public sekil(double yaricap){
     this.yaricap = yaricap;
 }

 public static double  cevreHesaplama(double uzunKenar,double kisaKenar){
     cevre =(uzunKenar+kisaKenar)*2;
     return cevre;

    }
public static double alanHesapla(double uzunKenar,double kisaKenar){
     alan = uzunKenar*kisaKenar;
     return alan;
}
public static double cemberAlan(double yaricap){
     return 3.14*(yaricap*yaricap);
}
public static double cemberCevre(double yaricap){
     return 2*3.14*yaricap;
}

}

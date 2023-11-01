package GeoSekilHesaplama;

public class Cember extends sekil {
    public Cember(double yaricap) {

        super(yaricap);

        }
        public String toString(){
        return ("Yarıçap = " + yaricap + " \nÇemberin çevresi =  "+cemberCevre(yaricap) +"\nÇemberin alanı = " + cemberAlan(yaricap) );
        }



    }


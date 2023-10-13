package ekim6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class manavSorusu {
    public static void main(String[] args) {

        /*
Basit bir 5 ürünlü manav alisveris programi yaziniz.

  1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
  2. Adim : Baska bir urun almak isteyip istemedigini sor.
             istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
             Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
  3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
  4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

 */

        ArrayList <String> liste = new ArrayList<>(Arrays.asList("1-Mandalina","2-Portakal",
                                     "3-Elma","4-Armut","5-Ayva"));
        ArrayList<Integer> urunFiyatı = new ArrayList<>(Arrays.asList(20,25,30,35,40));

        System.out.println("********YILDIZ MANAV*********");
        for (String each:liste
             ) {
            System.out.println(each);

        }
        double toplam = 0;
        boolean b = false;
        do {


        System.out.println("Lütfen listeden ürün seçiniz.");
        Scanner scanner = new Scanner(System.in);
        int secim = scanner.nextInt();

        System.out.println("Kaç kilo almak istersiniz?");
        double kilo = scanner.nextDouble();

        double tutar = kilo*urunFiyatı.get(secim-1);
        System.out.println("tutar = "+ tutar);
        toplam += tutar;


        System.out.println("Listeden başka bir ürün seçmek ister misiniz? (Evet = E , Hayır = H)");
        char tekrarSecim=scanner.next().toUpperCase().charAt(0);

        if (tekrarSecim== 'E' ) {
                b = true;

            }else if(tekrarSecim=='H'){
            System.out.println("Yaptığınız alışverişin toplam tutarı = " + toplam);
            b=false;

         }else {
            System.out.println("Yanlış giriş yaptınız.");
            b=false;
        }
        }while (b);






    }
}

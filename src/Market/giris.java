package Market;

import java.util.Scanner;

import static Market.reyonlar.*;

public class giris {

       /*
   *
  ====================WISE T127 MARKET===================================
ilk programa girildiginde bizi bir menu karsilasin bu secenekler
  1 ŞARKÜTERİ ÜRÜNLERİ
  2 MANAV ÜRÜNLERİ
  3 MARKET ÜRÜNLERİ
  secime gore ,
  4-urunleri listele ve
  5-fiyatlari gelsin
  6-sonunda fis yazdırsın
    */

    static boolean b = true;
    static Scanner scanner = new Scanner(System.in);
    static int secim=0 , urunKodu = 0, urunFiyatı = 0;
    static String urun = "", sepet = "",ekUrun = "" , secim2 = "";
    static double urunMiktari = 0,tutar = 0 , toplamTutar=0,odeme = 0;





    public static void menu() {

        System.out.println("====================WISE T127 MARKET========================");
        System.out.println("     =====================Hoşgeldiniz=====================");
        System.out.println("1- ŞARKÜTERİ ÜRÜNLERİ\n" +
                "2- MANAV ÜRÜNLERİ\n" +
                "3- MARKET ÜRÜNLERİ\n" +
                "4- SEPETİ ONAYLA\n" +
                "5- ÇIKIŞ");


        try {

            System.out.println("Lütfen menüden seçiminizi yapınız.");
            secim = scanner.nextInt();

            switch (secim) {

                case 1:
                    sarkuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    sepet();
                    break;
                case 5:
                    cikis();
                    break;
                default:
            }
        } catch (Exception e) {
            System.out.println("Yanlış seçim yaptınız.");
            System.out.println("Alişveriş yapmak istiyorsanız Q ya basınız.");
            secim2= String.valueOf(scanner.next().charAt(0));
                    if (secim2.equalsIgnoreCase("q")){
                    menu();
        }else cikis();
               }


    }

    }


package ekim6;

import java.util.Objects;
import java.util.Scanner;

public class kahveSorusu {
    public static void main(String[] args) {

      /*  Basit bir Kahve makinesi oluşturun.
        1. Şart
        3 çeşit kahvemiz olsun.
                Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"

        Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
        Örn:
        Hangi Kahveyi İstersiniz?
                1.Türk kahvesi
        2.Filtre Kahve
        3.Americano
        2.Şart
        Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)
        3. Şart
        Süt tercihi yapıldıktan sonra sistem kullanıcıya "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)
        sorusunu sorsun.
        4. Şart
        Şeker tercihini yaptıktan sonra sistem kullanıcıya "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)
        sorusunu sorsun.
        Sonuç
        Siparişlerimizi verdik. Son hali görmek istiyoruz.
        konsola şunu yazdırın örnek :
        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!
*/

        System.out.println(kahveSecimi() + sutSecimi() + sekerSecimi() + boyutSecimi() + " hazırdır. Afiyet olsun!!!" );








    }


    public static String kahveSecimi() {

        String kahve1 = "";
        boolean b = true;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Hangi Kahveyi İstersiniz? \n 1.Türk Kahvesi \n 2.Filtre Kahvesi \n 3.Americano");
            int kahve = scanner.nextInt();


            if (kahve == 1) {
                kahve1 = "Türk Kahvesi  ";
                b = true;
            } else if (kahve == 2) {
                kahve1 = "Filitre Kahvesi ";
                b = true;
            } else if (kahve == 3) {
                kahve1 = "Americano  ";
            } else b = false;
        }while (!b);
return kahve1;
    }

    public static String sutSecimi() {

        String sut="";
        String sut1="";
        boolean b = true;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Süt eklemek ister misiniz?(Evet veya Hayır olarak cevaplayınız.)");
            sut = scanner.nextLine();

            if (sut.equalsIgnoreCase("evet")) {
                sut1 = " sütlü ";
                b = true;
            } else if (sut.equalsIgnoreCase("hayır")) {

                b = true;
            } else {
                b=false;
            }
        }while (!b);

        return sut1;
    }

    public static String sekerSecimi() {

        String seker1= "";
        boolean b=true;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Şeker ister misiniz?(Evet veya Hayır olarak cevaplayınız.)");
            String seker = scanner.nextLine();

            if (seker.equalsIgnoreCase("evet")) {
                seker1 = " şekerli ";
                b = true;
            } else if (seker.equalsIgnoreCase("hayır")) {
                seker1 = " şekersiz";
                b = true;
            } else b = false;
        }while (!b);

        return seker1;
    }


    public static String boyutSecimi() {

        String boyut1= "";
        boolean b=true;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Hangi boyutta olsun?(Büyük boy - Orta boy - Küçük boy olarak giriniz.)");
            String boyut = scanner.nextLine();


            if (boyut.equalsIgnoreCase("Büyük boy")) {
                boyut1 = " büyük boy";
                b = true;
            } else if (boyut.equalsIgnoreCase("Orta boy")) {
                boyut1 = " orta boy";
                b = true;
            } else if (boyut.equalsIgnoreCase("Küçük boy")) {
                boyut1 = " küçük boy";
                b = true;
            } else b = false;

        }while (!b);
   return boyut1;
    }

    }







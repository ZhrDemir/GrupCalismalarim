package ekim6;

import java.util.Scanner;

public class kahveSorusu2calısıyorum {


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

    static Scanner scanner= new Scanner(System.in);
    static int hangiKahve=0;
    static String sutSecimi1, sekerSecimi1, boyutSecimi1,sekerSecimi,boyutSecimi, sutSecimi,hangiKahve1;

    static String kahveSecimi(){


        do {
            System.out.println("***********KAHVECİYE HOŞGELDİNİZ************");
            System.out.println("Hangi kahveyi istersiniz?\n 1.Türk Kahvesi\n 2. Filtre Kahve\n 3. Americano");
            hangiKahve=scanner.nextInt();

            if (hangiKahve==1){
                hangiKahve1="Türk Kahvesi ";
            } else if (hangiKahve==2) {
                hangiKahve1="Filtre Kahve ";
            } else if (hangiKahve==3) {
                hangiKahve1="Americano ";
            }else {
                System.out.println("Lütfen seçiminizi 1, 2 veya 3 şeklinde yapınız.");
            }
        }while (!(hangiKahve==1 || hangiKahve ==2 || hangiKahve==3));
return hangiKahve1;
        }

        static String sutSecimi(){

            do {
                System.out.println("Süt ister misiniz? (Evet veya Hayır)");
                sutSecimi1 =scanner.next();
                  if (!(sutSecimi1.equalsIgnoreCase("evet")|| sutSecimi1.equalsIgnoreCase("hayır"))) {
                      System.out.println("Lütfen seçiminizi Evet veya Hayır şeklinde yapınız.");
                  }else if (sutSecimi1.equalsIgnoreCase("evet")){
                    sutSecimi= "Süt ilaveli ";
                } else if (sutSecimi1.equalsIgnoreCase("hayır")){
                    sutSecimi="Süt ilavesiz ";
                }

            }while (!(sutSecimi1.equalsIgnoreCase("evet")|| sutSecimi1.equalsIgnoreCase("hayır")));
return sutSecimi;
        }

        static String sekerSecimi() {

            do {


                System.out.println("Şeker  ister misiniz? (Evet veya Hayır)");
                sekerSecimi1 = scanner.next();
                if (!(sekerSecimi1.equalsIgnoreCase("evet") || sekerSecimi1.equalsIgnoreCase("hayır"))) {
                    System.out.println("Lütfen seçiminizi Evet veya Hayır şeklinde yapınız.");
                } else if (sekerSecimi1.equalsIgnoreCase("evet") ){
                   sekerSecimi= "Şeker ilaveli ";
                } else if (sekerSecimi1.equalsIgnoreCase("hayır") ){
                    sekerSecimi="Şeker ilavesiz ";
                }

            } while (!(sekerSecimi1.equalsIgnoreCase("evet") || sekerSecimi1.equalsIgnoreCase("hayır")));
return sekerSecimi;
    }

    static String boyutSecimi() {

        do {
            System.out.println("Hangi boyutta olsun? (Büyük Boy, Orta Boy veya Küçük Boy şeklinde seçim yapınız.)");
            scanner.nextLine();
            boyutSecimi1 = scanner.nextLine();

            if (boyutSecimi1.equalsIgnoreCase("büyük boy")) {
                boyutSecimi="Büyük Boy ";
            } else if (boyutSecimi1.equalsIgnoreCase("orta boy")) {
                boyutSecimi="Orta Boy ";
            } else if (boyutSecimi1.equalsIgnoreCase("küçük  boy")) {
                boyutSecimi="Küçük Boy ";
            } else
                System.out.println("Yanlış seçim yaptınız.");

        } while (!(boyutSecimi1.equalsIgnoreCase("büyük boy") || boyutSecimi1.equalsIgnoreCase("orta boy") ||
                    boyutSecimi1.equalsIgnoreCase("küçük  boy"))) ;

return boyutSecimi;


    }

    public static void main(String[] args) {

        System.out.println( kahveSecimi() +
        sutSecimi()+
        sekerSecimi()+
        boyutSecimi()+
        " kahveniz hazır. Afiyet Olsun .");
    }


























































}

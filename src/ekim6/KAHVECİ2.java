package ekim6;

import java.util.Scanner;
import java.util.Objects;
public class KAHVECİ2 {
    static Scanner scanner = new Scanner(System.in);
    static String kahve1 = "", kahve = "";
    static boolean b = true;
    static String sut="", sut1 = "";

    static String seker1= "", seker = "";
    static String boyut1= "", boyut="", ekUrun = "", sepet = "";



    public static void main(String[] args) {

            menu();


        }
        public static void menu(){
            System.out.println(kahveSecimi() + sutSecimi() + sekerSecimi() + boyutSecimi() + " hazırdır. Afiyet olsun!!!" );
            ekUrun();
        }


        public static String kahveSecimi() {

                 b=true;

            do {

                System.out.println("**************** WİSE KAHVECİ **************** ");
                System.out.println("=========== Hoşgeldiniz ===========");

                System.out.println("Hangi Kahveyi İstersiniz? \n 1.Türk Kahvesi \n 2.Filtre Kahvesi \n 3.Americano");
                 b = true;
                kahve = "";
                kahve = scanner.next();


                if (!(kahve.equals("1") || kahve.equals("2") || kahve.equals("3"))){
                    System.out.println("Yanlış giriş yaptınız.");
                    b = false;
                }else if (kahve.equals("1")) {
                    kahve1 = "Türk Kahvesi  ";
                    System.out.println(kahve1+ " hazırlanıyor...");
                    break;

                } else if (kahve.equals("2")){
                    kahve1 = "Filitre Kahvesi ";
                    System.out.println(kahve1+ " hazırlanıyor...");
                    break;

                } else if (kahve.equals("3")) {
                    kahve1 = "Americano  ";
                    System.out.println(kahve1+ " hazırlanıyor...");
                    break;
                }


            }while (!b);
            sepet += kahve1+" ";
            return kahve1;
        }

        public static String sutSecimi() {

b=true;
            do {

                System.out.println("Süt eklemek ister misiniz?(Evet veya Hayır olarak cevaplayınız.)");
                sut = scanner.next();

                if (sut.equalsIgnoreCase("evet")) {
                    sut1 = "sütlü ";
                    System.out.println("Sütünüz hazırlanıyor...");
                    break;
                } else if (sut.equalsIgnoreCase("hayır")) {
                    sut1 = "sütsüz ";
                    System.out.println("Süt eklenmiyor...");
                    break;

                } else {
                    b=false;
                }
            }while (!b);

            sepet += sut1 + " ";
            return sut1;
        }

        public static String sekerSecimi() {

        b=true;

            do {

                System.out.println("Şeker ister misiniz?(Evet veya Hayır olarak cevaplayınız.)");
                seker = scanner.next();

                if (seker.equalsIgnoreCase("evet")) {

                    System.out.println("Kaç şekerli olsun?");
                    int sekerSayisi = scanner.nextInt();

                    seker1 = sekerSayisi +" şekerli ";
                    System.out.println("Şeker hazırlanıyor...");
                   break;

                } else if (seker.equalsIgnoreCase("hayır")) {
                    System.out.println("Şeker eklenmiyor...");
                    seker1= " şekersiz";
                   break;

                } else b = false;
            }while (!b);

            sepet += seker1 + " ";
            return seker1;
        }


        public static String boyutSecimi() {

        b=true;
        do {

                System.out.println("Hangi boyutta olsun?(Büyük boy - Orta boy - Küçük boy olarak giriniz.)");
                scanner.nextLine();
                boyut = scanner.nextLine();


                if (boyut.equalsIgnoreCase("Büyük boy")) {
                    boyut1 = " büyük boy ";
                    break;

                } else if (boyut.equalsIgnoreCase("Orta boy")) {
                    boyut1 = " orta boy ";
                    break;

                } else if (boyut.equalsIgnoreCase("Küçük boy")) {
                    boyut1 = " küçük boy ";
                    break;

                } else b = false;

            }while (!b);
        sepet+= boyut1 +" ";

            return boyut1;
        }
            public static void ekUrun(){

        b=true;
                do {
                    System.out.println("Tekrar sipariş vermek ister misiniz?( Evet veya Hayır olarak cevaplayınız.)");
                    ekUrun = scanner.next();

                    if (ekUrun.equalsIgnoreCase("evet")) {
                        System.out.println("Sizi tekrar menüye yönlendiriyorum.");
                        menu();
                        break;
                    } else if (ekUrun.equalsIgnoreCase("hayır")) {
                        System.out.println("Aldığınız ürünler : "+sepet + "  ");
                        System.out.println("Teşekkür ederiz. Tekrar bekleriz...");
                        break;
                    } else {
                        System.out.println("Yanlış giriş yaptınız.");
                        b = false;
                    }
                }while (!b);

            }
    }





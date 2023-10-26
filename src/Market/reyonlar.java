package Market;

public class reyonlar extends giris{

    public static void sarkuteri(){

        System.out.println("**********Şarküteri Reyonuna Hoşgeldiniz**********");
        System.out.println("11 - Peynir  300₺\n12 - Yumurta  150₺\n13 - Zeytin  200₺\n14 - Vişne Reçeli  175₺ ");
        System.out.println("Lütfen almak istediğiniz ürünün kodunu giriniz.");

       while (b) {
           urunKodu = scanner.nextInt();

           if (urunKodu >= 11 && urunKodu <= 14) {

               switch (urunKodu) {
                   case 11:
                       urun = "Peynir";
                       urunFiyatı = 300;
                       break;
                   case 12:
                       urun = "Yumurta";
                       urunFiyatı = 150;
                       break;
                   case 13:
                       urun = "Zeytin";
                       urunFiyatı = 200;
                       break;
                   case 14:
                       urun = "Vişne Reçeli";
                       urunFiyatı = 175;
                       break;
               }
               System.out.println("Seçtiğiniz ürünün miktarını giriniz.(kg/koli)");
               urunMiktari = scanner.nextDouble();
               tutar += urunFiyatı * urunMiktari;
               toplamTutar += tutar;
               sepet +=urun+" " + toplamTutar;
               System.out.println(urunMiktari + " kg/koli " + urun + urunFiyatı + "₺\n");
               System.out.println("Sepet : " + sepet);

               System.out.println("Yeni bir ürün almak için ürünün kodunu giriniz. Ana menüye dönmek için 0'a basınız. ");

           } else if (urunKodu == 0) {
               System.out.println("Sizi menüye yönlendiriyorum....");
               menu();
           } else {
               System.out.println("Yanlış giriş yaptınız.");

           }
       }

































    }

    public static void manav(){


        System.out.println("*******************MANAV REYONU*****************");
        System.out.println("***********************Hoşgeldiniz*********************");
        System.out.println("21 - Elma : 30₺\n22 - Armut : 35₺\n23 - Ayva : 32₺\n" +
                "24 - Patlıcan : 27₺\n25 - Kabak : 25₺" );
        System.out.println("Lütfen menüden istediğiniz ürünün Ürün Kodunu giriniz:");


        urunKodu = 0;

            urunKodu = scanner.nextInt();

            if (!(urunKodu<=25 && urunKodu>=21)){
                System.out.println("Yanlış giriş yaptınız.");
                manav();
            }else {
                switch (urunKodu) {

                    case 21:
                        urun = "Elma";
                        urunFiyatı = 30;
                        break;
                    case 22:
                        urun = "Armut";
                        urunFiyatı = 35;
                        break;
                    case 23:
                        urun = "Ayva";
                        urunFiyatı = 32;
                        break;
                    case 24:
                        urun = "Patlıcan";
                        urunFiyatı = 27;
                        break;
                    case 25:
                        urun = "Kabak";
                        urunFiyatı = 25;
                        break;

                    default:
                }
            }


        sepet += urun +" : " + urunFiyatı + "₺ , ";
while (b) {
    try {
        System.out.println(urun + " kaç kg almak istersiniz?");
        urunMiktari = scanner.nextDouble();
        tutar = urunFiyatı * urunMiktari;

        sepet += urunMiktari + " kg, TOPLAM=  " + tutar + "₺\n";

        toplamTutar += tutar;

        System.out.println(urunMiktari + " kg " + urun + " Tutarı = " + tutar + " ₺");
        System.out.println("SEPET :\n " + sepet);

    } catch (Exception e) {
        System.out.println("Yanlış giriş yaptınız.");
        b = false;

    }
} while (b) {
            try {
                System.out.println("Manav reyonundan başka bir ürün daha almak ister misiniz?(E/H)");
                ekUrun = String.valueOf(scanner.next().charAt(0));

                if (ekUrun.equalsIgnoreCase("e")) {
                    manav();
                } else if (ekUrun.equalsIgnoreCase("h")) {
                    System.err.println("Sizi ana menüye yönlendiriyorum....");
                    menu();
                }
            } catch(Exception e){
                System.err.println("Yanlış giriş yaptınız.");
                b = true;
                }

            }
            }



    public static void market(){


    }

    public static void sepet(){

        System.out.println("TOPLAM TUTAR : "+toplamTutar);
        do {

            System.out.println("GİRİLECEK NAKİT TUTARI : ");
            odeme = scanner.nextDouble();

            if (odeme < toplamTutar) {
                System.out.println("Girilen nakit tutarı yetersiz." + (toplamTutar - odeme) + " ₺ daha ödeme yapmalısınız.");
            }
        } while (odeme<toplamTutar);
            System.err.println("FİŞİNİZ YAZDIRILIYOR...");
            System.out.println("************ALIŞVERİŞ FİŞİNİZ***********");
            System.out.println("");
            System.out.println("SEPET :\n " + sepet);
            System.out.println("TOPLAM TUTAR : " + toplamTutar);
            System.out.println("Para üstü : " + (odeme - toplamTutar));

        cikis();

    }

    public static void cikis(){
        System.out.println("Alışverişiniz için teşekkür ederiz...\nHoşçakalın...");
        System.exit(0);
    }

    public static void ekUrun(){

    }


}

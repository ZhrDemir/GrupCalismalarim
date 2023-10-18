package Market;

public class reyonlar extends giris{

    public static void sarkuteri(){

    }

    public static void manav(){


        System.out.println("*******************MANAV REYONU*****************");
        System.out.println("***********************Hoşgeldiniz*********************");
        System.out.println("21 - Elma\n22 - Armut\n23 - Ayva\n" +
                "24 - Patlıcan\n25 - Kabak" );
        System.out.println("Lütfen menüden istediğiniz ürünün Ürün Kodunu giriniz:");

        urunKodu = scanner.nextInt();

        try {

            switch (urunKodu){

                case 21:
                    urun = "Elma";
                    urunFiyatı = 30;
                    break;
                case 22:
                    urun= "Armut";
                    urunFiyatı=35;
                    break;
                case 23:
                    urun="Ayva";
                    urunFiyatı=32;
                    break;
                case 24:
                    urun="Patlıcan";
                    urunFiyatı=27;
                    break;
                case 25:
                    urun="Kabak";
                    urunFiyatı=25;
                    break;

                default:
            }
        }catch (Exception e){
            System.out.println("Yanlış giriş yaptınız");
        }










    }
    public static void market(){

    }

    public static void sepet(){

    }

    public static void cikis(){

    }

    public static void ekUrun(){

    }


}

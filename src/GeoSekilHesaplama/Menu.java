package GeoSekilHesaplama;

import java.util.Scanner;



public class Menu {
    static  Scanner scanner = new Scanner(System.in);
    public static void menu(){
        System.out.println("*********************MENÜ*******************");
        System.out.println("1 - ÇEMBER\n2 - DİKDÖRTGEN\n3 - KARE\n4 - ÇIKIŞ");
        System.out.println("Lütfen seçiminizi giriniz.");

        try {
        int secim = scanner.nextInt() ;


        switch (secim) {
            case 1:
                cember();
                break;
            case 2:
                dikdortgen();
                break;
            case 3:
                kare();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
                menu();
        }
        }
        catch (Exception e) {
            System.out.println("Yanlış seçim yaptınız...");
            //System.exit(0);
            menu();
        }



    }

    private static void kare() {
        System.out.println("Kare nin kenarını giriniz,");
        double kenar1 = scanner.nextDouble();
        Kare kareobj = new Kare(kenar1,kenar1);
        System.out.println(kareobj);
        menu();
    }


    private static void dikdortgen() {
        System.out.println("Dikdörtgenin iki kenarını giriniz.");
        double uzunKenar = scanner.nextDouble();
        double kisaKenar = scanner.nextDouble();
        Dikdortgen obj = new Dikdortgen(uzunKenar,kisaKenar);
        System.out.println(obj);
        menu();

    }

    private static void cember() {
    }

}

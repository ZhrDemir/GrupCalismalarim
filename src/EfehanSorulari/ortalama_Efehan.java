package EfehanSorulari;

import java.util.Arrays;
import java.util.Scanner;

public class ortalama_Efehan {
    public static void main(String[] args) {

          /*
    Kullanicidan kac tane sayinin ortalamasini bulmasini istedigini sorun
    ve buna bagli olarak aldiginiz degerleri bir array'de saklayin. kullancidan verileri aldiktan sonra
    tum sayilari ve ortalamasini yazdirin
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç tane sayının ortalamasını bulmak istiyorsunuz? ");
        int ortSAYI = scanner.nextInt();
        int [] sayi = new int[ortSAYI];
        int toplam = 0 ;

        for (int i = 0; i < ortSAYI ; i++) {
            System.out.println("Ortalamasını almak istediğiniz " + (i+1) + ". sayıyı giriniz : ");
             sayi [i] = scanner.nextInt();
             toplam += sayi[i] ;

        }
        System.out.println("Girdiğiniz sayılar =  " + Arrays.toString(sayi) );
        System.out.println("Ortalamaları = " +(double) toplam/ortSAYI);



    }
}

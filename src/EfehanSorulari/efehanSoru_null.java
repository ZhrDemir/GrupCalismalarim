package EfehanSorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class efehanSoru_null {
    public static void main(String[] args) {
         /*
    Kullanıcının girdiği öğrenci sayısı ve kullanıcının girdiği toplam
    soru sayısına bağlı olarak, öğrencilerin soruya verdiği cevapları
    tutan bir matris düzenleyin. Bu değerleri rastgele olarak olusturun.
    Değerler A,B,C,D,E olmalı.
    Bir de doğru cevapları tutan tek boyutlu bir diziniz olsun. Bu da
    rastgele oluşturulmalı.
    Sonrasında bu değerleri karşılaştırarak her bir öğrencinin kaç doğru
    ve yanlışı olduğunu gösteren programı yazınız.
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç öğrenci sınava katılmıştır?");
        int ogrSayisi = scanner.nextInt();

        System.out.println("Sınavda toplam kaç soru vardır? ");
        int soruSayisi = scanner.nextInt();

       String  [][] arr = new String[ogrSayisi][soruSayisi];

        String [] cevaplar = {"A","B","C","D","E"};
        Random random = new Random();

        int cevapNo = 0;
        for (int i = 0; i < ogrSayisi; i++) {
            for (int j = 0; j < soruSayisi; j++) {
                cevapNo = random.nextInt(cevaplar.length);
                arr[i][j] = String.valueOf(cevaplar[cevapNo]);

                System.out.println(i + 1 + ". öğrencinin cevapları : " + Arrays.toString(cevaplar[cevapNo].toCharArray()));
            }
        }
        ArrayList<String > dogruCevaplar = new ArrayList<String>();
        for (int i = 0; i < soruSayisi; i++) {
            cevapNo = random.nextInt(cevaplar.length) ;
            dogruCevaplar.add(cevaplar[cevapNo]) ;

        }
        System.out.println("");
        System.out.println("Doğru cevaplar = " + dogruCevaplar);

        for (int i = 0; i < ogrSayisi; i++) {
            for (int j = 0; j < soruSayisi; j++) {



            }
        }
    }
}

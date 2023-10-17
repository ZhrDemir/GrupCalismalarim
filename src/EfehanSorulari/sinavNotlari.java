package EfehanSorulari;

import javax.security.sasl.SaslClient;
import java.util.*;

public class sinavNotlari {

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
       public static void main(String[] args) {

           try {

             // kullanıcıdan öğrenci sayısı bilgisi ve soru sayısı bilgisi isteniyor

               Scanner scanner = new Scanner(System.in);
               System.out.println("Lütfen öğrenci sayısını giriniz ");
               int ogrsayi = scanner.nextInt();
               System.out.println("Toplam soru sayısı ");
               int soruSayisi = scanner.nextInt();


               String[][] ogrCevaplari = new String[ogrsayi][soruSayisi];

               //ratgele cevaplar seçilecek

               Random random = new Random();
               String[] cevaplar = {"A", "B", "C", "D", "E"};

               int cevapNo = 0;
               for (int i = 0; i < ogrsayi; i++) {
                   for (int j = 0; j < soruSayisi; j++) {

                       cevapNo = random.nextInt(cevaplar.length);
                       ogrCevaplari[i][j] = String.valueOf(cevaplar[cevapNo]); // rastgele cevaplar, öğrenci cevapları için oluşturulan MDArray e yerleştirildi

                   }
               }
               System.out.println(Arrays.deepToString(ogrCevaplari));// öğrencilerin cevapları yazılıyor
               List<String> dogruCevaplar = new ArrayList<>();// doğru cevapların olduğu yeni bir list oluşturuluyor

               for (int i = 0; i < soruSayisi; i++) {     // doğru cevaplarda rastgele seçilip yerleştiriliyor

                   cevapNo = random.nextInt(cevaplar.length);
                   dogruCevaplar.add(cevaplar[cevapNo]);
               }
               System.out.println("Doğru cevaplar :" + dogruCevaplar);

              int dogruCSayisi=0;

               for (int i = 0; i < ogrsayi; i++) {     // buradaki döngüde doğru cevaplarla öğrenci cevapları karşılaştırılıyor
                   dogruCSayisi=0;
                   for (int j = 0; j < soruSayisi; j++) {
                       if ( dogruCevaplar.get(j).contains(ogrCevaplari[i][j])){
                           dogruCSayisi ++;

                       }        else continue;
                   }  System.out.println((i+1) + ". Öğrencinin Doğru sayısı : " + dogruCSayisi + "  Yanlış sayısı : " + (soruSayisi-dogruCSayisi));

               }
           }catch (Exception e){
               System.out.println("Yanlış giriş yaptınız.");
               e.printStackTrace();
           }



       }
}

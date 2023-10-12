package ekim6;

import java.util.Scanner;

public class sezarSifreleme {

    public static void main(String[] args) {
        /*
   2. SORU
Kullanıcı tarafından girilen metni "Sezar Şifreleme Yöntemi" ne göre şifreleyiniz.
Sezar Şifreleme: Sezar şifrelemesi, ilk kez Romalı lider Jül Sezar tarafından kullanılmış olan şifreleme tekniğidir.
Bu şifreleme en basit ve en bilinen şifreleme tekniklerinden biridir.
Düz metindeki her harfin, alfabeden belirli bir sayı ileride konumlu olan bir harfle değiştirildiği bir şifreleme türüdür.
//hello ----> ıfmmp --->1 birim kaydırılmış hali
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz : ");
        String metin = scanner.nextLine();

        StringBuilder sifreliMetin = new StringBuilder();
        char sifre = ' ';
        char s = ' ';
        for (int i = 0; i < metin.length(); i++) {
            sifre = metin.charAt(i);

           if (Character.isLetter(sifre)) {

               s = (char) (sifre + 2);

               // harfin alfabedeki sınırlarını kontrol edelim

               if ((Character.isLowerCase(sifre) && s > 'z') ||
                       (Character.isUpperCase(sifre) && s > 'Z')) {
                   s = (char) (sifre - 24);
               }
               sifreliMetin.append(s);
           }else {
               // harf deilse olduğu gibi eklensin
               sifreliMetin.append(sifre);
           }

        }


        System.out.println(" Sifreli Metin : " + sifreliMetin.toString());


    }
}

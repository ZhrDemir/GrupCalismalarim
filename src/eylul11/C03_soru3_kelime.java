package eylul11;

import java.util.Scanner;

public class C03_soru3_kelime {
    public static void main(String[] args) {

        // kulanicidan bir kelime isteyin
        // eger kelime 3 ve daha fazla harfden olusuyorsa son
        //  iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin

  Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime = scanner.nextLine();

        int harfSayisi = kelime.length();

        if ( harfSayisi>= 3) {
            for (int i = 1; i <=3 ; i++) {

                System.out.print(kelime.substring(kelime.length() - 2)+" ");
            }
        }else System.out.println(kelime);
    }
}


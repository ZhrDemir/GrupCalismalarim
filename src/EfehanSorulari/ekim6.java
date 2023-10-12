package EfehanSorulari;

import java.util.Random;

public class ekim6 {
    public static void main(String[] args) {

/*
 5*5 bir matris olusturun ve bu matrisin elemanları 0 - 9 arasında rastgele sayılar olsun.
 bu matrixi ekrana yazdiran ve capraz sayilarin (sol ussten sag assagiya) toplamini yazdiran bir kod yazin
 rastgele sayilar icin Math class'indan Math.random() kullanabilirsiniz :)
 */

        int [][] arr = new int[5][5];
        int toplam =0;

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.print(arr[i][j]+"   ");
                if (i==j){
                    toplam+=arr[i][j];
                }

            }System.out.println();
        }
        System.out.println("Çaprazların toplamı = " + toplam);






    }
}

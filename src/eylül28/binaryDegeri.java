package eylül28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class binaryDegeri {
    public static void main(String[] args) {
       //  Soru 1: Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
       // Örnek: 12 = 1 1 0 0


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen desimal değer giriniz: ");
        int desimal = scanner.nextInt();

        binary(desimal) ;

    }

    public static List<Integer> binary(int desimal) {

        List<Integer> binaryList = new ArrayList<>();

       int sayi = desimal;
       int kalan = desimal;



          do {

              kalan = sayi % 2;
              binaryList.add(kalan);
              sayi /= 2;
          }
          while (sayi >=1);

        Collections.reverse(binaryList);
     // Integer arr[] = binaryList.toArray(new Integer[0]);
     // System.out.print("Girilen desimal değerin binaryi karşılığı : ");
     // for (int i = binaryList.size()-1 ; i >=0 ; i--) {

     //     System.out.print(" "+ arr[i]) ;



return  binaryList;

    }
}

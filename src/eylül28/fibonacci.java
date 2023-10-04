package eylül28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

       // Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
       // 1-1-2-3-5-8-13-21-34....

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Fibonacci dizisini oluşturmak için pozitif bir tam sayı giriniz: ");
        int sayi = scanner.nextInt();

       List<Integer> fibonacci = new ArrayList<>();

        if (sayi<1){
            System.out.println("Yanlış giriş.");
        } else if (sayi==1 ) {
            fibonacci.add(1);

        } else if (sayi==2){
            fibonacci.add(1);
            fibonacci.add(1);


        }else {
            fibonacci.add(1);
            fibonacci.add(1);

            for (int i = 2 ; i < sayi ; i++) {
                fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i-2)) ;
            }
        }


        System.out.println("ilk " + sayi + " sayının Fibonacci dizisi " + fibonacci);
       // Integer arr[] = fibonacci.toArray(new Integer[0]);
       // System.out.println(Arrays.toString(arr));
    }
}

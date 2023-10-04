package eylül28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fibonacci2 {

    public static void main(String[] args) {

        // fibonacci dizisi hangi sayıya kadar olsun


        Scanner scanner = new Scanner(System.in);
        System.out.println("Fibonacci dizisi hangi sayıya kadar yazılmalı?  ");
        int sayi = scanner.nextInt();
        int fib = 3;
        List<Integer> fibonacci = new ArrayList<>();

        if (sayi == 1) {
            fibonacci.add(1);

        } else if (sayi == 2) {
            fibonacci.add(1);
            fibonacci.add(1);
        } else {
            fibonacci.add(1);
            fibonacci.add(1);

            while (fib < sayi){

                for (int i = 2; i < sayi; i++) {

                    fib = fibonacci.get(i - 1) + fibonacci.get(i - 2);
                    fibonacci.add(fib);
                }

            }

        }
        System.out.print("Girdiğiniz sayıya kadar ki Fibonacci Dizisi : " + fibonacci);
    }
}
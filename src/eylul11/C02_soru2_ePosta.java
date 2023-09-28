package eylul11;

import java.util.Scanner;

public class C02_soru2_ePosta {
    public static void main(String[] args) {

        // e posta iste
        // hotmail içeriyorsa,gmail ile değiştir.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir e posta giriniz:");
        String email = scanner.nextLine();

        if (email.contains("@hotmail.com")){
            System.out.println(email.replaceAll("@hotmail.com","@gmail.com"));

        }else System.out.println(email);
    }
}

package ekim5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ogrtNotu {

    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.

        List<Integer> not=new ArrayList<Integer>();
        Scanner scan=new Scanner(System.in);

        System.out.println("Öğrenci notu girişi için E ye basınız.çıkmak için e dısında herhangi bir tuşa basın");

        char devam=scan.next().toUpperCase().charAt(0);
        double ortalama=0;
        int toplam=0;

        while (devam=='E') {
            System.out.println("Not Giriniz: ");
            not.add(scan.nextInt());
            System.out.println("Öğrenci notu girişi için E  ye basınız.");
            devam=scan.next().toUpperCase().charAt(0);
        }

        System.out.println(not);
        for (int i = 0; i < not.size(); i++) {
            toplam+=not.get(i);
        }
        System.out.println(toplam);
        ortalama=toplam/not.size();
        System.out.println("Girilen notların ortalması: "+ortalama);
        int count=0;
        for (int i = 0; i <not.size(); i++) {
            if(not.get(i)>=ortalama){
                count++;
            }
        }System.out.println(count+" öğrenci ortalamadan yüksek almıştır");

    }

}

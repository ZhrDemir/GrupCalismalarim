package eylül28;

import java.util.Arrays;

public class mountainArray {
    public static void main(String[] args) {
        // MOUNTAIN ARRAY: Verilen herhangi bir arrayin Mountanin Array olup olmadığını kontrol ediniz.
        //Mountain array ==> [0,2,5,3,1]
        //Bir array elemanları en büyük değerine kadar sürekli artan, en büyük değerden sonra sürekli azalan değer alıyorsa "Mountain Array" dir.
        //Mountain array değildir ==>[5,2,7,1,4]

       // int[] arr = {0, 2, 5, 3, 1};

        int [] arr = {5,2,7,1,4};
        boolean flag = true;
        int sayindex = 0;
        int enbuyukDeger = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > enbuyukDeger) {
                enbuyukDeger = arr[i];
                sayindex = i;
            }
        }
        for (int i = 0; i < sayindex; i++) {
            if (arr[i] < arr[i + 1]) {
            } else flag = false;
        }

        for (int j = sayindex; j < arr.length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
            } else flag = false;
        }
        if (flag == true) {
            System.out.println("Girilen Array Mountain Array dir ==> " + Arrays.toString(arr));
        } else {
            System.out.println("Girilen Array Mountain Array değildir ==> " + Arrays.toString(arr));
        }

    }
}








package eylul29;

import java.util.Arrays;

public class ardisikToplam {

            /*
            Verilen arrayin elemanlarını ardışık toplamını hesaplayan metodu yazınız
        input={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
        output={3, 5+1, 2+7+9, 2+3+5+7}
               {3,  6,   18,     17}
             */
            public static void main(String[] args) {
                int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
                //{3,   5+1,   2+7+9,    2+3+5+7}
                int arr2[] = new int[4];

                int toplam = 0, index = 1, sayac = 0;

                for (int i = 0; i < arr2.length; i++) {

                    for (int j = 0; j <= sayac; j++) {
                        toplam += arr[index - 1 + j];//0+3 //5+1=6 //2+7+9 //2+3+5+7

                    }
                    arr2[i] = toplam;//[3,6,18,17]
                    sayac++;//1,2,3,4
                    toplam = 0;
                    index += sayac;//2,4,7,11
                }
                System.out.println(Arrays.toString(arr2));
            }
        }


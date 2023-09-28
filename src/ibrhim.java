public class ibrhim {


            public static void main(String[] args) {
        /*MOUNTAIN ARRAY: Verilen herhangi bir arrayin Mountanin Array olup olmadığını kontrol ediniz.
   Mountain array ==> [0,2,5,3,1]
   Bir array elemanları en büyük değerine kadar sürekli artan, en büyük değerden sonra sürekli azalan değer alıyorsa "Mountain Array" dir.
   Mountain array değildir ==>[5,2,7,1,4]
   */
                int []arr={1,5,7,3,2};
                mountainarraykontrol(arr);
            }
            public static void mountainarraykontrol(int[]arr) {
                int enbüyükdeger=0;
                int index=0;
                int sayac=0;
                for (int i = 0; i <arr.length; i++) {
                    if(arr[i]> enbüyükdeger){
                        enbüyükdeger=arr[i];
                        index=i;
                    }}
                for (int i = 0; i <index; i++) {
                    if(arr[i]<arr[i+1]){}
                    else {sayac++;}
                }
                for (int i = index; i <arr.length-1 ; i++) {
                    if(arr[i]>arr[i+1]){}
                    else{sayac++;}
                }
                if(sayac==0){
                    System.out.println("array mountain arraydir");
                }else System.out.println("array mountain array değildir");
            }
        }


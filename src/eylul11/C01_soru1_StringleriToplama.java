package eylul11;

public class C01_soru1_StringleriToplama {
    public static void main(String[] args) {


        // String şeklinde verilen fiyatları topla
        // String str1 = %13.99
        // String str2 = %10.55.

        String str1 = "%13.9";
        String str2 = "%10.55";

        int fiyatstr1 = Integer.parseInt(str1.replaceAll("\\D",""));
        int fiyatstr2 = Integer.parseInt(str2.replaceAll("\\D",""));

        System.out.println("Toplam Fiyat = " + (double)(fiyatstr1 + fiyatstr2)/100);


    }
}

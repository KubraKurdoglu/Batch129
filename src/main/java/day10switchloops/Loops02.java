package day10switchloops;

import java.util.Scanner;

public class Loops02 {
    public static void main(String[] args) {

        //Example 1: 21 den 180 e kadar olan 4 ve 6 ile bolunebilen sayilari ekrana yazdiriniz

        for (int i = 21; i < 181; i++) {

            if (i % 4 == 0 && i % 6 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();
        // bu yukardaki bos sout examplelerin arasinda bosluk birakti

        // example 2: size verilen kucuk harfle yazilmis Strin in index i cift sayi olan
        // karakterlerini buyuk harf yapiniz
        // ankara==>  AnKaRa
        // string lerle calisirken baslangic karakterinin degerini sifir aliriz
        //cunku index sifir ile basliyor
        // yazdigimiz kod dinamik olmali


        String s = "ankara";


        for (int i = 0; i < s.length(); i++) {

            String ch = s.substring(i, i + 1);

            if (i % 2 == 0) {

                System.out.println(ch.toUpperCase());

            }

        }



    }
}

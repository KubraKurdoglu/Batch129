package nighttime04;

import java.util.Scanner;

public class C01_ForLoopCdenOncekiA {
    public static void main(String[] args) {



       /*
        Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
        'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
       */

        //alacacarnlik==> 2
        // kucuk "c" harfini ilk gordugu yerde duracak

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen 'c'' ve 'a' 'harflerini iceren bir ifade giriniz");
        String str = input.next().toLowerCase();


        int sayac = 0;

        if (str.contains("a") && str.contains("c")) {


            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a') {
                    sayac++;// a'yi gorursen sayacai bir artir
                } else if (str.charAt(i) == 'c') {
                    break;
                }
            }
            System.out.println("c'den onceki a'larin sayisi:" + " " + sayac);

        }else
        System.out.println("lutfen 'c' ve 'a' harflerini iceren bir cumle giriniz");











    }
}












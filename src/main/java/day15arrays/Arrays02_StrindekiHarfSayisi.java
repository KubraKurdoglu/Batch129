package day15arrays;

import java.util.Arrays;

public class Arrays02_StrindekiHarfSayisi {
    public static void main(String[] args) {


        //Example 2: Bir Stringdeki sesli harflerin sayisini bulan kodu yaziniz
        //           a - e - i - o - u - A - E - I - O - U


        String s = "Java brings you money";

        //1.YOL avec replaceAll

        int vowels=s.replaceAll("[^aeiouAEIOU]","").length();//int yaptik cunku lenght bize int verir

        System.out.println(vowels);

        //2.YOL avec Arrays - Loop

        String letters[] = s.split("");// "hiclikten" kestik dedi hoca, cunku space den kesersek yanlis olurdu
        System.out.println(Arrays.toString(letters));//[J, a, v, a,  , b, r, i, n, g, s,  , y, o, u,  , m, o, n, e, y]

        //split methodu bize arrays verir
        // for each loop kullaniyor burda, gelismis diye

        int counter = 0;// sesli harfleri sayacagimiz icin counter olusturdu


        for(String w : letters){
            switch (w.toLowerCase()){// ihtimaller 2'den fazla old icin switch kullandi
                //buyuk harfleri bir daha yazmamak icin tolowercase kullandi

                case "a":
                case "e":
                case "i":
                case "o":
                case "u":

                    counter ++;

            }

        }
        System.out.println(counter);







    }
}

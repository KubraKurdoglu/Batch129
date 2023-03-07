package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {
    public static void main(String[] args) {

        //Example 1: String Array elemanlarini uzunluklarina gore kucukte buyuge dogru siralayiniz
        // ["Michael", "Ajda", "Thomas", "Tom"]==> ["Tom","Ajda",Thomas","Michael"]
        // alfabetik sira istemiyor uzunluklarina gore istiyor

        String arr[] = {"Michael", "Ajda", "Thomas", "Tom"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Comparator.comparingInt(String::length));

        //burdaki arr comparator'u sort kismindan cektik
        //yukardaki kodun son kisminda ise string'e gir lenght'ini al dedik
        //::==> bunun anlami "method referance" yani bir metodu kullan
        //::==>bir class'taki methoda ulasmak icin bunu kullaniriz
        //::==>bununla birlikte farkli methodlarda kullanabiliriz
        //:: ==> kutuphanenin kapisini aciyor
        //karakter sayilarina gore siralayacagimiz icin comparator.int kullandik
        //comparator ==> karsilastir demek
        // biz java ya diyoruz ki, elemanlari sirala ama benim verecegim kurala gore sirala
        // comparator==> bize siralama kuralini bizim verme sansimizi saglar
        // yukardaki soruda "comparingInt" kullandi cunku int karakter sayisindan dolayi
        // biz karakter sayili bir siralama istedik

        System.out.println(Arrays.toString(arr));


        //Example 2: String Array elemanlarini character sayisina gore buyukten kucuge siralayiniz.
        //          ["Michael", "Ajda", "Thomas", "Tom"] ==> ["Michael", "Thomas", "Cuneyt", "Ajda", "Tom"]


        String brr[] = {"Michael", "Ajda", "Thomas", "Tom", "Cuneyt"};
        System.out.println(Arrays.toString(brr));


        Arrays.sort(brr, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(brr));
        //yukarda "reversed" siralamayi tersten yapti

        //Example 3: String Array elemanlarini character sayisina gore buyukten kucuge siralayiniz.
//           Ayni character sayisinda olanlari da alfabetik siraya koyunuz.
//          ["Michael", "Ajda", "Reyhane", "Gabriel","Thomas", "Cuneyt", "Tom", "Ali", "Cin", "Cem"]
//          [ "Gabriel", "Michael", "Reyhane", "Thomas", "Cuneyt", "Ajda", "Ali", "Cem", "Cin", "Tom"]

        //Dikkat yukardaki soruda diyorki " 6 HARFLI olanlari kendi icinde alfabetik sirala;
        // 4 harfli olanlari kendi icinde alfabetik sirali, " HARFLI OLANLARI DA KENDI ICINDE ALFABETIK
        //SIRALA




        //hem buykten kucuge dogru hemde alfabebtik sirala
        // ama once buykten kucuge dogru sirala sonra onlari da alfabetik sirala



        String crr[] = { "Michael", "Ajda", "Reyhane", "Gabriel","Thomas", "Cuneyt", "Tom", "Ali", "Cin", "Cem" };

        System.out.println(Arrays.toString(crr));


        Arrays.sort(crr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));

        //yukarda dedik ki once reversed yap, yani buyukten kucuge diz
        //sonra "then" ile iceri gir naturalorder ile bu srilamayi lafabetik yap

        //burda method lari arka arkaya kullandik
        // thenComparing ile iceri girdik, her bir array'in elemanlarini da kendi icinde alfabetik siraladik
        //ilk yapacagi is "reversed" yani bukten kucuge diz
        // bundan sonra ise "natural order yap" yani alfabetik siralama yap


        //fonctional Prpgraming==> java'nin olusturdugu methodlari kullanmak, saglam yol.
        //fonctional programing==lampda
        //reversed==> buyukten kucuge diz
        //thencomparing==> iceri gir iceriyi de duzenle
        //Comparator.naturelorder==> iceride dogal siralama yap; yani alfebetik siralama yap
        // hem buyukler hemde kucukler icin ayri ayri siralama yapti










    }
}

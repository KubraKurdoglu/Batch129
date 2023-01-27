package day17arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList01 {


        /*
        1) ArrayList'ler coklu data depolamak icin kullanilir
        2) ArrayList'ler non-primitive data tipindei coklu datalari depolamak iicn kullanilir.
        List'ler non-primitive data kabul ederler, Array'ler ise primitive data veya referance kabul ederler
        UNUTMA! Array'lerin icine non-primitive data koyamiyorduk ama adreslerini yani referanslarini koyabilirsin
        fakat ArrayList'te direk non-primitive de koayabilirsin
        3)ArrayList'leri olusturuken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur
        ArrayList(List)'ler eleman sayisinda "flexible"dirlar, ama arrays'ler flexible degildirler
        4) madem Array'ler eleman sayisinda flexble degil nicin java Arryas'leri iptal etmedi
        (dunyada eleman sayisi belli datalarda var, mesela haftadaki gun sayisi, yildaki ay sayisi...)

        Eleman sayisi belli olanlari kullanmak icin Array kullanilir.
        ** Arrays'ler cok hizli calisirlar
        ** Arrays'ler memory de cok az yer kaplarlar

        bu nedenlerle eleman sayilari belli olanlari Array'e koyuyorlar
        normalde Arry de yazilan bir sey ArrayList'de de yazilir fakat
        yukarda yazdigimiz sebeplerden Array; sayilari belli olan seylerde kullanilir



         */
    /*
    Array ile ArrayList'in farki nedir?

1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini
  soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz.
  Array'ler eleman sayisinda "fixed" dirler.
  ArrayList'leri olustururken eleman sayisi soylemeye gerek yok,
  cunku ArrayList'ler eleman sayisinda "flexible"(esnek) dirlar.
2)Array'lerin icine "primitive" ve "reference" lar konabilir.
  ArrayList'lerin icine ise sadece "non-primitive" ler konulur.
3)Array'ler super fast, cok hizli. Array'ler memory i cok az kullanir.
  Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin
  Array kullaniriz, ama eleman sayisi degisken olan coklu datalar icin
  Array kullanma riskini almayin
     */


    public static void main(String[] args) {


       // List nasil olusturulur

        ArrayList<Integer> ages = new ArrayList<>();


        //List'lere eleman nasil olusturulur
        //LIst'ler aktif yapilar oldugu icin bir cok yontem ekleyebiliriz
        // List'leri yazdirmak icin sout ve List'in adini yazmak yeterli
        // eleman eklerkende List'in adini yaz nokta koy add methodu ile elaman ekle
        // list sizin verdiginiz siraya gore elemanlari ekler
        // List'e eleman eklemeye "Insertion Order" denir.
        // cunku java bizim siralamamiza onem veriyor

        ages.add(9);
        ages.add(10);
        ages.add(12);
        ages.add(888);

        System.out.println(ages);

        //yukardaki listenin ortasina bir elaman eklemek istedigim zaman "add " methodunun indeksli
        //olanini KULLAN
        //add index birer birer ekler

        ages.add(1,656);
        ages.add(3,777);
        System.out.println(ages);

        // en sona eleman eklemeni istedikleri zaman yine indeksiz "add" kullanmalisin


        //bir list 'in icine coklu elemn eklemek icin veya
        // bir list 'i baska bir list' e eklemek icin ne yapmali
        // o uc eleman icin bir list olustrurmali ve o elemanlari o list'in icine koymalisin


        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2,newAges);
        System.out.println(ages);


        // " addAll" en sona ekler
        // "addAll" indeks li olan, istedigin indekse ekler


        //"toArray()" list'i Array'e cevirir.
        //array'in hizindan memory'i az kullanmasindan istifade etmek istiyorsak kullaniriz
        // eleman sayisini degitirmeyecegimizden eminsek array' ye cevirip memory kullnimini azaltabiliriz
        //clear()==> siler, datalarin hepsini siler, bu kodu calistirirsan bos bir list gorursun

        //ages.clear(); yaparsan altta yazdirma satirinda hicbir sey goremezsin
        //System.out.println(ages);

        //"contains()" Methodu bir eleman var mi wok mu diye bakiyor


        boolean r = ages.contains(656);
        System.out.println(r);


        //bir List'in baska bir List ile ayni olup olmadigini  nasil kontrol ederiz
        // yeni iki tane list olusturacagiz
        // iki list'in esit olabilmesi icin ayni indekste ayni elemanlar olamalidir

        ArrayList<String> names1 = new ArrayList<>();

        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();

        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s = names1.equals(names2);
        System.out.println(s);

        // iki List'in ayni olmasi icin iki List'te de ayni Index'te ayni elemanlar olmalidir
        // bu esitlik kuralidir
        // index(0)'da "Tom" ise diger lIST'DE de Index(0)'da "Tom3 olamli



        //Example 1: verilen iki Integer list'te tamamiyla ayni elemanlarin olup olmadigini
        //           kontrol eden kodu yaziniz
        // burda DIKKAT iki list esit olsun demiyor
        // iki list'teki elemanlar esit mi diyor



        ArrayList<String> nums1 = new ArrayList<>();

        nums1.add("8");
        nums1.add("10");
        nums1.add("9");


        ArrayList<String> nums2 = new ArrayList<>();

        nums2.add("8");
        nums2.add("9");
        nums2.add("10");

        Collections.sort(nums1);

        Collections.sort(nums2);


        boolean k = nums1.equals(nums2);
        System.out.println(k);

        //Collections==> coklu datanin bir araya konmasi demek
        //collections'a gidip Arrays'ler icin methodlar kullanabiliriz
        //Collections'larda bir cok method var
        // yukarda iki lists'te de ayni elemenlar var
        // once siraladik sonra karsilastirdik
        // soruyu iyi analiz etmek gerekyor
        // iki list esit mi diye sormuyor bize elemanlari esit mi diye soruyor









    }
}
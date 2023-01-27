package day32collections;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {


        //Note: TreeSet eleman ekleme'de cooook yavas, HashSet is cooook hizlidir.
        // TreeSet'in bu negatif yonunden kurtulmak icin; HashSet olusturur elemanlari ekler
        // ve sonra HashSet'i TreeSet'e ceviririz.


        long one = System.nanoTime();// her iki yapilan isin sure farkini almak icin yazdik
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(12);
        ts.add(25);
        ts.add(8);
        ts.add(32);
        ts.add(3);

        System.out.println(ts);//natural order yapiyor==>[3, 8, 12, 25, 32]


        long two = System.nanoTime();

        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);

        TreeSet<Integer> hts = new TreeSet<>(hs);//Hashset'i treeSet'e cevirdi, boylelikle hashset'in hizindan faydalandi
        //aslinda artik treeSet oldu ama Hashset'e cevrildi.
        System.out.println(hts);// treeSet ile ayni siralanmis listeyi verecek.

        System.out.println(hs);//rastgele siralayacak(random)
        //treeset'ler cok yavas calisir, cunku natural siralarlar

        long three = System.nanoTime();

        System.out.println("ThreeSet'in uygulama suresi: "+ (two-one));// 944888
        System.out.println("HashSet'in uygulama suresi: "+ (three-two));//531563

        int first = ts.first();
        System.out.println(first);//3

        int last = ts.last();
        System.out.println(last);//32


        //florr==> ingilizcede zemin demek, verdigin degerin bir altini aliyor. yani bir kucugunu aliyor.
        //15==> elemanlardan biri degil o yuzden bir onceki elaman yazdirildi.
        int floor = ts.floor(15);
        System.out.println(floor);

        //floor'da var olan degeri verirsen o degeri verir, "kendisini" verir.

        int floor2 = ts.floor(12);
        System.out.println(floor2);//12 verir. yani kendini verir var olan elamanin

//floor() method'unda kullanabileceginiz sayi en kucuk elemandan az olamaz
        //int floor3 = ts.floor(2);// bunu yazdirirsan "nullPointer" hata verir. cunku kullanacagin sayi
        // en kucuk elemandan az olamaz.
        //System.out.println(floor3);==> nullPointerException


        //ceiling==> cati demek , bunu methodu kullanirsan verdigin degerden bir osnraki elemani yazdirdi.
        // eger ceilling methodunda var olan mesela 25 gibi bir elamani istersen, onu direk kendini yazdirir.

        int ceiling1 = ts.ceiling(15);
        System.out.println(ceiling1);

        int ceiling2 = ts.ceiling(25);
        System.out.println(ceiling2);

        //Note:"ceiling()" method'unda kullanabilceginiz sayi en buyuk elemandan fazla olamaz.

       SortedSet<Integer> tailSet1= ts.tailSet(12);
        System.out.println(tailSet1);//[12, 25, 32]==>verdiginiz sayi ve onun buyuklerini yazdirir. 12 elemanlardan biri ve
        //12 ve sonraki elemanlar bir set icinde yazdirildi


        SortedSet<Integer>tailSet2 = ts.tailSet(15);
        System.out.println(tailSet2);//[25, 32]==>15 elemanlardan biri degil o yuzden 15 den  sonraki elemanlar bir
        // Set icinde yazdirildi


        NavigableSet<Integer> tailSet3 = ts.tailSet(12,false);//==>[12, 25, 32] bu tailSet'in farkli bir uygulamasi
        //verdigin elemani vermiyor, ondan sonraki elemanlari gosteriyor.
        //ama dikkat et "FAlse" yazdik. bu su demek verdigim elemani gosterme. "true" yazsaydik elemani gosterecekti.

        NavigableSet<Integer> tailSet4 = ts.tailSet(12,true);//[25, 32]


        //DIKKAT ET==> herbir set modeli farkli bir seyi "return" ediyor.  yani;
        //bazisi " NavigableSet", bazisi "SortedSet" vs.
        // bunu da methoda bakarken ne return ediyor bakarak almalisin

        SortedSet<Integer>headSet1 = ts.headSet(12);
        System.out.println(headSet1);//[3, 8]==>12 elemanlardan biri "onceki elemanlar"  bir Set icinde yazdirildi,
        // 12 yazdirilmadi


        SortedSet<Integer>headSet2 = ts.headSet(12,true);
        System.out.println(headSet2);//[3, 8, 12]


        //Generic Method:Normal method'lar parametrelerde belirtilen data type'lari ile calisirlar.
//               Generic Method'lar ise verilen her turlu data type ile calisma becerisine sahiptirler.

        Integer higher1 = ts.higher(12);
        System.out.println(higher1);//25 ==> 12 den bir sonraki elemani verir.elemanin kendisini vermez

        Integer lower1 = ts.lower(12);// buraya hoca Integer yazdi. treeSet'in list'i Integer. kafamiz karismasi diye
        //ama "int" de calisabilir . unboxing ile. Wrapper class ile primitive class her zaman birbirinin yerine kullanilabilir
        // ama buna gerek yok
        System.out.println(lower1);//8==>12 den bir onceki elemani verir.














    }
}

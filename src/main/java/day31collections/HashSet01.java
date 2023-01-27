package day31collections;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {


        /*
        "Hash" bir tekniktir, Java bu tekniği kullanarak benzersiz datalar üretir.
        "Set" tekrarsız data depolamak icin kullanilan bir Collection'dir.
         Set tekrar kabul etmez. Yani; tekrarsız verileri depolamak için kullanılır.

         "Set" ler 3 e ayrilir;
            i)HashSet: a) Super hizlidir, cunku HashSet'ler veridiginiz elemanlari siralamak icin zaman kaybetmez
                          yani; HashSet'lere eklenen elemanlar rastgele siralanirlar.
                       b)HashSet'ler tekrarli elemana musaade etmezler.
                       c)HashSet'ler sadece 1 tane "null" i eleman olarak kabul ederler.
            ii)LinkedHashSet: a)LinkedHashSet elemanlari "insertion order" a gore dizer.
                              b)LinkedHashSet elemanlari siralamakta zaman kaybettigini icin, HashSet'e gore yavastir.
                              c)LinkedHashSet'ler tekrarli elemana musaade etmezler.
            iii)TreeSet: a)TreeSet elemanlari "natural order"(Kucukten buyuge veya alfabetik sira) a gore dizer.
                         b)TreeSet, "natural order" yaparken cok zaman harcar o yuzden en yavas "Set" dir.
                         c)TreeSet'ler tekrarli elemana musaade etmezler.
     */

        /*
        Collections'lari coklu eleman depolamak icin kullaniriz
        Hash bir tekniktir biz bu teknigi kullanarak unique data'lar uretiriz (Benzersiz)
        Mesela universitenin olusturdugu ogrenci numarasi olusturma islemine hash code islemi denir
        IT de set kelimesini duyarsaniz tekrar yok demektir
        Mesela e-mail depolayan bir DB icin HashSet en iyisidir
         */

        //IT==> dunyasinda "tree" gorursen "siralama" gelsin aklina
        // "insertion order"==> verileri giris sirasina gore siralama
        //" natural order" ==> numeric ve alfabetik siralamadir. "natural order" cok zahmetlidir.
        // treeset naturaloreder yaparken cok zaman harcar o nedenle cok zaman harcar.


        HashSet<Integer> hs = new HashSet<>();

        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(5);

        System.out.println(hs);//[5, 234, 12, 78] ==> gordugun gibi elemanlar "random" (rastgele) bir siralandi.


        int hc = hs.hashCode();// "hs" nin hashcode'unu bulmak icin boyle yazdi
        System.out.println(hc);//329===> hs'nin hashcode'u 329 ve ayn zamanda hs'nin tum elemanlarinin ayri ayri hashcode'u var

        //methodlari gordugunde bazi methodlarin koyu renkli oldugunu farkedersin
        // bunlar hashset class'in kendi kodlari.
        //soluk renkli olanlar, miras aldiklari


    }
}

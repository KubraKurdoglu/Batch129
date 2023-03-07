package day31collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {


        /*
        1)interface'lerden object olusturulamaz cunku interface'lerin constructor'i yoktur.
        2)Abstract Class'lardan object olusturulamaz, constructor'lari vardir ama constructor
        object olusturmada kullanilamaz.
        3)interface'lerin constructor'lari olmadigindan collection olustururken interface isimleri
        "new" keyword'unden sonra kullanilamaz.
        4)*class --> class ==> extends
           class --> interface ==> implements
          *interface --> interface ==> extends
           interface --> class ==> Bu mumkun degildir
        5)LinkedList’ler index kullanmadiklarindan eleman silmede ve eklemede re-index
           yapilmasina gerek yoktur. Bu da LinkedList’leri eleman ekleme ve silmede cok basarili
            hale getirir. Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken durumlarda
            LinkedList kullanmak tavsiye edilir.
         6)ArrayList'ler eleman silme ve eleman eklemede basarisizdirlar o yuzden eleman silme
         ve ekleme islemleri coklukla
   yapilacaksa ArrayList kullanmak tavsiye edilmez.
          7) 6)LinkedList'lerde eleman yerine "Node" kelimesi kullanilir. En bastaki Node'a
          "Head", en sondaki Node'a "Tail" denir.
          8)ArrayList'lerde "search" islemi kolay yapilir cunku index'ler adres gibidir.
          9)LinkedList'lerde "search" islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.
         */

        //NOT:Array List ler eleman silme - eklemede basarisizdirlar. Bu yuzden eleman silme-ekleme islemleri coklukla
        //yapilacaksa ArrayList tavsiye edilmez.

    public static void main(String[] args) {

        List<String> cityNames = new LinkedList<>();

        LinkedList<String> names = new LinkedList<>();

        names.add("Steve");
        names.add("Ajda");
        names.add("Raj");
        names.add("Megan");
        names.add("Bandon");
        System.out.println(names);//[Steve, Ajda, Raj, Megan, Bandon]

        names.addLast("Ajda");//addlast() method==> is equivalent to add.
        System.out.println(names);//[Steve, Ajda, Raj, Megan, Bandon, Ajda]

        names.addFirst("Cuneyt");
        System.out.println(names);//[Cuneyt, Steve, Ajda, Raj, Megan, Bandon, Ajda]

        names.add(3,"Suleyman");
        System.out.println(names);//[Cuneyt, Steve, Ajda, Suleyman, Raj, Megan, Bandon, Ajda]


      //remove("Ajda");==> remove()'un object'li methodu, silinmesi gereken seyin ilk gorunumunu siler.
        names.remove("Ajda");
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Megan, Bandon,Ajda]


        names.remove(4);
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Bandon, Ajda]


        names.add("Suleyman");
        names.add("Suleyman");//add()==> en sona ekler
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Bandon, Ajda, Suleyman, Suleyman]

        String r1 = names.remove();// ici bos remove() methodu, ilk elemani siler(cut+paste)
        System.out.println(r1);//Cuneyt
        System.out.println(names);//[Steve, Suleyman, Raj, Bandon, Ajda, Suleyman, Suleyman]


        names.removeFirstOccurrence("Suleyman");
        System.out.println(names);//[Steve, Raj, Bandon, Ajda, Suleyman, Suleyman]

        names.removeLastOccurrence("Suleyman");// son suleymani sildi
        System.out.println(names);//[Steve, Raj, Bandon, Ajda, Suleyman]


        String r2 = names.peek();//ilk elemani veriyor ama silmiyor.(copy+paste)
        System.out.println(r2);
        System.out.println(names);

        //Retrieves and removes the head (first element) of this list.
        //Returns: the head of this list
        //(Cut+ paste) yapar
        //remove() bos LinkedList'te klllanilirsa "hata verir", poll bos Linkedlist'te kullanilirsa "null" verir.
        names.poll();



        //Pop removes and returns the first element of this list.(Cut + Paste)
        //This method is equivalent to removeFirst().

        names.pop();



    }

}

package day33maps;

import java.util.*;

public class HashMaps01 {
    public static void main(String[] args) {

        /*
  1) Map'lerde "USA = 400,000,000" seklinde data depolamamiz gerektiginde kullanilir.
  2) "USA = 400,000,000" datasinin "USA" kismi "key" olarak adlandirilir ve key'ler "unique" dir
  3) "USA = 400,000,000" datasinin "400,000,000" kismi "value" olarak adlandirilir ve value'lar "tekrarli" olabilir.
  4)Map'lerde depoladiginiz her bir data'ya "Entry" denir, "Eleman" denmez.
  5) "HashMap" cok hizlidir cunku "HashMap" ler siralama ile ugrasmazlar.
  4) Map'lerde depoladiginiz her bir data'ya "Entry" denir, "Eleman" denmez.
5) "Entry" ler "unique" dir cunku key kisimlari unique oldugundan her bir "Entry" digerlerinden farklidir.
6) "HashMap" cok hizlidir cunku "HashMap" ler "entry" leri siralamak ile ugrasmazlar.
7) "HashMap" lerde bir tane "key" i "null" yapabilirsiniz.
8) "HashMap" lerde birden fazla "value" yu "null" yapabilirsiniz.
cunku "value"ler coklu olabiliyor
9) "HashMap" ler "multi thread" icin kullanilamaz ve "synchronization" yoktur.


 */


        /*sozluk yapisi map'a benzer
solda kelime, sagda aciklamasi vardir
soldakiler tekrarli olamaz sagda tekrar olabilir
map te boyledir soldakiler Unique (yunik) olacak sag taraf tekrarli olabilir de olmayapilir repeatedly (tekrarli) olabilir
cat = evcil hayvan
dog = evcil hayvan
crocodile = timsah
tiger = kaplan
solda data sagda data
map deyince sozluk akla gelsin
sola unique lere key tekrarli olabilen sagdaki data lara value denir

map te bir data stractir dir
depolarken bu yapiya ihtiyac varsa map kullaniriz
mesela ulkeler ve nufuslarini depolamamiz lazim burda sol unique sag tekrarli olabilir burda map kullaniriz
mesela okul app imiz var ogrencilerin karne ort ni depolayacagiz sol unique sa[ tekrarli olabilir burda map kullanilmalidir



         */

        //HashMap nasil olusturulur?

        HashMap<String, Integer> hm = new HashMap<>();
        System.out.println(hm);

        //HashMap'e entry "put" ile eklenir.

        hm.put("USA", 4000000);
        hm.put("Germany", 85000000);
        hm.put("Albania", 30000000);
        //Ayni "key"i kullanarak yeni bir "entry" eklerseniz var lan "value" u update etmis olursunuz.
        hm.put("Albania", 280000);
        hm.put(null, 1200000000);
        hm.put(null, 230000);
        hm.put("Myanmar", null);
        hm.put("Bhutan", null);
        System.out.println(hm);//{null=230000, Myanmar=null, USA=4000000, Bhutan=null, Germany=85000000, Albania=280000}

        //HashMap'lerde sadece "key"leri almak istiyorum. bunun icin "keyset" kullanmak lazim.
        // keySet methodu bize "set" verecek. "set" veriyor cunku tekrarsiz, array vs. vermiyor.

        Set<String> hmKeys = hm.keySet();
        System.out.println(hmKeys);//[null, Myanmar, USA, Bhutan, Germany, Albania]==> burda bize set olarak verdi.
        //set oldugunu nerden anladik? parantezinden anladik.



        //HashMap'lerde sadece "value" lari almak nasil olur?
        //Example 1: hm Map'indaki ulkelerin toplma nufusunu bulunuz

        Collection<Integer> hmValues =  hm.values();

        int sum=0;

        for (Integer w : hmValues){

            if (w!=null){
                sum += w;
            }
        }
        System.out.println(sum);


        Integer usaPopulation = hm.get("USA");
        System.out.println(usaPopulation);//4000000

        hm.replace("Bhutan", 120000);
        System.out.println(hm);//{null=230000, Myanmar=null, USA=4000000, Bhutan=120000, Germany=85000000, Albania=280000}
        //Bhutan'i degidtirdi.

        hm.putIfAbsent("USA", 7000000);//bu method bizim map'imizde usa yoksa 700000 koyacak ama varsa hicbir sey yapmayacak.
        System.out.println(hm);//{null=230000, Myanmar=null, USA=4000000, Bhutan=120000, Germany=85000000, Albania=280000}

        //USA zaten var oldugu icin onda hicbir degisiklik yapmadi.


        hm.putIfAbsent("Indian", 7000000);//bu method bizim map'imizde usa yoksa 700000 koyacak ama varsa hicbir sey yapmayacak.
        System.out.println(hm);//{null=230000, Myanmar=null, USA=4000000, Bhutan=120000, Indian=7000000, Germany=85000000, Albania=280000}

        //"Indian" i ekledi

        //example 2: Yeni ogretmenin maasi stnadart ucretten 1000 TL fazla, eski
        // ogretmenin maasi standart ucretten 2000TL fazla olsun

        HashMap<String, Integer> salaries = new HashMap<>();

        salaries.put("Ali", 8000);
        salaries.put("Ayse", 5000);
        salaries.put("Veli", 9000);
        salaries.put("Tom", 9900);

        String teacherName = "Kemal";// buraya "kemal" yazarsan kemal yeni olacagi icin maasi 11000 olacak.
        // ama "tom" yazinca 12000 olacak, cunku eskilerin maasi 12000 olacak.


        if(salaries.keySet().contains(teacherName)){//burasi su demek "salaries"in arasina bak "kemal" varsa 12000, yoksa 11000 koy.
            salaries.putIfAbsent(teacherName, 12000);
        }else {
            salaries.put(teacherName, 11000);
        }

        System.out.println(salaries);


        hm.replace("USA",4000000, 500000);
        System.out.println(hm);//{null=230000, Myanmar=null, USA=500000, Bhutan=120000, Indian=7000000, Germany=85000000, Albania=280000}

        Integer r =hm.getOrDefault("Bhutan",0);//bhutan varsa onun nufusunu verecek, bhutan yoksa "0" verecek
        System.out.println(r);//120000

        Integer s =hm.getOrDefault("Thutan",0);//Thutan yok, "0" verecek, 0 yerine baska bir deger koyarsan onu verir.
        System.out.println(s);//0


        Integer k = hm.size();//boyutunu verdi
        System.out.println(k);


        //entrySet(); methodu "Map"i "Set"e cevirir.
        //Setlerin methodlarini kullanabilmek icin entrySet(); methodunu kullanarak Map'i Set'e cevirebiliriz
        //Map'i Set'e cevirdigimizde Set'in butun ozelliklerini kullanabiliriz. Mesela loop gibi.
        //entrySet(); method'unu kullandiginizda elde ettiginiz Set'in elemanlari "Map.Entry<String,Integer>" seklinde bir Map olur.
        //Bu yuzden elemanlar icin Map method'lari kullanilabilir.



        Set<Map.Entry<String,Integer>> myEntries = hm.entrySet();// bu butun entry'leri set'in icinde verecek.
        //yani map'i Set'e cevirdi.

        System.out.println(myEntries);//[null=230000, Myanmar=null, USA=500000, Bhutan=120000, Indian=7000000, Germany=85000000, Albania=280000]

        //Example 3: ulke ismindeki karakter sayisini ulke nufusuna ekleyen ve sonucu konsola yazdiran kodu yaziniz.

        //MAP'lERDE LOOP KULLANMAZSANIZ. ENTRY SET METHODU ILE "SET" E CEVIRIP OYLE LOOP KULLLANILABILIR.


        for (Map.Entry<String,Integer> w: myEntries) {

            if (w.getValue() != null && w.getKey() != null) {


                int toplam = w.getValue() + w.getKey().length();

                System.out.println(toplam);

            }
        }















    }
}

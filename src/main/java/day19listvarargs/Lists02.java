package day19listvarargs;

import java.util.*;

public class Lists02 {
    public static void main(String[] args) {

        /*
        Rastgele kullanici adi olusturan JAVA kodu yaziniz.
       1. Kullanicidan ismini isteyelim
       2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
       3. Kullanici adinin alinabilir olup olmadigina bakalim.
       4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
       5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
       */
        //trim() boslulari silerdi unutma
        // ortada kalan space'leri silmezdi
        //Math.random()==> 0 ile 1 arasinda rastgele sayi verir, mesela==>0.2
        //Math.random()==> 0'da dahil tum sayilari verir, fakat "1" haric
        //Math.random()*100==> bununla ise verilen o sayisi yuz ile carpiyor
        // rastegele sayilar hep double geliyor, onu integer'a cevirmek icin "int" koydu
        //



        List<String> databaseIsim = new ArrayList();
        databaseIsim.add("AYSE");
        databaseIsim.add("AHMET");
        databaseIsim.add("SERDAR");
        databaseIsim.add("OKAN");
        databaseIsim.add("BETUL");

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen kullanici adinizi giriniz..");
        String userName = input.nextLine().trim().toLowerCase();

        int random = (int)(Math.random()*100);

        //Random olusturmak icin ikinci yol

       // int random = new Random().nextInt()*100;

        //ASAGIDKI WHILE DONGUSUNUN ANLAMI; randomlu username daha once secilmis ise yeni bir random belirle

        while (databaseIsim.contains((userName+random))){
            random = (int)(Math.random()*100);
        }

        if(databaseIsim.contains(userName) || databaseIsim.contains(userName + random)){

            System.out.println("bu username database de var, tekrar kullanilmaz");
            databaseIsim.add(userName+random);

        }else{
            System.out.println("Bu username kullanilabilir");

        }


        //username yani bir username ise, hemen ekliyor
        // yeni degilse uyari veriyor






    }
}

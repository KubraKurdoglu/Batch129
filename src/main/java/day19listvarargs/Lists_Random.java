package day19listvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists_Random {
    public static void main(String[] args) {

        /*
        Rastgele kullanici adi olusturan JAVA kodu yaziniz.
       1. Kullanicidan ismini isteyelim
       2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
       3. Kullanici adinin alinabilir olup olmadigina bakalim.
       4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
       5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
       */

        List<String> kullaniciAdi = new ArrayList<>();

        kullaniciAdi.add("AYSE");
        kullaniciAdi.add("FATMA");
        kullaniciAdi.add("ZEHRA");
        kullaniciAdi.add("FERIHA");
        kullaniciAdi.add("KUBRA");

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kullanici adinizi giriniz..");

        String userName= input.nextLine().trim().toUpperCase();

        int random = (int)(Math.random()*100);//RANDOM'DAN SAYILAR hep double geliyor, onlari int yapmak icin type casting yapti


        while (kullaniciAdi.contains((userName+random))){
            random = (int)(Math.random()*100);
        }

        if (kullaniciAdi.contains(userName)|| kullaniciAdi.contains(userName+random)){

            System.out.println("Bu username database'de var, bir daha kullanilamaz");

            kullaniciAdi.add(userName+ random);

        }else {
            System.out.println("bu username kullanilabilir");
            kullaniciAdi.add(userName);
        }
        System.out.println(kullaniciAdi);




    }
}

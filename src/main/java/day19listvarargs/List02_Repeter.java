package day19listvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List02_Repeter {
    public static void main(String[] args) {

         /*
        Rastgele kullanici adi olusturan JAVA kodu yaziniz.
       1. Kullanicidan ismini isteyelim
       2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
       3. Kullanici adinin alinabilir olup olmadigina bakalim.
       4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
       5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
       */


        List<String> databaseIsim = new ArrayList();
        databaseIsim.add("AYSE");
        databaseIsim.add("AHMET");
        databaseIsim.add("SERDAR");
        databaseIsim.add("OKAN");
        databaseIsim.add("BETUL");

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen kullanici adinizi giriniz");

        String userName = input.nextLine().trim().toUpperCase();

        int random = (int) (Math.random()*100);

        while(databaseIsim.contains(userName+random)){
            random = (int) (Math.random()*100);
        }

        if (databaseIsim.contains(userName) || databaseIsim.contains(userName+random)){
            System.out.println("girdiginiz kullanici adi zaten mevcuttur");

            databaseIsim.add(userName+random);
        }else{
            System.out.println("gecerli ve data da bulunmayan bir username girdiniz");

        }
        System.out.println(databaseIsim);






    }
}

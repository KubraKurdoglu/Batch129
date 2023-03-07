package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {


        //Example 1: kullanicinin verdigi sayi icin carpim tablosunu olusturup consol a yazdiran kodu yaziniz
        // 3==>  3*1=3 3*2=6 3*3=9.....3*10=30 (burda tek degisen sey 1,2,3,4,...,10 bir den baslayip
        //10'a kadar gideceksin
        //artan tek deger bu olacak
        //carpim tablolari negatif sayilar icin duzenlenmez
        // ama biir kisi istedigi icin hoca yapti

        Scanner input = new Scanner(System.in);
        System.out.println("carpim tablosunu girmek icin bir sayi giriniz");
        double num=input.nextDouble();

       int i = 1;

      while(i<11){
          System.out.println(num + "x" + i + "=" + (num*i));

          i++;
      }

     // burda sonuc olarak 3.0x10=30.0 seklinde yapti
        // bunu engellemek istersen double degerini int ve input.nextInt seklinde yapabilirsin

        //Example 2: kullanicidan alinan bir String'in her harfin sonrasina yildiz '*' sembolu ekleyiniz
        // Java==> J*a*v*a
        // yukarda sacnner actigimiz icin tekrar acmadik
        // bir de baslangic degeri olarak "i" vermedik, cunku "i" yi yukarda verdik
        // deger olarak "0" verdik cunku indeks 0'dan baslar

       System.out.println("bir kelime giriniz");
       String word = input.next();
       String newWord= "";
       int k=0;

        while (k < word.length()) {


            newWord = newWord +word.charAt(k) +"*";


            k++;
        }
        System.out.println(newWord);


























    }
}

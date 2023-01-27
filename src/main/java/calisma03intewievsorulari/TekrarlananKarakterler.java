package calisma03intewievsorulari;

import java.util.Scanner;

public class TekrarlananKarakterler {
    public static void main(String[] args) {
        /*
    Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
            char ch= 'e' ;
            String name ="Sevecen"
            => Tekrar Sayisi = 3

     */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim = scan.next();

        System.out.println("lutfen bir harf giriniz");
        char karakter =scan.next().charAt(0);

        int sayac = 0;

        for(int i = 0; i<isim.length(); i++){
            if(isim.charAt(i)==karakter)
              sayac++;


        }

            System.out.println("tekrar sayisi "+ sayac);




    }
}

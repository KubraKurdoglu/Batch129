package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManupulations03 {

    public static void main(String[] args) {

        /*
        example 1: asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz.

              kurallar
              i) en az sekiz karakter olsun
              ii) space karakteri olmasin
              iii) en az bir tane buyuk harf olsun
              iv) en az bir tane kucuk harf olsun
              v) en az bir tane sembol olsun
              vi)en az bi tane rakam olsun


         */

        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen passwordunuzu giriniz");
        String pwd=input.nextLine();

        // nextline kulandik cunku space de kullanabiliriz
        //Scanner kullandik cunku kullanicidan veri alacagiz


        //i) En az 8 character olsun
        boolean first = pwd.length()>7;


        // yukarda boolean kullandik cunku sonucumuz true yada false mi diye bakacagiz
        // lenght methdunu kullandi cunku 8 character istiyor diye
        // lenght methodunu >7 olarak lkullandik cunku en az 8character imiz olmali
        // lenght >= 8 yapsaydik java iki is yapmis olacakti ve daha cok vakit harcanacakti.
        // o nedenle lenght >7 yaptik

        //ii)space karakteri olmasin

        boolean second= !pwd.contains(" ");


        // yukarda ki "!" unlem isareti degil demektir.
        // normalde contains iceriyor demek, unlemle birlikte kulanilinca "icermiyor" oluyor


        //iii) en az bir tane buyuk harf olsun

        //Note; buyuk harf olamayanlri sil
        // kalan karakter sayisin bak
        // kalan karakter sayisi sifir ise buyuk harf yok
        // sifirdan buyuk ise buyuk harf var

        boolean third =pwd.replaceAll("[A-Z]","").length()>0;


        //iv) en az bir tane kucuk harf olsun

        boolean firth= pwd.replaceAll("[a-z]"," ").length()>0;
        System.out.println(firth);

        //v) en az bir tane sembol olsun

        boolean fifth= pwd.replaceAll("[a-zA-Z0-9]"," ").length()>0;
        System.out.println(fifth);

        // yukardaki kod yani replaceALL (pwd.replaceAll("[a-zA-Z0-9]"," ") )harf ve rakam disindakileri sil demek
        //harf ve rakamlari sil ki elinde sembol kalsin
        // harf ve rakamlari sildik yani "" iki tirnak icinde demek o voslukla rakamlari yer dgistir
        // demektir
        // harf ve rakamlari silince semboller kaliyor


        //vi)en az bi tane rakam olsun

        boolean seventh= pwd.replaceAll("[^ 0-9]", " ").length()>0;

        //System.out.println(first);
        //System.out.println(second);
        //System.out.println(third);
        //


        System.out.println(first&& second&& third && fifth&& seventh);












    }
}

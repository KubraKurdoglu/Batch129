package day05typecastingstringmanipulations;

import java.util.Locale;

public class StringManupulations01 {

    public static void main(String[] args) {

        //String bir non-primitive data type sidir
        // ayni zamanda bir class dir
        // non-primitive data typelerinin methodlari var
        //class larda da pasif atif ozelleikleri var
        // class larin aktif ozelliklerinde method var

        String s= "java is easy";

        //example 1: "s"string indeki tum characterleri buyuk harfle yazin

        String sUpper=s.toUpperCase();
        System.out.println(sUpper); // JAVA IS EASY

        //Example 2: "s" string indeki tum characterleri kucuk harfle yazin

        String sLower= s.toLowerCase();
        System.out.println(sLower); // java is easy

        //Example 3: "s"string indeki ilk characteri alainiz

      char premierLettre= s.charAt(0);
        System.out.println(premierLettre);

        //Example 3: "s"string indeki ikinci characteri alainiz


        char secondLettre= s.charAt(2);
        System.out.println(secondLettre);

        //DIKKAT tek bir karakter aldiginda "charAt" kullan

        //Example 5: "s"string indeki ikinci ve sondan ikinci characteri alainiz

        char secondChar= s.charAt(2);
        char secondLastChar= s.charAt(10);


        // 1. YOL: ayni satirda yazdirmak icin birinci yol
        System.out.print(secondChar);
        System.out.println(secondLastChar);


        // 2. YOL: ayni satirda yadirmak icin
        System.out.println(""+ secondChar+ secondLastChar);

       //LENGT METHODU

        // kullanilan character sayisini olcuyoruz
        //DIIKAT index sifirdan baslar fakat sayma sayilari "1" den baslar
        // Example 5:"s"string indeki bulunan karakter sayisini bulunuz

        int sLenght= s.length();
        System.out.println(sLenght);//12


        // int kullnadik cunku karakte sayisi sayi olacak ya ondan dolayi

        //Example 6: "s"string ilk 4 characteri bulunuz

        String sub1= s.substring(0,4);
        System.out.println(sub1);

       // Example 7: "s"string deki "is " characteri bulunuz

        String sub2= s.substring(5,7);
        System.out.println(sub2);

        // Example 8: "s"string deki "easy " characterini bulunuz

        String sub3= s.substring(8,12);
        System.out.println(sub3);


        // Bir karakterden baslayip sonuna kadar almak istersniz, ikinci index i yazmayiniz
        // s.string(8,12) yerine s.string(8) yazmak yeterlidir

        String sub4= s.substring(8);
        System.out.println(sub4);


        // "contains" METHODU
        // java da String ler buyuk ve kucuk harfe duyarlidir
        // contains methoduu istediginiz kadar karakterle kullanilabilir
        // asagida parantezin ici bosta olabilir

        // Example 8: "s"string de "mony" kelimesi var mi?
        boolean isExist=s.contains("money");
        System.out.println(isExist);

        // Example 9: "s"string de "  " (iki bosluk yani space var mi) kelimesi var mi?

        boolean isExist2=s.contains("  ");
        System.out.println(isExist2);

        // Example 10: "s"string inin  belli bir harfle baslayip baslamadigini kontrol

        boolean isStart= s.startsWith("java");
        System.out.println(isStart);

        //  Example 11: "s"string inin 6. karakterden itibaren  belli bir harfle baslayip baslamadigini kontrol

        boolean isBegin= s.startsWith("i",5);
        System.out.println(isBegin);










    }
}

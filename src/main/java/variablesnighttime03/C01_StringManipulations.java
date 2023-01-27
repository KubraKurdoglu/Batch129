package variablesnighttime03;

import java.util.Scanner;

public class C01_StringManipulations {


       /*
                            String Class Methodlari

                1)equals(): i)Iki tane String'in ayni olup olmadigini anlamamiza yarar.
                            ii)equals() method'u "boolean" return eder.

                2)equalsIgnoreCase(): i) Iki tane String'in ayni olup olmadigini buyuk harf
                                        kucuk harfe dikkat etmeden anlamamiza yarar.
                                    ii) equalsIgnoreCase() method'u "boolean" return eder.
                3)toLowerCase(): i)Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir.
                                    ii) toLowerCase() method'u "String" return eder

                4)toUpperCase(): i)Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir.
                                ii) toUpperCase() method'u "String" return eder

            5)charAt(): i) Bir String'den belli bir index'deki characteri almak icin kullanilir.
                        ii) charAt() method'u "char" return eder.

            6)length(): i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir
                        ii) length() method'u "int" return eder.
            7)contains(): i)Bir String'de belli bir characterin veya
                            characterlerin var olup olmadigini anlamak icin
                            kullanilir
                          ii) contains() method'u "boolean" return eder.
            8)split(): i)Bir String'i istedigimiz character'den parcalamaya yarar
                            ii)split() method'u "Array" return eder.
            9)replace () i)Metin icerisindeki karakter ya da karakterlerin,
                            istenilen karakter ya da metinle degistirilmesini saglar.
                            Sonuc String'dir..
            10)replaceFirst()
                           i) Replace ile aynı sadece ilk bulunan karakteri değiştirir
     */
         /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
       1) \\d    ==> tum rakamlar digit
          \\D    ==> tum rakam disi character ler
       2) \\w   ==> A->Z    a->z         0->9    _tum buyuk, kucuk harf ve rakamlar
          \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
       3) \\s   ==> space tum bosluklar space
          \\S   ==> space disindaki hersey

               12) + Concat: Bir String'e diğerini ekler.
            Concatenation : Java'da + islemi yapilirken eger toplanan ifadelerden biri veya
            her ikisi String ise Java toplama degil BIRLESTIRME==YANYANA yazdirma yapar.



        ONEMLI NOT=JAVA YUKARIDAN ASAGI SOLDAN SAGA CALISIR.

         */


    public static void main(String[] args) {

        System.out.println("yuz"+40+60);//yuz4060  (string ile primitive bir data yi yanyana yazdirdigmiz icin string int yuttu/
        System.out.println("yuz"+(40+60));// parantez onceligi var yuz100 cikar sonuc
        System.out.println("ikiyuzkirk"+40*6);// yine islem onceligi var o nedenle sonuc ikiyuzkirk240
        System.out.println(60+40+"yuz");// java soldan saga calistigi icin bunun sonucu 100yuz oldu,once toplamayi gordu

        // kullanicidan ismini soyismini alip, kullanici nasil girerse girsin tam isminin buyuk harfle yazilmasini
        // saglayiniz

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen adinizi ve soyadinizi giriniz");

        //String fisrtName= input.nextline();
        //String lastName= input.nextLine();
        // bunlari iki kere yazmak yerine birlestirdik

        String firstname=input.nextLine(), lastname=input.nextLine();

        String tamisim=firstname.concat(""+lastname).toUpperCase();
        System.out.println("tam isim="+ tamisim);


        // rakam haricindekileri girin

        String str="$45.99";

        str=str.replaceAll("\\D", "");// tum sembollerin yerine hiclik ata
        System.out.println("str="+str);//4599
       // DIKKAT et yukardaki ifadeden her ne kadar sembol ve noktayi silsende o hala String


        //VERILEN CUMLEYI YILDIZ ILE GIZLEYIP ONUNCU KARAKTERDEN SONARSINI YAZDIRIN


        String cumle="her dert java gibi olsa";

        System.out.println(cumle.replaceAll("\\w", "*") + cumle.substring(10));


        // aharfini @ ile digistiriniz

        String ders="olaganustu";

        System.out.println(ders.replaceAll("a", "@"));

//Verilen bir String de kullanilan noktalama isareti ve rakamlar ve space karakteri haric
//           tum karakterlerin sayisini bulan kodu yaziniz

        String str2="Learn Java earn 9000000 money,!...";

        int sonuc =str2.replaceAll("[0-9]","").
                replaceAll(" ", "").
                replaceAll("\\p{Punct}","").
                length();


        System.out.println("sonuc="+sonuc);
        // yukarda islemi asagi atmaay "lamb" dedi sanirim

        // sag tarafdaki cizgiye "hayalet cizgi" dedi

       // int dedi cunku rakam dondurecek bize









    }














    }


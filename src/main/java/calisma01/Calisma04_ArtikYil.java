package calisma01;

import java.util.Scanner;

public class Calisma04_ArtikYil {
    public static void main(String[] args) {


        // EXAMPLE 4
        // Iki sayinin isareti ayni ise bu sayilari carpan,
        // isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz



        int s1=6;

        int s2= -5;

        Object sonuc =(s1 < 0 && s2 < 0 )|| (s1>0 && s2>0) ? (s1 * s2) : ("Farkli isaretli sayilari carpamiyorum");
        System.out.println(sonuc);

        /*
            EXAMPLE 1: Verilen yilin "Artik Yil (Leap Year) olup olmadigini kontrol eden kodu yaziniz.

                        1) Yil 100'e bolunurse 400'e bolunmelidir. ==> 1600 ==> Leap 1800 ==> Leap degil
                        2) Yil 100'e bolunmuyorsa 4'e bolunmelidir. ==> 2004 ==> Leap   2005 ==> Leap degil
         */


        int ans = 1998;

        if((ans%100==0 && ans%400==0) || (ans%100!=0 && ans%4==0)){
            System.out.println("leap (artik) yil");

        }else {
            System.out.println("leap (artik) yil degil");
        }

       //2.YOL TERNARY

        System.out.println(((ans % 100 == 0 && ans % 400 == 0) || (ans % 100 != 0 && ans % 4 == 0)) ? "leap (artik) yil" : "leap (artik) yil degil");



        /*
            EXAMPLE 2:
            Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz.
         */


        System.out.println("s'il vous plaît, pouvez-vous écrire un jour");
        Scanner input =new Scanner(System.in);

        String jour= input.next();


        switch(jour){
            case "lundi":
                System.out.println(1);
                break;
            case "mardi":
                System.out.println(2);
                break;
            case "mercredi":
                System.out.println(3);
                break;
            case "jeudi":
                System.out.println(4);
                break;
            case "vendredi":
                System.out.println(5);
                break;
            case "samedi":
                System.out.println(6);
                break;
            case "dimanche":
                System.out.println(7);
                break;
            default:
                System.out.println("s'îl vous plaît, pouvez-vous écrire une vrai nom");



        }




        // EXAMPLE 3:
        // Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        // Sayi negatifse -1 ile carpilir  -4 ==> -1 * 4     4 ==> 4   0 ==> 0

//---------------------------------------------------------------------------------------------------------------------

        // EXAMPLE 4
        // Iki sayinin isareti ayni ise bu sayilari carpan,
        // isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz

//---------------------------------------------------------------------------------------------------------------------

        // EXAMPLE 5:
        // 40'den 23'e kadar tum cift tamsayilari yazdiran kodu yaziniz.

//---------------------------------------------------------------------------------------------------------------------

        /*
            EXAMPLE 6:
            Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan karakterlerini buyuk harf yapiniz.
            Yazdiginiz kod belli seneryolar icin calisiyor tum senaryolar icin calismiyorsa bu koda "Hard Code" denir.
            Hard code yanlis yazilmis koddur. Mutlaka duzeltilmelidir.
            Bir String'de son index = length()-1

         */

//---------------------------------------------------------------------------------------------------------------------
            /*
           EXAMPLE 7:
           Ay numarasini soyleyince numarasi verilen ay'dan baslayip
           12. aya kadar tum aylarin isimlerini yazdiran kodu yaziniz
           8 ==> August - September - October - November - December

             */


//---------------------------------------------------------------------------------------------------------------------


       /*
        EXAMPLE 8:
        Kullanicidan iki sayi ve yapilacak islemi alan ve toplama,
        cikarma, bolme, carpma ve % islemlerini yapan kodu yaziniz.

        */


//---------------------------------------------------------------------------------------------------------------------

          /*
          EXAMPLE9:
            Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

            Kullanicidan bir ulke ismi aliniz.Alinan ulke adina gore kisaltmalari yazdiriniz

         */







    }
}

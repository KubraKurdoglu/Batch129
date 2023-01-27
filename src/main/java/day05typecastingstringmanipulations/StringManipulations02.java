package day05typecastingstringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        String s= "Learn Java earn money";

        //Exmple 1: "s" string inin "money" ile bitip bitmedigini kontrol ediniz

        Boolean isEnd=s.endsWith("money");
        System.out.println(isEnd);

        Boolean isEnd1=s.endsWith("y");
        System.out.println(isEnd);

        Boolean isEnd2=s.endsWith("");
        System.out.println(isEnd);

        //Exmple 2: "s" string inideki "money" kelimesini "dollar" kelimesine ceviriniz

        String newS1= s.replace("money", "dollar");
        System.out.println(newS1);

        //Exmple 3: "s" string inideki "earn" kelimesini "win" kelimesine ceviriniz

        String newS2= s.replace("earn","win");
        System.out.println(newS2);// Lwin Java win money

        // NOTE: replace

        //Exmple 4: "s" string inideki "a" harflerini "*" sembolune ceviriniz

        String newS3= s.replace("a","*");
        System.out.println(newS3);// Lwin Java win money

        //Exmple 5: "s" string inideki "n" harflerini "xxx" sembolune ceviriniz

        String newS4=s.replace("n", "xxx");
        System.out.println(newS4);


        // NOTE: replace methodu bazi karakterleri silmemizi saglar.
        // asagidaki islemi silme islemlerinde cift tirnak kullanmaliyiz
        // "hicbir sey" kavrami,char data type sinde yoktur bu yuzden replace methodu kullanarak
        // silme islemi yaparsaniz mutlaka "" cift tirnak kullaniniz

        //Exmple 6: "s" string inideki tum e harflerini silin

       String newS5= s.replace("e", "");
        System.out.println(newS5);

        String t= "Ali 13 yasindadir!...";

        //Exmple 7: "t" string inideki tum  rakamlari(0-9)  yildiza"*" a  ceviriniz

        String t1= t.replaceAll("[0-9]","*");
        System.out.println(t1);



        //Example 8: "t" string indeki tum rakamlari ve harfleri unleme ceviriniz

       String t5= t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t5);//!!! !! !!!!!!!!!!!...



        //Example 9: "t" string indeki tum sesli harfleri "?" ne  ceviriniz

        String t6= t.replaceAll("[aeiouAEIOU]","?");
        System.out.println(t6);//?l? 13 y?s?nd?d?r!...

        //Example 10: "t" string indeki kucuk harfler disindaki tum characterleri "<>" ceviriniz

       String t9 = t.replaceAll("[^ a-z]","<>");
        System.out.println(t9);//<>li <><> yasindadir<><><><>

        //Example 1&: "t" string indeki tum harfler disindaki tum characterleri "+" ceviriniz

        t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);

        //Example 12: "t" string indeki space ler  disindaki tum characterleri "+" ceviriniz
        String t7=t.replaceAll("[^  ]","+");
        System.out.println(t7);//+++ ++ ++++++++++++++

        //Example 13: "t" string indeki sesli harfler  disindaki tum characterleri "&" ceviriniz

        String t8=t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println(t8);// A&i&&&&&a&i&&a&i&&&&&




    }
}

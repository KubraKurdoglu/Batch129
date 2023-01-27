package day20passbyvaluemethodoverloading;

public class MethodOverloading01 {
    public static void main(String[] args) {

        //Overloading==> bir methodun farli farkli islerinin olmasi
        // Ayni isim birden fazla is yapiyorsa buna "Method Overloading" denir
        //  s.substring()==> mesela bu substring methodunda, index li olan var
        // s.substring diye basarsan onun degsisik kullanimlarini gorursun buna deniyor
        // bu "method overloading" i biz yapacagiz


       //ASAGIDA "add methduna" Overload yaptik
        // bir method ile degisik degerlerle islem yaptik

        // tamsayilarin "default" degerleri int dir
        // ondalik sayilarin "default " degerleri "double" dir




        // asagida 1. methodu kapatasan java hata verecek
        // cunku uc tane degerin olabilirligi olacak
        // uc tane degerin "autowidening "le calisma ihtimali olacak
        // ve java aralarindan hangsini sececegini bilemeyecek
        //1.de AW(Autowidening) yok , ilk onu secer ve hata vermez
        // ama onu kapatirsan, digerleri arasinda secim yapmak zorunda kalacak
        // en az AW hangisinde yaparsa, onu secmek ister



        /*
        METHOD OVERLOADING
       1) Method overloading yaparken method ismi degistirilmez.
        Method ismi degisirse o zaten baska bir method olur.
       2) Method overloading yaparken parametreler degistirilir.
            2.1) Parametre degistirirken parametrelerin data typelari degistirilebilir.
            2.2) Parametre degistirirken parametrelerin yerleri degisebilir.
        (parametrelerin data typelari farkliysa parametrelerin yerini
        degistirmek mantiklidir yoska mantiksiz olur)
            2.3) Parametre degistirirken parametrelerin sayisi degistirilebilir.
        3)Java icin "ismi" ve "parametreleri" ayni olan iki method tamamiyla aynidir.
          Bu yuzden "ismi" ve "parametreleri" "Method Signature" olarak adlandirilir.
       4)Method Overloading olustururken "return type"'i degistirmenin hicbir etkisi yoktur.
    Method Overloading olustururken "access modifier"'i degistirmenin hicbir etkisi yoktur.
    Method Overloading olustururken method'u "static" ya da "non-static" yapmanin hicbir etkisi yoktur.
    Method Overloading olustururken "method body"'i degistirmenin hicbir etkisi yoktur.

       5) "private" method'lar overload edilebilirler. cunku method overloading sadece bir class'in icinde olur.
       "private" olmak ise baska class'lara gidildiginde problem olusturur.


       6) "static" method'lar overload edilebilirler.

       asagidaki methodlarin hepsini "private" yapti hoca, o zaman java hata vermedi
       cunku zaten ayni class'in icindeyiz
       bu bir sorun olusturmuyor
       


         */

        add(3, 5);


    }

    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void add(double a, double b){
        System.out.println(a+b);
    }
    public static void add(int a, double b){
        System.out.println(a+b);
    }
    public static void add(double a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }



}

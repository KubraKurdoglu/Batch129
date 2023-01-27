package calisma01;

import java.util.Scanner;

public class Calisma_04_IfElse {
    public static void main(String[] args) {


 /*
    EXAMPLE 16 :

    Kullanicidan iki sayi isteyin, sayilarin ikisi de positif ise sayilarin toplamını yazdirin,
    sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli isaretlere
    sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin, sayilardan sifira esit olan varsa
    "sifir carpmaya gore yutan elemandir" yazdirin.
    */


       /* Scanner input=new Scanner(System.in);

        System.out.println("lutfen iki sayi giriniz");

        int s1 = input.nextInt();
        int s2 = input.nextInt();

        if(s1>0 && s2>0){
            System.out.println(s1+s2);
        }else if(s1<0 && s2<0){
            System.out.println(s1*s2);
        }else if(s1<0 && s2>0 || s1>0 && s2<0){
            System.out.println("farkli isaretli sayilarla islem yapamazsiniz");
        }else if(s1==0 && s2>0 || s1>0 && s2==0){
            System.out.println("sifir carpmaya  gore yutan elemandir");
        }else{
            System.out.println("degersiz bir sayi girdiniz");
        }










 /*
    EXAMPLE 15 :

    Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun isminin 1.,2. ve 3.harflerini
   ilk harf buyuk diger ikisi kucuk olarak yazdirini, gun ismi gecerli degilse "Gecerli gun ismi giriniz" yazdiriniz
     */








         /*

   EXAMPLE 17 :

   Kullanicidan 100 uzerinden notunu isteyin. Not'u harf sistemine cevirip yazdirin.
   50'den kucukse "D", 51-60 arasi "C", 60-80 arasi "B", 80'nin uzerinden ise "A"
   */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen notuzu giriniz");
         byte note= input.nextByte();

         if(note>0 && note<51){
             System.out.println("notunuz 'D'");
         } else if (note>=51 && note<=60) {
             System.out.println("ntunuz 'C' ");
         } else if (note>=61 && note<=80) {
             System.out.println("notunuz 'A'");
         } else if (note>=81 && note<=100) {
             System.out.println("notunuz 'A' ");
         } else
             System.out.println("lutfen gecerli bir not giriniz");








        /* Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin.
            teklif 80.000 arasinda ise "Kabul ediyorum ",
            60 - 80.000 arasinda ise "Konusabiliriz"
            60.000 'nin altinda ise "Maalesef Kabul edemem" yazdirin
            */



        System.out.println("lutfen bir teklif giriniz");
             int teklif=input.nextInt();



             if(teklif>80000){
                 System.out.println("kabul ediyorum");
             } else if(teklif>=60000 && teklif<=80000){
                 System.out.println("konusabiliriz");
             }else if (teklif<60000){
                 System.out.println("malesef kabul edemem");
             } else
                 System.out.println("gecerli bir deger girinz");



       /*
    EXAMPLE 18 :

    Nested if kullanarak asagidaki soruyu cozen kodu yaziniz.

    Kullanicidan bir sifre girmasini isteyin

    Eger ilk harf buyuk harf ise "A" olup olmadigini kontrol edin.Ilk harf A ise "Gecerli Sifre" degilse
    "Gecersiz Sifre" yazdirin

    Eger ilk harf kucuk harf ise "z" olup olmadigini kontrol edin.Ilk harf z ise "Gecerli Sifre" degilse
    "Gecersiz Sifre" yazdirin
         */



         /*
    EXAMPLE 19 :

    Kullanicidan 4 basamakli bir sayi girmesini isteyin. Girdigi sayi 5'e bolunuyorsa son rakamini kontrol
    edin. Girdigi sayi 5'e bolunuyorsa son eakamini kontrol edin. Son Rakami 0 ise ekrana "5'e bolunen
    cift sayi" yazdirin . son rakami 0 degil ise "5'e bolunen tek sayi" yazdirin.
    Girdigi password 5'e bolunmuyorsa ekrana "Tekrar deneyin" yazdirin.
     */





             //Exemple: Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız.
            // Bir String, tersi ile aynıysa, buna palindrom denir. Örneğin; "anna", "123321" palindromlardır



             String s1= "anna";
             String s2 = "";













    }
}

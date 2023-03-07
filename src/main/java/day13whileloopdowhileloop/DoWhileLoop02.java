package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {

        /*
        kullanicidan bir tamsyi aliniz, tamsayi 100'den kucuk ise kullaniciya "kaybettiniz "
        mesaji vererek oyunu sonlandriniz.
        Tamsayi 100 ve  100'den buyukse "kazandiniz" mesaji vererek oyuna devam ettiriniz

         */

        // Hoca burda "SCOPE" diye bir method anlatti
        //Scope ==kapsam demek
        // suslu parantezin icinde olusturdugun dgerleri sadece o degerlerin arasinda kullanabilirsin
        //yoksa hata verir
        // asagida da int num i tanimladik
        // sonra "do" nun icinde bir daha "int num=input.nextInt();"     diye tekrar etmek yerine
        // sadece num= input.nextInt(); seklinde yazdik

        Scanner input = new Scanner(System.in);

        int num =0;

        //"bir sayi giriniz" her defasinda kullanicinin onune dusmeli
        // bu nedenle sout'u "do" nun icine attik
        // ihtimal old icin "if" kullandik, do icinde tabi ki

        do {
            System.out.println("Lutfen bir sayi giriniz");
            num= input.nextInt();
            if(num>=100){

            }

        }while (num>=100);
        System.out.println("Kaybettiniz");







    }
}

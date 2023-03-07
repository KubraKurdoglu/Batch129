package day03scanner;

import java.util.Scanner;

public class Scanner04Tekar {

    public static void main(String[] args) {


        // Example: kullanicidan iki sayi alarak dort islem yapan kodlari ekrana yazdiriniz

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayi griniz..");


       double firstnumber= scan.nextDouble();
       double secondnumber=scan.nextDouble();

        System.out.println("toplama sonucu"+""+firstnumber + secondnumber);
        System.out.println("cikarma sonucu"+""+(firstnumber - secondnumber));
        System.out.println("bolme sonucu"+""+firstnumber / secondnumber);
        System.out.println("carpma sonucu"+""+firstnumber * secondnumber);


        // yukarda cikarma islemini yapabilmek icin parantez icine aldim
        // diger turlu kabul etmedi






    }









}

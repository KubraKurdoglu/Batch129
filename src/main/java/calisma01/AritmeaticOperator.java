package calisma01;

import java.util.Scanner;

public class AritmeaticOperator {
    public static void main(String[] args) {

        // kullanicidan iki sayi isteyin aritmatic islemi gerceklestiriniz

        Scanner input =  new Scanner(System.in);
        System.out.println("1. sayiyi giriniz");

        int sayi1= input.nextInt();
        System.out.println("2. sayiyi giriniz");
        int sayi2 = input.nextInt();



        Scanner scan = new Scanner(System.in);
        System.out.println("Ürün miktarını sayı olarak giriniz");

        int miktar = scan.nextInt(); System.out.println("Ürün birim fiyatını giriniz");
        double fiyat = scan.nextDouble();

        double result = miktar>1000 ? fiyat*0.9*miktar : fiyat*miktar;
        System.out.println(result);







    }
}

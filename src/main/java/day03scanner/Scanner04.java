package day03scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        //kullanicidan iki sayi alip dort islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz
        // kullanicidan data almak icin uc adim var
        // 1. data olustur

        Scanner input = new Scanner (System.in);
        System.out.println("iki sayi giriniz");

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);

        // calistridiktan sonra cikan sonuclari java hep noktali verdi cunku baslangicta kodu double girdik
        // java bunu ondalikli olarak aldi dogal olarak
        // yani 7.0 3.0 10.0

        //BURDA COKLU SAYI ISTEYIP BIRER BIRER YERLESTIRMEYI OGRENDIK
    }
}

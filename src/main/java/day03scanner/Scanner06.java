package day03scanner;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {

        // kullanicidan alacaginiz bes basamakli sayinin
        // ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yaziniz

        // 1. adim scanner class tan obje olustur
        Scanner input = new Scanner (System.in);

        // 2. adim kullanicidan sayi iste

        System.out.println("bes basamakli sayi giriniz...");

        //3. adim kullanicinin talebine gore nextin , nextdouble ,next,...

        int number = input.nextInt();

        int lastDigit = number%10;
        System.out.println(lastDigit);

        number= number/10;
        System.out.println(number);

        //son rakami al


                number = number/10;


                // sondan ikinci rakami al
        int lastSecondDigit = number%10;
        number = number/10;

    }
}

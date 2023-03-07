package day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {


        // kullanicidan bir  dik dortgenin iki kenar uzunlugunun aliniz
        // i)diktortgenin alalnini hesaplayiniz
        // ii)cevresini hesaplayiniz
        //1. adim

        Scanner input= new Scanner(System.in);

        //2. adim
        System.out.println("diktortgenin kisa kenar uzunlugunu giriniz...");

        //3. adim

        float shortSide = input.nextFloat();
        float longSide = input.nextFloat();

        System.out.println("diktortgenin uzun kenar uzunlugunu giriniz...");

        System.out.println("Alan" + (shortSide * longSide));

        System.out.println("Cevre" + (2*shortSide + 2*longSide));




    }
}

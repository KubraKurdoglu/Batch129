package day03scanner;

import java.util.Scanner;

public class Scanner05Tekrar {

    public static void main(String[] args) {

        // kullanicidan bir diktortgenin iki kenar uzunlugunu aliniz
        // i) diktortgenin alanini hesaplayiniz
        // ii) dikdortgenin cevresini hesaplayiniz

        Scanner dikdortgen= new Scanner(System.in);

        System.out.println("lutfen dikdortgenin kisa kenarinin uzunlugunu giriniz..");

        double kisaKenar=dikdortgen.nextDouble();

        System.out.println("lutfen dikdortgenin uzun keanrinin uzunlugunu giriniz..");
        double uzunKenar=dikdortgen.nextDouble();



        System.out.println("dikdortgenin cevresi="+(kisaKenar+uzunKenar)*2);
        System.out.println("dikdortgenin alani="+(kisaKenar*uzunKenar));






    }
}

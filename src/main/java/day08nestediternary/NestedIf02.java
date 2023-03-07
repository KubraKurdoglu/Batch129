package day08nestediternary;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {

        /* Exaple 2: kullanicidan bir ucgenin eskenar uzunlularini aliniz

             uc kenari bir birine esit ise " eskenar ucgen" yazdiriniz
             sadece iki kenar uzunlugu birbirine esit ise "ikizkenar ucgen"
             tum kenarlari birbirinden farkli ise "cesikenar ucgen" yazdiriniz




         */


        Scanner input = new Scanner(System.in);
        System.out.println("ucgenin kenarlari icin  3 tane uzunluk giriniz");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        boolean ucgenmi = (a + b > c && c > Math.abs(a - b)) && (a + c > b && b > Math.abs(a - c)) && (b + c > a && a > Math.abs(b - c));


        if(a<=0 || b<=0 || c<=0) {
            System.out.println("negatif kenar uzunlugu olamaz..");
        } else if (ucgenmi) {

            if(a==b && b==c && a==c) {
                System.out.println("eskenar ucgendir");
            }else if(a==b || b==c || a==c) {
                System.out.println("ikizkenar ucgen");
            }else {
                System.out.println("cesitkenar ucgen");
            }

        }else {
                System.out.println("ucgen degil");
            }


    }












    }


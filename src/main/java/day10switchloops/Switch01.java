package day10switchloops;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        //Example 1: ay numarasi verilince, numarasi verilen aydan baslayip 12. aya kadar tum
        // aylarin isimlerini yazdiran kodu yaziniz
        // 8==> august-september-october-november-december


        Scanner input = new Scanner(System.in);
        System.out.println("baslangic ayinin kacinci ay oldugunu giriniz...");
        int numOfMonth = input.nextInt();


        switch (numOfMonth){
            case 1:
                System.out.println("janvier");
            case 2:
                System.out.println("fevrier");
            case 3:
                System.out.println("mars");
            case 4:
                System.out.println("avril");
            case 5:
                System.out.println("may");
            case 6:
                System.out.println("juin");
            case 7:
                System.out.println("juillet");
            case 8:
                System.out.println("august");
            case 9:
                System.out.println("september");
            case 10:
                System.out.println("october");
            case 11:
                System.out.println("november");
            case 12:
                System.out.println("december");
                break;
            default:
                System.out.println("lutfen gecerli bir ay giriniz");
        }

        /// DIKKATT!!! yularda "Break " yazmadik cunku buldugumuz deger dahil
        // sonraki aylari da yazdirmasini istiyoruz
        // default tan once break koymasak " default u da calistirirdi
        // yani kullanici gecerli ay sayisi girdigi halde yine de "gecerli bir sayi girin" derdi
        // HANGI SEVIYEDE SWITCH IN DISINA CIKMAK ISTIYORSAK ORAYA "BREAK" KOYUYORDUK


        /*
        NOTE: switch de i)string ii)intger iii) byte iv) short v)char kullanilabilir
        NOTE: "switch" de i) long ii)boolean iii)float iv)double kullanilamaz

        long==> cok buyuk dgerler aliyor bukadar cok degerle switch yazilamaz
        boolean==> "swicth" "i iki deger ocon kullanmaya gerek yoktur



         */



    }
}

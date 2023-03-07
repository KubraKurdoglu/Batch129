package day10switchloops;

import java.util.Scanner;

public class Switch01Denema {
    public static void main(String[] args) {

        //Example 1: ay numarasi verilince, numarasi verilen aydan baslayip 12. aya kadar tum
        // aylarin isimlerini yazdiran kodu yaziniz
        // 8==> august-september-october-november-december
        Scanner input= new Scanner(System.in);
        System.out.println("bir ay numarasi giriniz");
        int numberMoi=input.nextInt();

        switch (numberMoi){
            case 1:
                System.out.println("janvier");
                break;
            case 2:
                System.out.println("fevrier");
                break;
            case 3:
                System.out.println("mars");
                break;
            case 4:
                System.out.println("avril");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("decembre");
                break;
            case 7:
                System.out.println("jully");
                break;
            case 8:
                System.out.println("aout");
                break;
            case 9:
                System.out.println("septembre");
                break;
            case 10:
                System.out.println("octobre");
                break;
            case 11:
                System.out.println("novembre");
                break;
            case 12:
                System.out.println("decembre");
                break;
            default:
                System.out.println("lutfen 1-12 arasinda bir sayi giriniz");


        }
















    }
}

package day10switchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        //Example 1: kullanicidan iki sayi veyapilacak islemi alan ve +,-,*,/,% islemlerini yapan
        // kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz..");
        double a= input.nextDouble();
        double b= input.nextDouble();

        System.out.println("yapilacak islemi giriniz. +,-,*,/,% islemlerinden birini giriniz");
        char opr = input.next().charAt(0);


        // kullanicidan tek karakter alacagimiz icin o nedenle "char" kullandik
        // double kullandik cunku sonuclar ondalik olabilir
        //switch in icine char i koydu cunku yani char in icindeki degeri koydu


        switch (opr) {
            case '+':
                System.out.println(a + "+" + b + "=" + (a + b));
                break;
            case '-':
                System.out.println(a + "-" + b + "=" + (a - b));
                break;
            case '*':
                System.out.println(a + "*" + b + "=" + (a * b));
                break;
            case '/':
                System.out.println(a + "/" + b + "=" + (a / b));
                break;
            case '%':
                System.out.println(a + "%" + b + "=" + (a % b));
            default:
                System.out.println("bu islem tanimlanmamistir");
        }
    }



}

// (a + "+" + b + "=" + (a + b) bu yapmasinin nedeni concatination yapmak
// islem yapmaksizin ekrana 10-5=5 yazdirabilmek
// amac bu oldugu icin bu kadar suslu uzun yazdirdi
// burda kullanici harf girseydi hata verirdi
//  cunku netxdouble harf kabul etmez

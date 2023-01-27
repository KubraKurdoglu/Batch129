package ssg_ifstatementternary;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scan.nextInt();



        String s = sayi%2==0 ? "sayi cift" : "sayi tek";
        System.out.println(s);


        System.out.println("lutfen bir sayi giriniz");
        int sayi2 = scan.nextInt();


        if(sayi2%2==0){
            System.out.println("sayi cift");
        }else{
            System.out.println("sayi tek sayidir");
        }



        String result = sayi%2==0 ? "CIFT" : "TEK";
        System.out.println(result);

    }
}

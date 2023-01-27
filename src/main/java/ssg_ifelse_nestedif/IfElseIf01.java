package ssg_ifelse_nestedif;

import java.util.Scanner;

public class IfElseIf01 {
    public static void main(String[] args) {

        //Example 1:
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");

        int not = scan.nextInt();

        if(not<0 || not>100){
            System.out.println("not sifirdan kucuk 100'den buyuk olamaz");
        }else if(not<50){
           System.out.println("D");
        }else if(not>=50 && not<60){
           System.out.println("C");
        }else if(not>=60 && not<80){
            System.out.println("B");
         } else if (not>=80) {
           System.out.println("A");

        }else {
           System.out.println("gecerli bir not girin");
       }


    }
}

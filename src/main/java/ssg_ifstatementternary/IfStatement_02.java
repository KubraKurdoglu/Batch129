package ssg_ifstatementternary;

import java.util.Scanner;

public class IfStatement_02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();


        if(sayi%2==0){
            System.out.println("bu sayi cift bir sayidir");
        }else{
            System.out.println("sayi tek bir sayidir");
        }





    }
}

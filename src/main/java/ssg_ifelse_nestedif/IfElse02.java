package ssg_ifelse_nestedif;

import java.util.Scanner;

public class IfElse02 {
    public static void main(String[] args) {

        //example 1: girilen bir karakterin harf olup olmadigini bulunuz
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char ch= scan.next().toUpperCase().charAt(0);


        if(ch>= 'A' && ch<='Z'){
            System.out.println("bu harftir");

        }else {
            System.out.println("harf degildir");
        }








    }
}

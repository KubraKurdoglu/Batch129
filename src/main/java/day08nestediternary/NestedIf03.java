package day08nestediternary;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {




        /*
             password un ilk harfi buyk harf ise 'A' olursa "gecerli password" yazdiriniz
             Alemci==> gecerli

             password'un ilk harfi kucuk harf ise 'z' olursa "gecerli password" yazdirin
             degilse "gecersiz password" yazdirin
             zehirli==>gecerli

         */


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen password'unuzu giriniz");
        String pwd= input.nextLine();


        if (pwd.charAt(0)>='A' && pwd.charAt(0)<='Z'){
            if (pwd.charAt(0)=='A'){
                System.out.println("gecerli password");

            }else{
                System.out.println("gecersiz password buyuk harf ama A degil ");
            }
        }else if (pwd.charAt(0)>='a' && pwd.charAt(0)<='z'){
            System.out.println("gecerli password");

            if (pwd.charAt(0)=='z'){
                System.out.println("gecerli password");
            }else{
                System.out.println("gecersiz password kucuk harf ama 'z' degil");
            }

        }else {
            System.out.println("ilk karakter harf olmali");
        }













    }

}

package day08nestediternary;

import java.util.Scanner;

public class NestedIf03Tekrar {
    public static void main(String[] args) {


        /*
        kullanicidan alinan
             password un ilk harfi buyk harf ise 'A' olursa "gecerli password" yazdiriniz
             Alemci==> gecerli
             degilse gcersiz passwor yazdiran

             password'un ilk harfi kucuk harf ise ve esittir 'z' olursa "gecerli password" yazdirin
             degilse "gecersiz password" yazdiran kodu giriniz
             zehirli==>gecerli

         */


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen mot de passe giriniz");

        String motDePasse = input.next();


      if (motDePasse.charAt(0)>='A' && motDePasse.charAt(0)<='Z'){
          if (motDePasse.charAt(0)=='A'){
              System.out.println("gecerli");
          }else{
              System.out.println("gecersiz buyuk harf ama 'A' degil");
          }
      }else if (motDePasse.charAt(0)>='a'  && motDePasse.charAt(0)<='z'){
          if (motDePasse.charAt(0)=='z'){
              System.out.println("gecerli ");
          }else{
              System.out.println("gecersiz cunku kucuk harf ama 'z' degil");
          }
      }else{
          System.out.println("gecersiz bir mot de passe girdiniz ilk karakter hafr olmali");
      }


    }

}


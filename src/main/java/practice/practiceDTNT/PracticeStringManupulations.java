package practice.practiceDTNT;

import java.util.Scanner;

public class PracticeStringManupulations {
    public static void main(String[] args) {

  //soru 1)Girilen iki String veriyi karşılaştıran Java kodu yazınız

        String str = "Kubra";
        String str1 = "kubra";// equalsignorecase yaparsan olur

        System.out.println(str.equals(str1)); // false


/*Soru 2) Kullanicidan email adresini girmesini isteyin,
          mail@gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
          @gmail.com ile bitiyorsa "Email adresiniz kaydedildi "
          @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin



 */


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen e-mail adresinizi griirniz");

        String email = input.next();

        if (!email.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        }else if (email.endsWith(" @gmail.com")){
            System.out.println("Email adresiniz kaydedildi ");
        }else {
            System.out.println("lutfen yazimi kontol edin ");

        }

/*
Soru 3)Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
      "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
       iki kelimeyi de icermiyorsa "Cumle kucuk yada buyuk kelimesi icermiyor"
       iki kelimeyi de iceriyorsa karar ver buyuk mu yazdirayim, kucuk mu? yazdirin.
 */
        String b = "java buyuk dunya kucuk";

         if(b.contains("buyuk")){
             System.out.println(b.toUpperCase());
         }else if(b.contains("kucuk")){
             System.out.println(b.toLowerCase());

         }else{

         }


           //soru 4: kisi isileri icicn 3 stringhdegisken olusturunuz ve bosluklar haric
        //karakter toplamlarini yaziniz

        String isim1 = "omer faruk";
        String isim2 = "utku can";
        String isim3 = "mahmet ali";


                // Soru 5:








    }
}

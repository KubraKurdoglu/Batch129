package day08nestediternary;

import java.util.Scanner;

public class NestedIf04Tekrar {
    public static void main(String[] args) {


        /*

   Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
   Eger calisan kadinsa 60 yasindan buyukse “Emekli Olabilir “yazdirin
   Eger calisan erkek ise 65 yasindan buyukse “Emekli Olabilir” yazdiran kodu olusturunuz

    */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi giriniz");
        String gender = input.next();

        System.out.println("lutfen yasinizi giriniz");
        int age = input.nextInt();


        if(age>=0 && age<=120){
            System.out.println("lutfen '0' ile '120' arasinda bir deger giriniz");

        }else if (gender.equalsIgnoreCase("kadin")){
            if (age>=60){
                System.out.println("emekli Olabilir");
            }else{
                System.out.println("emekli olamazsiniz");
            }
        } else if (gender.equalsIgnoreCase("erkek")) {
            if(age>=65){
                System.out.println("emekli olabilirisn");
            }else{
                System.out.println("emekli olamazsin");
            }

        }else {
            System.out.println("lutfen gecerli bir deger giriniz");
        }


    }
}

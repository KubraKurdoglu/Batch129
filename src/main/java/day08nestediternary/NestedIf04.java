package day08nestediternary;

import java.util.Scanner;

public class NestedIf04 {
    public static void main(String[] args) {

        /*

   Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
   Eger calisan kadinsa 60 yasindan buyukse “Emekli Olabilir “yazdirin
   Eger calisan erkek ise 65 yasindan buyukse “Emekli Olabilir” yazdiran kodu olusturunuz

    */



        Scanner input= new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi griniz. Erkek, Kadin, Digerleri...");
        String gender= input.next();

        System.out.println("yasinizi giriniz..");
        int age= input.nextInt();

        if(age<0 || age>120){
            System.out.println("lutfen yasi 0 ile 120 arasinda giriniz");

        } else if(gender.equalsIgnoreCase("Kadin")){

            if(age>60){
                System.out.println("emekli olabilir");

            }else {
                System.out.println("calismali");
            }

        }else if(gender.equalsIgnoreCase("erkek")){
            if(age>65){
                System.out.println("emekli olabilir");
            }else{
                System.out.println("kesinlikle calismali");
            }
        }else{
            System.out.println("tanimli degil!");
        }


        // digerleri kismini kabul etmedi cunku benim kodum tanimli degil
        // digerleri diye bir kod tanimlamadim
        // gecersiz degerler icin yazacagin kodu daim aen vbasa yaz
        // java yi yorma




    }
}

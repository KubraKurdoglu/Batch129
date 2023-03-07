package day15arrays;

import java.util.Scanner;

public class Arrays04_ElemanBulma {
    public static void main(String[] args) {

        //Example 1: bir Array'in icinde herhangi bir elemanin olup olmadigini
        // kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz


        int a[] = {0, 2, 3, 0, 12, 0};

        int num = 2;//aramak istedigin sayiyi buraya yaziyorsun

        int counter = 0;

        for (int w : a) {

            if(w==num){

                counter++;

            }

        }
        System.out.println(counter);

        if(counter>0){
            System.out.println(num + " sayisi " + counter+ " kere tekrar etmistir" );
        }else{
            System.out.println(num + " sayisi Arrays'de yoktur "  );
        }


        ///Example 2: bir Array'in icinde herhangi bir elemanin olup olmadigini
        //        // kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz
        //[4, 56, 0, 8, 0, 6, 5, 0]

        int [] arr = {4, 56, 0, 8, 0, 6, 5, 0};

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen aramak istediginiz rakami giriniz");

        int num2 = input.nextInt();

        int counter1 = 0;

        for (int w: arr) {

            if(num2==w){
                counter1++;
            }

        }
        if (counter1>0){
            System.out.println("sectiginiz " + num2+" sayisi "+counter1+" kere tekrar etmistir");
        }else{
            System.out.println("sectiginiz sayi Arrays de yok");
        }


    }
}

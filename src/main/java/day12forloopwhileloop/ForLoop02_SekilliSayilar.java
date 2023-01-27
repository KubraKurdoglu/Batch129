package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop02_SekilliSayilar {
    public static void main(String[] args) {

         /*
                Example 1: Asagidaki sekli cizen kodu yaziniz
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5
         */

       // yukardaki bir tekarli islem satiri yazdirip asagi birakmis
        //2.,3.,3.,4.,5.satirin icinde tekararli islem var
        // inner loop kacinci satirda ise okadar islem yapiyor
        //4. satirda ise 4. islemde bitiyor
        // yani icerdeki loop un bitisini disardaki loop belirliyor


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen satir(row) sayisini giriniz");
        int  row = input.nextInt();

        for(int i=1; i<=row ; i++){

            for (int k=1; k<=i ; k++){
                System.out.print(k+" ");
            }

            System.out.println();
        }



        /*
                Example 1: Asagidaki sekli cizen kodu yaziniz
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5
         */


        System.out.println("lutfen ikinci kere satir sayisini giriniz");
        int satir  = input.nextInt();

        for (int k =1; k<=satir; k++){
            for (int l=1; l<=k;  l++ ){

                System.out.print( l+" ");
            }
            System.out.println("");
        }


        /*
                Example 3: Asagidaki sekli cizen kodu yaziniz
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5
         */


        System.out.println("lutfen 3. kere satir sayisi giriniz");
        int satir2 = input.nextInt();

        for(int b = 1; b<=satir2; b++){
            for (int v =1; v<=b; v++){

                System.out.print(v+" ");
            }
            System.out.println("");
        }


        System.out.println("lutfen 4. kere satir sayisi giriniz");
         int satir4 = input.nextInt();

         for(int a = 5; a>0 ; a--){
             for (int q= 1; q<=a ; q++ ){
                 System.out.print(q+ " ");
             }
             System.out.println("");
         }

         //asagidaki cikti oldu
         /*
         1 2 3 4 5
         1 2 3 4
         1 2 3
         1 2
         1
          */

        //Example: asagidaki sekli yazdiran kodu yaziniz
        /*
        5 4 3 2 1
        5 4 3 2
        5 4 3
        5 4
        5

         */


        System.out.println("lutfen 5. kere satir sayisi giriniz");
        int satir5 = input.nextInt();

        for(int z = 1; z<=satir5 ; z++){
            for (int w= 5; w>=z ; w--){
                System.out.print(w + " ");
            }
            System.out.println("");
        }



    }
}

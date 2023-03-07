package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop04 {
    public static void main(String[] args) {


/*
   Kullanicidan baslangic ve bitis degerlerini alin.
   Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari
   ekrana yazdiriniz  //9_14===> 10  12  14
   // 9-14 arasi yum cift sayilari yazdririn
*/




        Scanner input = new Scanner(System.in);


        System.out.println("lutfen start degerini giriniz");
        int  start = input.nextInt();

        System.out.println("lutfen bitis degerini giriniz");
        int  end= input.nextInt();


        if(start>end){
            System.out.println("basalangic degeri bitis degerinden buyuk olamaz");
        }else {

            for(int i=start ; i<=end ; i++){

                if(i%2==0){
                    System.out.print(i+ " ");

        }


            }
        }

        // eger kullanici yanlis girerse, mesela baslangic degeri 23, 23 den 1'e gidecek
        // kullanici yanlislikla bitis degerini baslangic degeri olarak girdi
        // bud  a 24<1 i denlesine neden oldu loop un
        // boylece loop baslamadan kirildi
        // o nedenle yeni bir yazim yapiyoruz

        // bu nedenle asagidaki kismi ekledik
        /*if(start>end){
            System.out.println("basalangic degeri bitis degerinden buyuk olamaz");
        }else {

        }

        */





    }
}

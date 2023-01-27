package practice.practiceDTNT;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        /*
        kullanicidan bir gun alin
        eger gun cuma ise "Muslumanlar icin kutsal gun"
        eger gun cumartesi ise "Yahudiler icin kutsal gun"
        eger gun pazar ise "Hrsitiyanlar icin kutsal gun "
        yazdiran kodu olustururnuz
       " haricindeki hersey icin kutsal gun degildir"


         */


        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir gun giriniz");

        String dayName=input.next().toLowerCase();// tolowercase kucuk buyuk harf duyarliligini kaldirdik

        if(dayName.equals("cuma")){
            System.out.println("muslumanlar icn kutsal gun");
        }else if(dayName.equals("cumartesi")){
            System.out.println("yahudiler icin kutsal gun");
        }else if(dayName.equals("pazar")){
            System.out.println("hiristiyanlar icin kutsal gun");
        }else{
            System.out.println("Kutsal Gun degildir");
        }




    }
}

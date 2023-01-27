package day07ifStatements;

import java.util.Scanner;

public class IfStatements03 {

    public static void main(String[] args) {

        // Example 3: verilen bir sayinin pozitif negatif veya notr oldugunu kontrol eden kodu yaziniz

        Scanner input= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz..");
        int num=input.nextInt();

        if(num>0){
            System.out.println("sayi poizitiftir");

        }else if(num<0){
            System.out.println("sayi negtiftir");

        }else {
            System.out.println("sayi notr dur..");
        }

        // sayi pozitif ise java digerlerini aramiyor
        //istedigini bulmus cunku
        // ikinci de true yi bulduysaniz kalanlara java bakmayacak
        //else kullanmasaydik tum secenekleri tarayacakti

        // yukarda ki kod da 0 degeri girildiginde java sayiyi notr verecek



    }
}

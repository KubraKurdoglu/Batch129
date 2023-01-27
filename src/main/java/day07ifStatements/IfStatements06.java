package day07ifStatements;

import java.util.Scanner;

public class IfStatements06 {
    public static void main(String[] args) {

        /*
        example 1: kullanicinin yas degrini alan ve yasin hangi evrede oldugunu asagida ki
        tabloya gore yazdiran kodu olusturunuz
        0-4==> bebek
        5-12==> cocuk
        13-20==> genc
        21-30==> yetiskin
        30 ustu tanimlanmamis
        hata mesaji olarak "gecerli bir yas giriniz" yazdriniz

         */

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz...");
        int age=input.nextInt();

        if(age<0){
            System.out.println("gecerli bi yas giriniz");

        }else if(age<5){
            System.out.println("bebek");
        }else if(age<13){
            System.out.println("cocuk");

        }else if(age<21){
            System.out.println("genc");
        }else if(age<31){
            System.out.println("yetiskin");
        }else
            System.out.println("tanimlanamis yas");


       // if else kullanirken SIRA ONEMLIDIR
        //yerleini degistirirsek hata yapar
        // bebek cocuk genc yetiskin
        // genellikle soldan saga gidilir ama bu size verilen gorevin mantigi ile alakalidir

    }
}

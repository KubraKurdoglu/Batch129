package day08nestediternary;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {

        // example 1: kullanicidan iki sayi aliniz "buyuk olmayan" (kucuk veya esit olan sayiyi) yazdiriniz

        Scanner input=new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        double a=input.nextDouble();
        double b=input.nextDouble();
        //1.YOL if-else

        if(a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }


        //2.YOL: TERNARY
        //            condition  ? conditions true ise calisir    conditions false ise calisir
        double result=    a<b   ?     a                        :         b    ;
        System.out.println(result);









    }
}

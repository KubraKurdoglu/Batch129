package day07ifStatements;

import java.util.Scanner;

public class IfStatements05 {
    public static void main(String[] args) {

        // ay isimleri grirlince kacinci ay oldugunu yazan kodu yaziniz

        Scanner input= new Scanner(System.in);
        System.out.println("lutfen ay ismi giriniz..");
        String monthName=input.next();

        if(monthName.equalsIgnoreCase("Janvier")){
            System.out.println(1);

        }else if(monthName.equalsIgnoreCase("fevrier")){
            System.out.println(2);

        }else if(monthName.equalsIgnoreCase("mars")){
            System.out.println(3);

        }else if(monthName.equalsIgnoreCase("avril")){
            System.out.println(4);

        }else if(monthName.equalsIgnoreCase("may")) {
            System.out.println(5);
        }else if(monthName.equalsIgnoreCase("juin")){
                System.out.println(6);
        }else if(monthName.equalsIgnoreCase("jully")) {
            System.out.println(7);
        }else if(monthName.equalsIgnoreCase("august")){
                System.out.println(8);
        }else if(monthName.equalsIgnoreCase("september")){
            System.out.println(9);
        }else if(monthName.equalsIgnoreCase("october")){
            System.out.println(10);
        }else if(monthName.equalsIgnoreCase("november")){
            System.out.println(11);
        }else if(monthName.equalsIgnoreCase("december)")){
            System.out.println(12);
        }else{
            System.out.println("invalid month name");
        }


        /*

        NOTE: String lerin esitliklerini kontrol ederken "==" yerine "equals()" kullaniriz
        niye?
        STACK MEMORY
        i)Stack Memory de non primitivelerin adresleri depolanir.
        ii) primitivelerin ise kendileri depolanir

        HEAP MEMORY
        i) heap(huge) memory de ise non primitiveler depolanir



         */



        String s="Tom";
        String t="Terry";
        String r=new String("Tom");
        String m= "Tom";



        System.out.println(s==t);// false: cunku adresller ve dgerler farkli
        System.out.println(s.equals(t));// false cunku degerler farkli

        System.out.println(s==r);//false cunku adresler farkli
        System.out.println(s.equals(r));//true cunku equals method sadece degerlere bakar

    }
}

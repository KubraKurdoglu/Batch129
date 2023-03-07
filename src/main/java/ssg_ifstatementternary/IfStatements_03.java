package ssg_ifstatementternary;

import java.util.Scanner;

public class IfStatements_03 {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        System.out.println("bir gun giriniz");
       String gun= scan.next();

       if(gun.equalsIgnoreCase("pazar") || gun.equalsIgnoreCase("cumartesi")){
           System.out.println("haftasonu");

       }else{
           System.out.println("haftaici");
       }



       if(gun.equalsIgnoreCase("pazartesi") ||
       gun.equalsIgnoreCase("sali")|| gun.equalsIgnoreCase("carsamba")||
       gun.equalsIgnoreCase("persembe")|| gun.equalsIgnoreCase("cuma")){
           System.out.println("haftaici");
       }else {
           System.out.println("haftasonu");
       }



    }
}

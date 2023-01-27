package day07ifStatements;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {

        //Example 1: Gun saysini verdiginizde gun ismini yazan kodu yaziniz

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen kacinci gun oldugunu griniz..");

        byte day= input.nextByte();

        // 1,2, 3,4,5,6,7 yedi tane gun ihtimali var bir de
        // 8. ihtimal digerleri var bunu unutma

        if(day==1){
            System.out.println("sunday");
        }else if(day==2){
            System.out.println("monday");
        }else if(day==3){
            System.out.println("tuesday");
        }else if(day==4){
            System.out.println("wednesday");
        }else if(day==5){
            System.out.println("thursday");

        }else if(day==6){
            System.out.println("friday");

        }else if(day==7){
            System.out.println("saturday");

        }else{

            System.out.println("hatali giris yaptiniz..");

            // bu senaryoda mesela kullanici 12 girdi java ilk yedi secenegi denedi hicbirine uymadi
            // en son else ye geldi bakti orda bir kosul yok direk onu ekrana yazdirdi
            // yani hatali giris secenegini yazdirdi


        }
    }
}

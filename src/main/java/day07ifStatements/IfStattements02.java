package day07ifStatements;

import java.util.Scanner;

public class IfStattements02 {
    public static void main(String[] args) {

        //Example 2: kullanicidan alinan bir sayinin tek mi cift oldugunu yazdiran kodu olustrunuz
        //kullanicidan deger aldigimiz icin yine scanner

        Scanner input= new Scanner(System.in);
        System.out.println("lutfen bir sayi griniz..");

        int num=input.nextInt();

        //1.YOL

        if(num%2==0){
            System.out.println("Cift sayi..");

        }

        if(num%2!=0){
            System.out.println("tek sayi...");

        }

        //2.YOL

        if(num%2==0){
            System.out.println("Cift sayi..");

        }else{
            System.out.println("tek sayi...");

        }

        // if leri ayri ayri yazdiginda java tum if leri okumak zorunda
        // ama else kulladigimiz zaman java daha hizli calisiyor
        //ama bazen olur ki her sarti ayri ayri degerlendirmek gerekir
        // bu durum dise tek tek if lerin tumunu degerlendirmek gerekiyor


        // ne zaman else kullaniriz?
        // diger butun ihtimaller yanlis ise
        // sayini tek oldugunu biliyor tek ise cift degildir
        // her hangi bir sembol de degildir





    }
}

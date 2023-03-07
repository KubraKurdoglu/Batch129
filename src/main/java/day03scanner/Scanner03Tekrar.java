package day03scanner;

import java.util.Scanner;

public class Scanner03Tekrar {

    public static void main(String[] args) {

      // kullanicidan adresini al ve yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adresinizi giriniz..");

        String adress= scan.nextLine();
        System.out.println(adress);

    // kullanicidan sadece ilk adini aliniz

        Scanner scan2=new Scanner(System.in);
        System.out.println("lutfen ilkadinizi giriniz..");

        String fisrtname= scan2.next();
        System.out.println(fisrtname);

        // kullanicidan ilk ve son ismini aliniz

        Scanner scan3=new Scanner(System.in);
        System.out.println("lutfen ilk ve soy adinizi giriniz..");

        String fisrtlastname= scan3.nextLine();

        System.out.println(fisrtlastname);

        // Example: kullanicidan yasini ve boyunuzu giriniz

        Scanner scan4=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz..");

        int age= scan4.nextInt();
        System.out.println(age);



        //example: kullanicidan boyunu isteyiniz

        Scanner scan5=new Scanner(System.in);
        System.out.println("lutfen boyunuzu giriniz..");

        double size=scan5.nextDouble();
        System.out.println(size);


    }
}

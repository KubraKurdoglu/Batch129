package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        //Example 1: kullanici ile beraber bir Arrays olusturunuz


        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz");//Arrays de eleman sayisi onemli

        int numOfElements = input.nextInt();

        System.out.println("girisi sonlandirmak icin 'Q' tusuna basin");// bunu if kisminda yazabilirdik,
        // bir kez gormek icin buraya yazdik

        String stdNames[] = new String[numOfElements];

        for (int i = 1; i<=numOfElements; i++){

            System.out.println("Lutfen"+i + ". ogrencinin adini giriniz");

            String stdname = input.next();

            if (stdname.equalsIgnoreCase("Q")){
                break;
            }


            stdNames[i-1] = stdname;// i=1 oldugu icin ilk indeksi almak icin i-1 yapti


        }
        System.out.println(Arrays.toString(stdNames));




    }
}

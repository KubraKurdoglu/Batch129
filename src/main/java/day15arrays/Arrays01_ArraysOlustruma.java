package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01_ArraysOlustruma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen kac ogrenci gireceginiz yaziniz");
        int numOfElelement  = input.nextInt();

        System.out.println("Girisi sonlandirmak icin 'Q' tusuna basiniz");

        String[] stdnames = new String[numOfElelement];

        for (int i= 1; i<=numOfElelement ; i++){

            System.out.println("Lutfen  " +i+ ". ogrencinin adini giriniz");

            String stdname = input.nextLine();

            if (stdname.equals("Q")){
                break;

            }

            stdnames[i-1] = stdname;
        }
        System.out.println(Arrays.toString(stdnames));







    }
}

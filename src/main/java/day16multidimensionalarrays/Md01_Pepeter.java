package day16multidimensionalarrays;

import java.util.Arrays;

public class Md01_Pepeter {
    public static void main(String[] args) {


        int [][] a = new int[3][2];

         a [0][0] = 5;
         a [0][1] = 2;
         a [1][0] = 3;
         a [1][1] = 4;
         a [2][0] = 5;
         a [2][1] = 6;

        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.deepToString(a));

        //multi dimensional array'lerdeki belli elemanlara nasil ulasilir

        System.out.println(a[1][0]);

        System.out.println(Arrays.toString(a[2]));

        System.out.println(a[2][0]);






    }
}

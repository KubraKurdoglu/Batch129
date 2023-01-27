package day16multidimensionalarrays;

import java.util.Arrays;

public class Md02_Repeter {
    public static void main(String[] args) {


        int [][] arr = {{9,56,5},{5,7,8},{3,6,7}};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));

        //toplam eleman sayisini bulmak

        int sum = 0;

        for (int [] w: arr) {

           sum += w.length;

        }
        System.out.println(sum);

        int [][] brr = {{56,67,8,98},{12,45,32},{56,8,7,9}};

        System.out.println(Arrays.deepToString(brr));
        System.out.println(brr[0]);
        System.out.println(brr[1][0]);
        Arrays.sort(brr [0]);
        Arrays.sort(brr[1]);

        System.out.println(Arrays.deepToString(brr));

        int sum2 = 0;

        for (int [] w: brr) {

            sum2 += w.length;// brr arryas'inin eleman sayisini bulduk


        }
        System.out.println(sum2);

    }
}

package day16multidimensionalarrays;

import java.util.Arrays;

public class Md03_Repeter {
    public static void main(String[] args) {

        //Example 2: Bir tane integer multidimensional array olusturunuz
        //Bu array'deki tum sayilarin toplamini veren kodu yaziniz.

        int [][] arr = {{34,2,34,12}, {23,6,76},{2,5,7}};

        int sum = 0;

        for (int [] w: arr) {

            for(int k: w){

                sum += k;

            }


        }
        System.out.println(sum);


        //Tekrar ornegi

        int [][] brr = {{5,6,7},{6,9,10},{3,34,6}};

        System.out.println(Arrays.deepToString(brr));
        System.out.println(Arrays.toString(brr));
        System.out.println(brr);
        System.out.println(Arrays.toString(brr[0]));
        System.out.println(brr[1][0]);

        int sum2  = 0;

        for (int [] w: brr) {

            for (int s: w) {

                sum2 += s;

            }

        }
        System.out.println(sum2);

        /*
        System.out.println(Arrays.toString(a[2]));//[123, 0]
        System.out.println(a[1][0]);//81
         */

    }
}

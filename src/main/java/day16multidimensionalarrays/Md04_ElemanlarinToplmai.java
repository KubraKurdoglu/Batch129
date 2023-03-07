package day16multidimensionalarrays;

import java.util.Arrays;

public class Md04_ElemanlarinToplmai {
    public static void main(String[] args) {


        int[][] arr = {{4, 5, 6}, {7, 9, 12}, {3, 54, 6}};
        System.out.println(Arrays.toString(arr));

        int totalElelemnts = 0;

        for (int[] w : arr) {

            totalElelemnts = totalElelemnts + w.length;

        }
        System.out.println(totalElelemnts);

        int [] b = new int[totalElelemnts];

        int idx = 0;

        for(int [] w : arr){
            for (int a : w){

                b[idx] = a;
                idx++;

            }
        }

        System.out.println(Arrays.toString(b));

        Arrays.sort(b);
        System.out.println(Arrays.toString(b));





    }
}

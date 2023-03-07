package day16multidimensionalarrays;

import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {


        //Example 1: Bir multi-dimensioanal array olusturunuz ve  onun
        // elemanlarindan bir dimensionalarray olusturunuz
        //     [ [2, 5], [4, 7, 11] ==> [2, 5, 4, 7, 11]

        int a [][] = {{2, 5},  {4, 7, 11}} ;

        int totalElement = 0;

        for (int [] w : a){
            totalElement = totalElement +w.length;
        }

        // burda yeni bir arrays elde edecegimiz icin yeni bir array olusturmaliyiz
        // b =[ 0, 0 , 0 ,0 ,0] ==> buna degistirmeliyiz


        // "b" isimli tek dimensional'li bir array olusturunuz
        int b[] = new int[totalElement] ; //[0, 0, 0, 0, 0]



        // "a" array'indeki elemanlari "b" array'ine transfer ediniz


        int idx = 0;

        for (int[] w : a){
            for (int k : w){
                b[idx] = k;
                idx++;
            }

        }

        System.out.println(Arrays.toString(b));//[2, 5, 4, 7, 11]







    }
}

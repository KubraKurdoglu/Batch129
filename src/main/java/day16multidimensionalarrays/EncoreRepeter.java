package day16multidimensionalarrays;

import java.util.Arrays;

public class EncoreRepeter {
    public static void main(String[] args) {

        //Example 2: bir  integer  multi-dimensional arrays olusturunuz
        // toplam eleman sayisini konsola yazdriniz

        int arr [][] = {{3,4,5},{5,7,9},{1,0,9}};

        int sum =0;

        for (int [] w: arr) {

            sum += w.length;

        }
        System.out.println(sum);

        //Example 2: Bir tane integer multidimensional array olusturunuz
        //Bu array'deki tum sayilarin toplamini veren kodu yaziniz.

        int arr2 [][] = {{3,4,5},{5,7},{4,7,8}};
        int sum2 = 0;

        for (int [] q: arr2) {

            for (int k : q ){

                sum2 += k;

            }

        }
        System.out.println(sum2);



    }

}

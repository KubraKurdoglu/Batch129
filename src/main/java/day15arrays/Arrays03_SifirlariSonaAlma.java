package day15arrays;

import java.util.Arrays;

public class Arrays03_SifirlariSonaAlma {
    public static void main(String[] args) {

        //Example 1: [0, 2, 3, 12, 0] sifirlari en sona koyunuz [2, 3, 12, 0, 0, 0]

        int [] a ={0, 2, 3, 0, 12, 0};
        int [] b =new int[a.length];

        int idx = 0;

        for (int w:a) {

            if(w!=0){
                b[idx] = w;
                idx++;
            }

        }
        System.out.println(Arrays.toString(b));

        //Example 1: [4, 56, 0, 8, 0, 6, 5, 0] sifirlari en sona koyunuz [4, 56, 8, 6, 5, 0, 0, 0]

        int [] arr = {4, 56, 0, 8, 0, 6, 5, 0};
        int [] brr = new int[arr.length];


        int idx1 = 0;

        for (int w: arr) {

            if (w!=0){
                brr[idx1]= w;
                idx1++;

            }

        }
        System.out.println(Arrays.toString(brr));






    }
}

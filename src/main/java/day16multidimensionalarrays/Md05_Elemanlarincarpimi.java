package day16multidimensionalarrays;

import java.util.AbstractList;
import java.util.Arrays;

public class Md05_Elemanlarincarpimi {
    public static void main(String[] args) {

        ////Example 1: Bir integer multi-dimensional array olusturunuz
        ////           Bu array'deki tum elemanlarin carpimini console'a yazdiran kodu yaziniz


        int  a [][] = {{1,2,3}, {1,2,3}};


        int carpim = 1;

        for(int [] w : a){
            for (int b : w){

                carpim = carpim*b;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(carpim);


    }
}

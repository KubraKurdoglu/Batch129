package day16multidimensionalarrays;

public class Md06_ElemanlarCarpimi {
    public static void main(String[] args) {

        //Example 1: bir multi-dimensional arry'deki en buyuk ve en kucuk sayinin toplamini ekrana yaziniz

        int a[][] = { {21, 5}, {14, 70, 11} };

       int small =a [0][0];
       int big = a [0][0];

       for (int [] w : a){
           for (int k : w){

               small = Math.min(small, k);
               big = Math.max(big, k);

           }
       }
        System.out.println(small);
        System.out.println(big);
        System.out.println(small+big);








    }
}

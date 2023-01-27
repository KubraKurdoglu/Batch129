package day14arraysforeachloop;

import java.util.Arrays;

public class Arraystekrar02 {
    public static void main(String[] args) {

        //Example 1: Integer Array olusturunuz, icine 6 tane leeman olusturunuz,
        // bu elemenlarin en kucucgu ile
        // en buyugununn toplamini ekrana yazdiriniz

        int arr[] = new int[6];

        arr[0]= 12;
        arr[1]=4;
        arr[2]=34;
        arr[3]=15;
        arr[4]=23;
        arr[5]=24;

        System.out.print(Arrays.toString(arr));
        Arrays.sort(arr);// kucukten  buyuge dogru siralamak icin bunu kullandik ardindan bir sout yazdik
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]+arr[arr.length-1] );



        // sana verilen degerlerin arasinda ilk elamani al, sonra ikinci ile karsilastir
        // kucuk olani sec kutuya koy, sonra diger elemani al onu karsilastir
        // kucuk olani kutuya koy digerini birak
        // tum degerleri boyle karsilastir
        // sonra array old icin for-each-loop ile kullan


        int maximum =  arr [0];
        int minimum = arr [0];

        for( int w :arr){

            minimum=Math.min(minimum, w);
            maximum=Math.max(maximum, w);


        }

        System.out.println(minimum);
        System.out.println(maximum);
        System.out.println(maximum+minimum);



    }
}

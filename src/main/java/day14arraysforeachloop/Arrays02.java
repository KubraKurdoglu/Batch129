package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Example 1: Integer Array olusturunuz, icine 6 tane leeman olusturunuz,
        // bu elemenlarin en kucucgu ile
        // en buyugununn toplamini ekrana yazdiriniz

        //Integer ages[]= new Integer[6];  bu int ages[]= new int[6] olarakda yazilabilir
        //Integer[] ages= new Integer[6];==> boyle de calisir, yani array in parantezi once de olur
        // array'lerin icine primitive de non-primitive de yazabilirsin
        //(String[] args)==> bu main method daki kullanim
        // buda bir array

       int ages[]= new int[6];

        ages [0] =20 ;
        ages [1] =23;
        ages [2] =15;
        ages [3] =19 ;
        ages [4] =44 ;
        ages [5] =32 ;

        System.out.println(Arrays.toString(ages));//[20,23,19, 44, 32]

        //sort() methodu array deki leri kucukten buyuge siralar
        Arrays.sort(ages);// bundan sonra asagi, asagidaki sekilde bir sout yazmalisin

        System.out.print(Arrays.toString(ages));//[15, 19, 20, 23, 32, 44]

        System.out.println();// bos sout attim degerleri net gorebilek icin
        System.out.print(ages[0]+ages[ages.length-1]);


        System.out.println();

        //2.YOL
        // sana verilen degerlerin arasinda ilk elamani al, sonra ikinci ile karsilastir
        // kucuk olani sec kutuya koy, sonra diger elemani al onu karsilastir
        // kucuk olani kutuya koy digerini birak
        // tum degerleri boyle karsilastir
        // sonra array old icin for-each-loop ile kullan

        int minimum = ages[0];
        int maximum = ages [0];

        for(int w :ages ){

            minimum=Math.min(minimum,w);// matematik yerine gitti min'i secti
            maximum=Math.max(maximum,w);
        }

        System.out.println(minimum);
        System.out.println(maximum);
        System.out.println(minimum+maximum);




    }
}

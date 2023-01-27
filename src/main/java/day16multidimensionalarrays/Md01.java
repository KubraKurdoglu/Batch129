package day16multidimensionalarrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {


        //MultiDimensional array nasil olusturulur
        // tek parantez koyarsaan bir boyutlu array
        // a [][] ==> iki boyutlu array



        int a[][] = new int[3][2];// 3==> buyuk parantezin icinde 3 eleman var, o uc elemanin
        // her birinin icinde iki eleman var
        //YANI 3 INDEXLI? BIRINCI PARANTEZ ICINDEKI INDEX,
        // IKINCI PARANTEZ ICINDEKI O INDEX LERDEKI ELEMAN SAYISI
        // inner arraylerin herbirine ayni sayida eleman koyduk


        //multi dimensional array'ler nail yazdirilir
        System.out.println(Arrays.toString(a));//[[I@2f92e0f4, [I@28a418fc, [I@5305068a]
        // bu yukardaki bize adreslerini verdi sadece

        System.out.println(Arrays.deepToString(a));//[[0, 0], [0, 0], [0, 0]]

        //yukardakki kodla herseyiyle yazdiridik


        //multi dimensional array'lere eleman nasil eklenir
        //mesela yukardaki 5 degerini almak isiyoruz

        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;
        System.out.println(Arrays.deepToString(a));

        //NOTE: arrays'ler non-primitive datayi iceremezler
        //Arrays'lere primitive data veya reference konulur
        // ama siz bir Arrays yazdirmak istedginizde Java adresler yardimi ile
        // non- primitive data ya ulasir ve o non- primitive datayi sanki arrays'in icinde imis gibi
        //gosterir


        //multi dimensional array'lerdeki belli elemanlara nasil ulasilir
        // System.out.println(Arrays.toString(a[2]))==> 2. index'in tamaminda ne var diye bakiyor

        System.out.println(Arrays.toString(a[2]));//[123, 0]
        System.out.println(a[1][0]);//81

        System.out.println(Arrays.toString(a[0]));//[5, 12]
        System.out.println((a[2][1]));// 0









    }
}

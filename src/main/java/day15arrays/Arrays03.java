package day15arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {


        //Example 1: [0, 2, 3, 12, 0] sifirlari en sona koyunuz [2, 3, 12, 0, 0, 0]
        // a = [2, 3, 12, 0, 0, 0] olmali birde yeni bir arrays yazmaliyiz, bos olmali
        // ve onu ayni a sayisinda eleman yazmaliyiz b=[0, 0, 0, 0, 0, 0]
        //b'nin sifir olan elemanlarina dokunmamali, sifir disindakileri basa almaliyiz
        // for loop kullanabiliriz, for each da kullanabiliriz

        int a[] = {0, 2, 3,0, 12, 0};
        int b[] = new int[a.length]; // burda b'yi a'ya bagladik yani dinamik bir kod yaptik
        //yeni bir array olusturduk cunku yeni bir sey olusturacagiz
        //DIKKAT!!! int b[] = new int[a.length]; ==> bununla yeni olusturdugumuz b'nin eleman sayisini
        //a'nin eleman sayisina esitledik

        int idx = 0;

        for (int w : a){//a'dan w'ye eleman cek, herbir elemani asagidaki sarta gore degerlendir
            // a'daki elemanlarin herbirini denemen lazim herahngi bir sarta bagli olmadan
            // denedigin elemanlarin sonucu true oldukca idx'i artir
            //cunku idx'i artirma sarti w!=0 oldukca artir

            if(w!=0){

                b[idx] = w;// b isimli array' e git index'e w degerini koy

                idx++;
            }
        }
        System.out.println(Arrays.toString(b));




    }
}

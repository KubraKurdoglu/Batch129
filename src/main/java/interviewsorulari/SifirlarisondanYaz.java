package interviewsorulari;

import java.util.Arrays;

public class SifirlarisondanYaz {
    public static void main(String[] args) {

        //Example 1: [0, 2, 3, 12, 0] sifirlari en sona koyunuz [2, 3, 12, 0, 0, 0]
        // a = [2, 3, 12, 0, 0, 0] olmali birde yeni bir arrays yazmaliyiz, bos olmali
        // ve onu ayni a sayisinda eleman yazmaliyiz b=[0, 0, 0, 0, 0, 0]
        //b'nin sifir olan elemanlarina dokunmamali, sifir disindakileri basa almaliyiz
        // for loop kullanabiliriz, for each da kullanabiliriz

        int a[] = {0, 2, 3,0, 12, 0};
        int b[] = new int[a.length]; // burda b'yi a'ya bagladik yani dinamik bir kod yaptik

        int idx = 0;

        for (int w : a){

            if(w!=0){

                b[idx] = w;// b isimli array' e git index e w degerini koy

                idx++;
            }
        }
        System.out.println(Arrays.toString(b));








    }
}

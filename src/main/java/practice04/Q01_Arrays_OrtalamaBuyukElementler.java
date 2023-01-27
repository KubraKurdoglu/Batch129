package practice04;

import java.util.ArrayList;

public class Q01_Arrays_OrtalamaBuyukElementler {
    public static void main(String[] args) {

        //Verilen bir Array'in elementlerinin ortalamasından büyük elementleri yazdıran bir kod yazınız.


        int[] arr= {5,9,15,1,0,11,3};

        int toplam = 0;

        for (int w:arr) {
            toplam += w;
        }
        int ortalama = toplam/arr.length;
        System.out.println("ortalama: "+ ortalama);



        for (int w:arr){
            if (w>ortalama){
                System.out.println(w);
            }
        }


        // burda ortalama aldigi icin "double" da kullanbilirdik
        //ama elamanlari int aldigimiz icin ortalamada int olacaktir
    }
}

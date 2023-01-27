package day19listvarargs;

import java.util.*;

public class List03 {
    public static void main(String[] args) {
        /*
                SAYI TAHMIN OYUNU
    Oyuncudan 1-10 arasi bir sayi isteyiniz
    Elinizdeki listede oyuncunun tahmin ettigi sayi varsa "BINGO" yazdiriniz
    Yoksa verdigi sayiyi listenize ekleyiniz.
    Ilk "BINGO" yu tamamlayana " KAZANDINIZ" yazdiriniz
    [5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
    [5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
    [5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ
*/


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen 1 ile 10 arasinda bir sayi giriniz");

        //Arrays.asList() ile list olusturulabilir ama
        //Ama List'lerdeki "eleman sayisini" degistiren hicbir method bu list icin kullanilmaz
        // mesela bu soruda asList() kullanilamaz, cunku "bingo"yu bulamayinca o elemani ekle diyor
        
        List<Integer> numsLists = Arrays.asList(5,8,2,9);













    }
}

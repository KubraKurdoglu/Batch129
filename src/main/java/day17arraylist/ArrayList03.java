package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Miami");
        cities.add("istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");
        System.out.println(cities);

        //remove() ==> silmek demek
        // iki tane remove methodu var , bir indeksli biri ise object li
        // remove methodu index il ekullanilirsa o elemani siler
        // remove methodu object ile kullanilirsa o elemanin ilk gorunumunu siler


        // java index'le sildiginde onaylama geregi duyar
        // ve size sildigi elemani verir
        // remove index li de bunu yapar
        // mesela asagoda yaptgin isi yazdir
        // direk sildigi elemani yazdirir
        // ama remove() methodunu object ile kullanirsak o zaman sildim o elemani anlaminda true verir
        // elemani vermez
        // o eleman yoksa o elemani silemedigindensize  false verir
        // DIKKAT "clear()" toplu siliyordu



        // 1. indeksteki elemani sil dedik
        String n = cities.remove(1);
        System.out.println(n);// iste bu bize sildigimiz index'e denk gelen elemani verecek
        System.out.println(cities);

        // "Kayserinin" ilk gorunumunu sil dedik
        boolean b =  cities.remove("Kayseri");
        System.out.println(b);// burasi bize false verecek cunku kayseri yok ki silsin
        System.out.println(cities);








    }
}

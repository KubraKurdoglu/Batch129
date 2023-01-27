package day13whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a = 12; // bu yapinin icinde sadece bir tane data depolanbilir.
        // ama bir code yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz
        // bir yapinin icinde coklu data depolayabilmem icin Java "Array" yapisini olusturmustur;

        // Arrays'lar nasil olusturulur?
        // Bir Arrays tek bir data tipinde olusturulur
        // icine farkli bir data tipi karistirilmaz
        // [] bu Arrays isaretidir
        //String stdNames[] = new String[];   bunu yazinca hemen hata verdi
        // cunku icine kac tene yazaccagini soylemen lazim
        //1. data tipini soylemen lazim
        //2. kac tane koyacagini soylemen lazim
        // kac tane data koyacagini soylemezsen "Arrays" olmaz



        String stdNames[] = new String[5];


        // Arrays console a nasil yazdirilir
        // toString() methodunu kullanladan sadece array ismi ile yazdrirsaniz Java o Array'in adresini yazdirir

        System.out.println(Arrays.toString(stdNames));//[null, null, null, null, null]


        // Array'e elaman ekleme nasil yapilir
        // array'ler de de index ile elaman ekliyoruz

        stdNames[2] ="ajda";
        stdNames[0] = "cuneyt";
        stdNames[1] = "kemal";
        stdNames[3] = "ezel";
        stdNames[4] = "besir";


        System.out.println(Arrays.toString(stdNames));

      // Arrays'den spesifik bir elemani almak

        System.out.println(stdNames[2]);

        // git bu Array'a "ajda" yi al yani onun indeksini gir


        //Example 1; Arrays'deki her elemanin sonuna unlem "!" koydurup yazdir
        // dikkat et bu tekarli bir is loop kullanman lazim
        // son indekse gitmek icin lenght kullandik ama parantezsiz


        for (int i=0; i< stdNames.length; i++ ){

            System.out.println(stdNames[i] + "!");
        }





    }
}

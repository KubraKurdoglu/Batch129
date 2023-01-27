package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {



        //NOTE 1: "sort() methodu" sayisal data tiplerini kucukten buyuge siralar(ascending order)
        //NOTE 2: "sort() methodu" String data tiplerini alfabetik  olarak siralar(alphabetical order)
        //NOTE 3: ascending order + alphabetical order ==> Natural order
        //NOTE 4: "sort()" methodu array elemanlarini "natural order" agore siralar

        //NOTE 5:binarySearch() Method'u bir eleanin bir array'de olup olmadigini kontrol etmek icin kullanilir
        //       binarySearch() method'unu kullanmadan once "sort()" method'unu kullanmak zorundayiz;
        //       sort() methodunu kulllanmazsaniz buldugunuz sonuc guvenilir olmaz
        //       binarysearch() i kullanirken once arrays'in ismini kullan
        //       sonra aradigin elemani yaz


        String colors[]= new String[6];

        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";


        Arrays.sort(colors);

        System.out.println(Arrays.toString(colors));

        int num1 = Arrays.binarySearch(colors,"Blue");
        System.out.println(num1);// bu alta 0 yazdirdi, cunku blue'nin index i sifir

        int num2 = Arrays.binarySearch(colors,"Orange");
        System.out.println(num2);// 3 yazdirdi cunku 3. indexte bu eleman

        int num3 = Arrays.binarySearch(colors,"kubra");
        System.out.println(num3);//-6 verdi, "-" eksi isareti bu eleman yok demek
        // ama olsaydi bu 6. eleman olacakti, cunku alfabetik siraladik eger olsa
        // oraya yerlestirecekti


    }
}

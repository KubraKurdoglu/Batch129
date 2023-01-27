package day21statickeyword;

public class Student {

    /*
    1) Static variable veya static method'lar(class member) tum objeler icin ortak elemandir
    2) static class member'lar uzerinde yapilan tum degisiklikler tum objeleri etkiler
    3) static class member'lar Class'a, non-static class member'lar object'lere monte edilirler
    mesela bir class'tan 100 tane object olusturdugunuzda, non-static olanlar 100 kere olusturulur.
    Ama static olanlar object sayisindan bagimsiz olarak bir kere olusturulur.
    4) static class member'larar ulasmak icin object olusturmaya gerek yoktur, ama non-static class
    member'lara ulasmak icin object olusturmak gerekir

    5) Static variable'nin diger adi "Class variable'dir"
    Non-stataic Variable'larin diger adi "Instance Variable" veya "Object Variable" dir


     */


    static String stdName = "Tom Hanks";

    public int age = 13;

    //Ogrenci isminin ve soyisminin ilk harflerini veeren methodu olusturunuz

    public static  String getInitials(String name){

        String first = name.substring(0,1);
        String second = name.split("")[1].substring(0,1);

        return first  + second;

    }

    // yukarda kestikten sonra birinci index'teki
    //soyadi aldi, [1]==> bunu 1. index'teki soyadi alabilmek icin yazdi
    // ve onun 0'inci degerini alabilmek icin substring(0, 1) yazdi "C" yi almak icin yazdi
    // "first" ==> "A" , "second"==> "C" oluyor

    //soru: ogrenci ismindeki sesli harfleri (a,e,i,o,u) sayan bir method olusturunuz

    public int countVowels(String name){

        int counter =0;

        for(int i=0; i<name.length(); i++){

            char ch = name.toLowerCase().charAt(i);

            switch (ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }
        }
        return counter;

    }


}

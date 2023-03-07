package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Example 1; String bir Array olustrunuz
        // 6 tane eleman yerlestiriniz
        // karakter sayisi 5'den cok olan elemanlari siliniz(orange ile yellow silinmeli

        String colors[]= new String[6];

        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        System.out.println(Arrays.toString(colors));//[Red, Orange, Blue, Yellow, Green, Brown]

        // Logic: yeni bir Array olusturup karakter sayisi 5 ve 5'ten kucuk olan elemanlari yeni array'a
        //transfer edecegiz
        // boylelikle yeni array'de karakter sayisi 5'den buyuk olan hicbir eleman olmayacak


        //soru : hocam , array olusturmak icin iki sey belirlenmelidir
        // 1. elemanmarin data type si
        // 2. yeni array'de kac tane eleman olacak


        // verilen array de eleman sayisi 5 ve 5'ten kucuk kac eleman var onu bulmaliyiz

        int counter = 0;

        for(String w : colors){
            if (w.length() <= 5) {

                counter++;
            }
        }


        //yeni array olustur

        String newColors[] = new String[counter];

        //karakter sayilari 5 ve 5'den kucuk olanlari yeni array'a transfer et
        // boylece silmis gibi oluyorsun


        int idx = 0;//burda indeex olusturduk cunku yeni array'e elemanlari index'le yerlestirecegiz


        for(String w :colors){

            if(w.length()<=5){
                newColors[idx] = w ;


                idx++;//idx surekli degerlerle dolacagi icin her islemden sonra index'i artir
            }
        }
        System.out.println(Arrays.toString(newColors));//[Red, Blue, Green, Brown]



    }
}

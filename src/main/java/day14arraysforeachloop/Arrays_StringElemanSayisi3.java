package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays_StringElemanSayisi3 {
    public static void main(String[] args) {

      /*  String [] colors = new String[6];


        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        System.out.println(Arrays.toString(colors));


        int counter = 0;

        for(String w: colors){

            if(w.length()<=5){
                counter++;
            }
        }
        System.out.println(counter);

        String [] newColors = new String[counter];

        int idx=0;

        for(String w: colors){

            if(w.length()<=5){
                newColors[idx]= w;

                idx++;
            }

        }
        System.out.println(Arrays.toString(newColors));



       */


        String [] colors = new String[6];


        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";


        System.out.println(Arrays.toString(colors));

        int counter = 0;

        for (String w : colors){

            if(w.length()<6){

                counter++;

            }
        }
        System.out.println("counnter; "+counter);

        String [] newColors = new String[counter];

        int idx = 0;

        for (String w:colors){

            if(w.length()<6){
                newColors[idx]=w;

                idx++;//idx surekli degerlerle dolacagi icin her islemden sonra index'i artir
            }


        }





    }
}

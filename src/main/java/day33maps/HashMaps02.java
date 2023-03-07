package day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMaps02 {
    public static void main(String[] args) {

        //Example 1: size verilzn bir cumledeki herbir kelimenin kacar kere kullanildigini gosteren kodu yaziniz.
        //           "Java is easy. Java is OOP. OOP makes Java easy."==> Java=3, is=2, eassy=2, OOP=2, makes=1
        // Java=3==> bu yapi map  yapisi cunku "key" ve "value" var.

        HashMap<String, Integer> wordsMap = new HashMap<>();

        String sentence = "Java is easy. Java is OOP. OOP makes Java easy.";

        //kelimeleri sayarken mutlaka noktalama isaretlerini silmelisin. cunki java'ya gore "OOP." ==> burdaki nokta da bir karakter
        // onu da sayaack

        sentence = sentence.replaceAll("\\p{Punct}","");

        //String'ler immutable'dir. sadece method kullanarak String'lerin degerini degistiremezsin. o nedenle yeni degeri
        // String'e assigne ettin. bu sekilde ==>  sentence = sentence.replaceAll

        String[] wordsArray = sentence.split(" ");
        System.out.println(Arrays.toString(wordsArray));//[Java, is, easy, Java, is, OOP, OOP, makes, Java, easy]


        for (String w : wordsArray){
            Integer numOfOccurrence = wordsMap.get(w);
            if (numOfOccurrence==null){
                wordsMap.put(w,1);
            }else{
                wordsMap.put(w,numOfOccurrence+1);//burda "replace" de kullanilabilir.
            }
        }
        System.out.println(wordsMap);//{Java=3, OOP=2, makes=1, is=2, easy=2}






    }
}

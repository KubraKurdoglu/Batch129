package day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMaps03 {
    public static void main(String[] args) {

        //Example 1: Size verilen bir cumlede kullanilan harflerin gorunum sayisini gosteren kodu yaziniz.
        //           "java is Java." ==> J=2, a=4, v=2, i=1, s=1

        HashMap<String, Integer> lettersMap = new HashMap<>();

        String sentence = "Java is Java.";
        // once harf disindaki herseyi sil diyecegiz


        sentence = sentence.replaceAll("[^a-zA-Z]", "");
        System.out.println(sentence);

        String[] lettersArrays = sentence.split("");// hicbir sey ile boluyoruz

        //split()'in bize ne dondurdugune kutuphane den bakabilirsin.

        System.out.println(Arrays.toString(lettersArrays));//[J, a, v, a, i, s, J, a, v, a]

        for (String w : lettersArrays){

            Integer numOfOccurence = lettersMap.get(w);

            if (numOfOccurence==null){

                lettersMap.put(w,1);
            }else {
                lettersMap.replace(w, numOfOccurence+1);
            }
        }
        System.out.println(lettersMap);








    }
}

package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {
    public static void main(String[] args) {

        /*
        nums.indexOf() ilk gorunumun index ini verir. List tekararli elemana sahip ise
        nums.indexOf kullanmak riskli olabilir .
        bu yuzden soruda en guvenli yol "for-loop"tur

         */


        //Example 1: Bir Integer List teki 7 haric tum elemanlarin degerini 3 artiriniz



        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(7);
        nums.add(12);
        nums.add(11);


        //1.YOL


        for(Integer w: nums){

            if(w==7){
                continue;
            }
            nums.set(nums.indexOf(w), w+3);// set methodu kullanarak elemanmari degistirdi
            // for each de index yok, onu da yukarda ki sekilde cozdu
        }
        // indexof hep birinci gorunumun index ini verir
        // ayni elemanlar olunca sikintili olabilir
        // o nedenle hata ihtimali daha az olan yolu secmek daha akillicadir



        System.out.println(nums);//[15, 16, 7, 15, 14]

        //SET methodu index kullanmak zorunda ya
        // o nedenle for loop u kullanmak daha az riskli
        //


        //2.YOL

        for(int i = 0;  i<nums.size(); i++){

            int element = nums.get(i);


            if(nums.get(i)==7){
                continue;
            }
            nums.set(i, nums.get(i)+3);
        }
        System.out.println(nums);//[18, 19, 7, 18, 17]











    }
}

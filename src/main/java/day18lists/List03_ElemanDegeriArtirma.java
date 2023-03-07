package day18lists;

import java.util.ArrayList;
import java.util.List;

public class List03_ElemanDegeriArtirma {
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(7);
        nums.add(12);
        nums.add(11);

        System.out.println(nums);

        for (int w: nums) {
            if (w==7){
                continue;

            }

            nums.set(nums.indexOf(w), w+3);

        }
        System.out.println(nums);


        for (int i = 0; i <nums.size() ; i++) {
            if (nums.get(i)==7){
              continue;
            }
           nums.set(i, nums.get(i)+3);


        }
        System.out.println(nums);

    }
}

package day18lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List02_Repeter {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(12);
        nums.add(43);
        nums.add(8);
        nums.add(9);

        System.out.println(nums);

        Collections.sort(nums);
        System.out.println(nums);

        int minDiffrent = nums.get(1) - nums.get(0);

        for (int i = 1; i < nums.size(); i++) {

            minDiffrent = Math.min(minDiffrent, nums.get(i) - nums.get(i-1));

        }
        System.out.println(minDiffrent);

        for (int i = 1; i < nums.size(); i++) {

            if (nums.get(i) - nums.get(i -1) == minDiffrent) {

                System.out.println(nums.get(i) + " ve " + nums.get(i -1) );
            }

        }
    }
}
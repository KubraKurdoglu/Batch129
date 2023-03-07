package day18lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists02 {
    public static void main(String[] args) {

        //Example 1: Bit tane Integer list olusturunuz
        //          Bu list'te birbirine en yakin elemani yaziniz
        //         [12, 23, 9, 11]

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(9);
        nums.add(11);



        Collections.sort(nums);

        System.out.println(nums);//[9, 11, 12, 23]

        int minDiff = nums.get(1)-nums.get(0);

        for(int i = 1; i<nums.size() ; i++){

            minDiff = Math.min(minDiff, nums.get(i)-nums.get(i-1));
        }

        System.out.println(minDiff);

        for(int i =1; i<nums.size(); i++){
            if(nums.get(i)-nums.get(i-1)==minDiff) {

                System.out.println(nums.get(i-1)+ " and "+ nums.get(i));
            }
        }











    }
}

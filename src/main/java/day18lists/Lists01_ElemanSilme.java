package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01_ElemanSilme {
    public static void main(String[] args) {


        List<Integer> ages = new ArrayList<>();

        ages.add(23);
        ages.add(12);
        ages.add(4);
        ages.add(78);
        ages.add(12);
        ages.add(2);
        ages.add(12);


        System.out.println(ages);

        ages.remove((Integer)12);
        System.out.println(ages);
        ages.add(89);
        System.out.println(ages);

        List<Integer> silinecekler = new ArrayList<>();

        silinecekler.add(12);
        silinecekler.add( 78);

        ages.removeAll(silinecekler);
        System.out.println("silinmis liste  " +ages);



    }
}

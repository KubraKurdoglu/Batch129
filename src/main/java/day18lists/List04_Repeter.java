package day18lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List04_Repeter {
    public static void main(String[] args) {

        List<String> names  = new ArrayList<>();

        names.add("Cuneyt");
        names.add("Ajda");
        names.add("Mahsun");
        names.add("Muslum");
        names.add("Orhan");

        List<String> females = new ArrayList<>();

        females.add("Ajda");
        females.add("Emel");

        boolean b = names.containsAll(females);
        System.out.println(b);


        List<String> nouvellenames = names.subList(2,5);
        System.out.println(nouvellenames);

        names.retainAll(females);

        System.out.println(names);



    }
}

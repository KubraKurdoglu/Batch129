package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03_Methodlar {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Miami");
        cities.add("istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");
        System.out.println(cities);

        cities.remove("Almaty");
        System.out.println(cities);

        cities.remove(2);
        System.out.println(cities);




    }
}

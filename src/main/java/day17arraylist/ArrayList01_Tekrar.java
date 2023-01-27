package day17arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList01_Tekrar {
    public static void main(String[] args) {

        List<Integer> ages = new ArrayList<>();

        ages.add(7);
        ages.add(9);
        ages.add(10);
        ages.add(11);
        ages.add(23);

        System.out.println(ages);

        ages.add(2);
        System.out.println(ages);

        ages.add(2,1);
        ages.add(3,455);

        System.out.println(ages);

        List<Integer> newAges = new ArrayList<>();

        newAges.add(13);
        newAges.add(12);
        newAges.add(9);



        ages.addAll(newAges);
        System.out.println(ages);

        List<Integer> yeniYaslar = new ArrayList<>();

        yeniYaslar.add(56);
        yeniYaslar.add(23);

        System.out.println(yeniYaslar);

        List<Integer> tousLesAges = new ArrayList<>();

        tousLesAges.addAll(ages);
        System.out.println(tousLesAges);

        yeniYaslar.addAll(1,tousLesAges);
        System.out.println(yeniYaslar);

        boolean b = tousLesAges.contains(23);
        System.out.println(b);

        List<String> names  = new ArrayList<>();

        names.add("Tim");
        names.add("Kim");
        names.add("Tom");

        System.out.println(names);

        List<String> names2 = new ArrayList<>();

        names2.add("Kim");
        names2.add("Tom");
        names2.add("Tim");

        System.out.println(names2);

        boolean c = names.equals(names2);
        System.out.println(c);

        List<Integer> chiffres = new ArrayList<>();

        chiffres.add(3);
        chiffres.add(7);
        chiffres.add(9);

        System.out.println(chiffres);

        List<Integer> chiffres2 = new ArrayList<>();

        chiffres2.add(7);
        chiffres2.add(3);
        chiffres2.add(9);

        System.out.println(chiffres2);

        Collections.sort(chiffres);
        Collections.sort(chiffres2);

        System.out.println(chiffres);
        System.out.println(chiffres2);

         boolean t=chiffres.equals(chiffres2);

        System.out.println(t);




    }
}

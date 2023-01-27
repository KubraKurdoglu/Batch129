package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02_repeter {
    public static void main(String[] args) {


        List<Character> initials = new ArrayList<>();

        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        System.out.println(initials);
        int elemenanSayisi  = initials.size();

        System.out.println(elemenanSayisi);

        char ch = initials.get(2);
        System.out.println(ch);


        //Verilen bir String list'teki emlemanlarin toplam karakter sayisini bulan kodu yaziniz

        List<String> cities = new ArrayList<>();

        cities.add("Miami");
        cities.add("istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        System.out.println(cities);

        int totalElelemnt = 0;

        for (String w : cities) {
           totalElelemnt += w.length();

        }
        System.out.println(totalElelemnt);


        int sum = 0;

        for (int i = 0; i < cities.size(); i++) {

            sum += cities.get(i).length();

        }
        System.out.println(sum);

        cities.set(2,"Rize");

        System.out.println(cities);

        List<Double> lesSalaries = new ArrayList<>();

        lesSalaries.add(2987.00);
        lesSalaries.add(3765.00);
        lesSalaries.add(4567.00);
        lesSalaries.add(2345.00);

        int idx = 0;

        for (double w: lesSalaries) {

            lesSalaries.set(idx, w*1.20);
            idx++;

        }

        System.out.println(lesSalaries);



        for (int i = 0; i < lesSalaries.size(); i++) {


            lesSalaries.set(i, lesSalaries.get(i)*1.20);

        }
        System.out.println(  lesSalaries);


    }
}
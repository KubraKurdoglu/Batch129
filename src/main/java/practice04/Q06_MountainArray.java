package practice04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q06_MountainArray {
    /*
 Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
 Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o
 noktadan sonra sürekli azalan Array.

 // surekli artan bir noktadan sonra azalan

  */


    public static void main(String[] args) {

        int[]  arr = {-999,1, 2, 5, 7, 9, 22, 8, 3, 1, -100};

        //array'i List'e cevir

        List<Integer> list= new ArrayList<>();

        for (int w: arr) {

            list.add(w);

        }

        // max degeri bulmaliyiz
        // max degeri alan direk bir method yok
        // en kolay yol, sirala en son degeri al
        // fakat burda onu yapamiyoruz, cunku burda bizden max degeri istemiyor
        // "mountain array" istiyor
        //mountain array'de de zirve noktadan sonra ikiye ayirman gerekiyor
        // bunu "break" ile yapmalisin
        // mesela ==>  1 2 5 15-13 2 1 ==> 15'den itibaren kesmelisin

        int max= list.get(0);

        for (int w : list){
            if(w>max){
                max=w;
            }
        }
        System.out.println("list = " + list);
        System.out.println("maw = " + max);


        //List1
        List<Integer> list1 = new ArrayList<>();
        for(int i=0; i< list.size(); i++){
            if(list.get(i)==max){
                break;
            }
            list1.add(list.get(i));
        }

        System.out.println("list1 = " + list1);

        //List2

        List<Integer> list2 = new ArrayList<>();
        for (int i=0; i<list.size(); i++){
            if(i<list.indexOf(max)){
                continue;
            }
            list2.add(list.get(i));
        }
        System.out.println("list2 = " + list2);

        //Yedekleyip kopyalamak

        List<Integer> list1kopy = new ArrayList<>(list1);
        List<Integer> list2kopy = new ArrayList<>(list2);



        Collections.sort(list1kopy);// boylece list1'in orjinal hali degisti

        Collections.sort(list2kopy);
        Collections.reverse(list1kopy);


        System.out.println(list1kopy);
        System.out.println(list2kopy);



        // Kontrol

        if(list1.equals(list1kopy) && list2.equals(list2kopy)){
            System.out.println("Mountain Array");
        }else {
            System.out.println("mountain array degil");
        }

    }

}

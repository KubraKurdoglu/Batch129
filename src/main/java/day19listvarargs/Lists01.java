package day19listvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {
    public static void main(String[] args) {

        // Example 1: verilen bir list'teki elemanlari tekrarsiz olarak yazdiriniz
        //           [2, 3, 2, 2, 3, 5]==> [2, 3, 5]

        //yeni bir list olusturup, eski list ile yeni list'i karsilastirmaliyiz
        // yeni list'e eleman koyarken ayni elemanlari almiyoruz



        List<Integer> myList = new ArrayList<>();

        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(5);

        List<Integer> newList = new ArrayList<>();

        for (Integer w : myList){
            if (!newList.contains(w)){// newList w'deki elemanlari icermiyorsa

                newList.add(w);
            }
        }
        System.out.println(newList);


        //Example 2: musteriden urun ismini aliniz, musterinin ismini verdigi urun listee varsa
        // urunun ismini yazdiriniz
        //musterinin ismini verdigi urun listede yokda "out of stock" yazdiriniz


        Scanner input = new Scanner(System.in);
        System.out.println("Urun arama sitemize hosgeldiniz");
        System.out.println(" urun aramayi sonlandirmak icin Q'ya basiniz");



        List<String> products = new ArrayList<>();

        products.add("TV");
        products.add("Radio");
        products.add("iPad");
        products.add("PC");
        products.add("Notebook");
        products.add("Mobil Phone");


        do{

            System.out.println("Aradiginiz urunun ismini giriniz");

            String p = input.nextLine();


           if (p.equalsIgnoreCase("Q")){
               break;
           } else if (products.contains(p)) {
               System.out.println(p);

           }else {
               System.out.println(" Out Of Stock..");
           }

        }while (true);// burayi "true" yapti, "sonsuz loop" yaptim dedi
        //yani isterse kullanici cikar, ama cikmazsa dongu devam eder surekli


        System.out.println("sitemizi kullandiginiz icin tesekkur eder, tekrar bekleriz");












    }
}

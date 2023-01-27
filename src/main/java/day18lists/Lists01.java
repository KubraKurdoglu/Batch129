package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {

        //Example 1: integer bir list olusturunuz
        //           list'e 5 tane elaman ekleyiniz
        // o elemanlardan 12'yi siliniz


        List<Integer> ages = new ArrayList<>();

        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(40);
        ages.add(12);

        ages.remove((Integer)12);

        // java'da tamsayi yazdifginda java o tam sayinin data type'ni otomatik olarak
        //"primitive int" kabul eder
        // bu yuzden remove methodun icine yzdiginiz tamsayi eleman olarak degil index olarak kabul edilir
        // tamsayiyi eleman olarak kabul etmenin birkac yolu var

        // (yukarda 12 primitive kabul edildigi icin, java onu object olarak almiyor
        // index olarak aliyor)



        //1.YOL
        // Integer nonPrimitive = 12;
        // ages.remove(nonPrimitive);
        // remove methodu sadece birinciyi siler
        // 1'den fazla 12 olursa ilk gorunumu alir

        //2.YOL

        //ages.remove((Integer) 12);
        //System.out.println(ages);


          //3.YOL
          ages.remove(Integer.valueOf(12));// valueof 12 yi wrapper class a cevirdi
        System.out.println(ages);


        //4.YOL

         // ages.remove(ages.indexOf(12));// BURDA DA icerdeki indexof 12'nin indeksini bulacak,
        // remove ise onu silecek
        // indexof'da ilk gorunumdeki index i alacagi icin sadece bir degeri silecektir


        //DIKKAT ET!
        //  bu dort yoldan tavsiye edilen 2.yoldur. daha az method vs. kullanir
        // burdaki dort yolun dordu de ayni isi yapar sadece birincileri siler





        //Example 2: integer bir list olusturunuz
        //           list'e 5 tane elaman ekleyiniz
        //           o elemanlardan TUM 12'leri siliniz


        // asadida silinecekler elemenlar icin removeAll kullandik
        // silinecekleri bir list'te yazmmamiz gerekiyor
        // bunun icin yeni bir list olusturduk

        List<Integer> ages1 = new ArrayList<>();

        ages1.add(10);
        ages1.add(25);
        ages1.add(12);
        ages1.add(8);
        ages1.add(12);



        List<Integer> silinecekler = new ArrayList<>();
        silinecekler.add(12);
        silinecekler.add(25);

        ages1.removeAll(silinecekler);

        System.out.println(ages1);


        //removeAll() method'u List ile calisir
        // removeAll() method'u bir veya birden fazla elemanin tum gorunumlerini silmek icin kullanilir






    }
}

package day17arraylist;


import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

        //DIKKAT!
        //arrayList olustrurken sag tarafa (constructor) ArrayList yazmak zorundayiz
        // Ama sol tarafa ise ister "ArrayList" yaz istersen "List" yaz, ikiside calisir
        //"list" genel, "ArrayList" leri de kapsiyor


       List<Character> initials = new ArrayList<>();

        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');


        //bir List'te kac elleman oldugunu "size()" ile aliyoruz

        int numOfelement = initials.size();
        System.out.println(numOfelement);


        //DIKKAT!
        // Array'lerden bahsederken lenght kullan, list'lerden bahsederken "SIZE" kullan
        //LIST'lerden bahsederken eleman sayisinda "SIZE" kullan

        char u = initials.get(2);
        System.out.println(u);// 2. index'teki 3. karakteri alacak oda==>M

        //"get()" methodu ile index'e git  elemani al diyor

        // burda bir detay daha var. yukarda list'te Character kullandik yani wrappper classs kullandik
        // fakat asgida primitive data kullandik, bu nasil oldu?
        // java burada otomatik olarak "auoteboxing"  yapti. yani wrapper class'i otomatik olarak cevirdi


        //Verilen bir String list'teki emlemanlarin toplam karakter sayisini bulan kodu yaziniz
        //tekarli islem yapiyorum
        // LOOP kullnamliyim
        //Array kuulaniyorsan Array'in ismini, List kullaniyorsan List'in ismini yazmalisin

        //normalde list'lerde size ile boyut olculuyor
        //fakat asagida String bir list, lenght ile uzunlugunu bulabiliriz
        // size ile yapmadi hoca cunku "size" indeks istiyor


        List<String> cities = new ArrayList<>();

        cities.add("Miami");
        cities.add("istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        //1.YOL FOR EACH LOOP (bu yolu kullanin daha kisa dedi RECOMMENDED==> tavsiye edilen

        int sum = 0;

        for (String w : cities){
            sum = sum + w.length();

        }
        System.out.println(sum);


        //2.YOL FOR LOOP

        int toplam = 0;

        for(int i = 0 ; i<cities.size() ; i++){

            toplam +=cities.get(i).length();

        }

        //Bir List'teki istenen bir elemani nasil degistiririz?

        cities.set(0, "New York");
        System.out.println(cities);

        //mesela iscilerin ucret listesindeki maas miktarlarinin degismesi isteniyor
        // o zaman "set()" methodu kullanilabilir

        //Example 2: Maas lis'i olusturunuz ve maaslaera %20 zam yapiniz.

        List<Double> salary = new ArrayList<>();

        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);

        System.out.println(salary);

        //1.YOL

        int idx = 0;

        for(Double w : salary){

            salary.set(idx, w*1.20);// index'e git onu 1.20 ile carp, burda icinde index olan set methodu secti

            idx++;
        }
     System.out.println("for each loop "+ salary);


        // yukardaki soruda ben for each loop kullandik
        // ama for each loop da index yok,
        // yeni bir indeks olusturduk
        // ve tum degerleri %20 artirarak eski degerler ile degistirdik
        // set() methodu degistir demek
        // 1.20 dedik cunku %20 zam yapiliyor

        //2.YOL for loop

        for(int i = 0; i<salary.size() ; i++){

            salary.set(i, salary.get(i)*1.20);

            //yukrda set methodu i=0 daki indeksi al
            // yine yukarda get methodui=0 yani indeks sifir i artik 1.20 ile carp
        }
        System.out.println(salary);


        // yukarda get ile indeks e git o elemani al diyor
        // set ile ise verilen indekse git o elemani degistir diyor
        // YUKARDAKI SORU DA FOR EACH I KULLANMAK DAHA IYI







    }
}

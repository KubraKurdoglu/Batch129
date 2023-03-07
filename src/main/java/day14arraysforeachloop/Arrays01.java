package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //Example 1: String Arrays olusturun icine 5 tane eleman ekleyin,
        // ilk eleman ile son elemanin icerdigi karakter sayilarini ekrana yazdirin

        String arr[] = new String[5];

        arr[0] = "Maths";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0].length()+ arr[arr.length-1].length());

        // arr[arr.length-1].length() ==> bunu dinamik bir kod yazalim diye yazdik
        // son elemana kadar hepsinin elaman sayilarini al dedi


        //Example 1: String Arrays olusturun icine 5 tane eleman ekleyin,
        //tum elemanlarin  icerdigi karakter sayilarini ekrana yazdirin


     String brr[] = new String[5];

        brr[0] = "Miami";
        brr[1] = "istanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] = "Athena";


        //1.YOL

        int totalChar = 0;

        for(int i =0 ; i<brr.length; i++){

            totalChar = totalChar + brr[i].length();

        }

        //2.YOL
        // for-each-loop (enhanced loop)
        // for-each-loop==> baslangic degeri, incremeent-decerement sarti ve loop'un calisma
        //sartini kendi halleder
        //for-each-loop==> en kullanisli loop
        //ama bazen onu kullanamayacagimiz durumlar var
        // for-each-loop arrays'lerde ve collection'larda kullanilir
        // bir arrays ile calisiyorsan ilk tercihin for-each-loop olmali
        // indeks kullanman gerektiginde for-each-loop caresiz kalir
        // mecburen diger loop'lari kullanirsin

        int sum = 0;

        for(String w: brr){
            sum =sum+w.length();

        }
        System.out.println(sum);

        // for-each-loop da
        //1. data type'si olmali
        //2. for-each-loop un adi olmali, genellikle "w" oluyor
        //3.
        // arrays'deki elemanlar bitince java o loop'u otomatik olarak kirar

    }
}

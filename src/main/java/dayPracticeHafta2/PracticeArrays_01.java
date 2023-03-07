package dayPracticeHafta2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PracticeArrays_01 {
    public static void main(String[] args) {
         /*
            SORU 1: Asagidaki multi dimensional array'lerin ic arraylerinde ayni index'e sahip
                    elemanlarin toplamini yazdiran kodu yazin
                    arr1 = {{1,2},{3,4,5},{6}} ve arr2 = {{7,8,9},{10,11},{12}}
         */


//----------------------------------------------------------------------------------------------------------------------
        /*
           SORU 2: Asagidaki multi dimensional array'lerin ic arraylerindeki tum elemanlarin toplamini birer birer
                   bulan ve herbir sonucu yeni bir array'in elemani yapan ve yeni array'i yazdiran kodu yazin.
                   {{1,2,3},{4,5},{6,7}}
                   ORNEK : {{1,2,3},{4,5},{6,7}} ==> 1+2+3=6   4+5=9   6+7=13 ==> OUTPUT: {6,9,13}
         */


//----------------------------------------------------------------------------------------------------------------------
        /*
            SORU 3: Verilen bir String List'teki tum elemanlarin toplam karakter sayisini bulan kodu yaziniz.
         */


//----------------------------------------------------------------------------------------------------------------------
        /*
            SORU 4: Maas List'i olusturunuz ve maaslara %20 zam yapiniz.

         */

        List<Double> maaslar = new ArrayList<>();

       maaslar.add(1000.00);
       maaslar.add(2000.00);
       maaslar.add(3000.00);

       int idx = 0;

        for (Double w : maaslar) {

            maaslar.set(idx, w*1.20);

            idx++;
        }

        System.out.println(maaslar);


        //2.YOL

        for(int i =0; i<maaslar.size() ; i++){

            maaslar.set(i, maaslar.get(i)*1.20);

        }

        System.out.println(maaslar);




//----------------------------------------------------------------------------------------------------------------------
        /*
            SORU 5: Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir.
                    Sözcükler değişmeden,her giriş satırındaki sözcüklerin sırasını
                    tersine çevirmek için kod yazınız.
                    Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
                    Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir
         */


//----------------------------------------------------------------------------------------------------------------------
        /*
            SORU 6: Kullanicidan bir String aliniz.
                     String'de var olan her character'in sayisini ekrana yazdiriniz.
                     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
                     abaa   ==> a=3  b=1
         */

            Scanner scan = new Scanner(System.in);
            System.out.print("Bir string giriniz :");//
            String str = scan.nextLine();

            String arr[]= str.split("");
            System.out.println(Arrays.toString(arr));

            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));

            int counter=0;

            for(int i=1; i<arr.length; i++){
                if(arr[i-1].equals(arr[i])){
                    counter++;
                }else{
                    System.out.println(arr[i-1]+ " sayisi" + (counter+1));
                    counter=0;
                }
                if(i==arr.length-1){
                    System.out.println(arr[i]+" sayisi " + (counter+1));
                }

            }






//----------------------------------------------------------------------------------------------------------------------
        /*
            SORU 7:  Yazdırmak için switch ifadesini kullanınız.
                     a) Aralık, Ocak, Şubat için "Kış"
                     b) Mart, Nisan, Mayıs için "Bahar"
                     c) Haziran, Temmuz, Ağustos için "Yaz"
                     d) Eylül, Ekim, Kasım için "Güz"
                     e) Diğerleri için "Geçersiz ay adı"
         */

        System.out.println("bir ay ismi giriniz");
        String ayIsmi = scan.next().toLowerCase();

        switch (ayIsmi){
            case "aralik":
            case  "ocak" :
            case" subat" :
                System.out.println("kis ayi");
            break;
            case "mart", "nisan" , "mayis":
                System.out.println("ilknahar");
                break;
            case "temmuz" , "agustos":
                System.out.println("yaz");
                break;
            case "eylul" ,  "ekim" , "kasim":
                System.out.println("guz");
                break;
            default:
                System.out.println("gecersiz ay adi girdiniz");

        }

//----------------------------------------------------------------------------------------------------------------------
        /*
            SORU 8:  Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
                        A
                        A A
                        A A A
                        A A A A
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");
        char ch = input.next().charAt(0);

        for (int satir = 1; satir <5 ; satir++) {
            for (int j = 0; j <satir ; j++) {
                System.out.print(ch+" ");

            }
            System.out.println();


        }
        System.out.println();

        for (int i = 5; i >0 ; i--) {
            for (int k = i; k >1 ; k--) {
                System.out.print(ch+" ");

            }
            System.out.println();

        }









//----------------------------------------------------------------------------------------------------------------------

        /*
            SORU 9: Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
                    Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
                           (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
         */


        int[] arr1={12,5,8,10,11};//5,8,10,11,12
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        int uzunluk = arr1.length;

        int otadakiIndex = (uzunluk- 1) / 2;
        int ortadakiEleman=arr1[otadakiIndex];
        //eleman sayisi cift olan array'lerin ortadaki elemanlarinin indexini bulmak icin yaptik
        int  index1=uzunluk/2-1;

        int index2=uzunluk/2;

        //ortadaki elemalari almak icin
        int eleman1=arr1[index1];

        int eleman2=arr1[index2];

        //ortalamsini bulmak icin
        if (uzunluk%2!=0){
            System.out.println(ortadakiEleman);
        }else
            System.out.println((eleman1+eleman2)/2);










//----------------------------------------------------------------------------------------------------------------------

        /*
            SORU 10:  Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
                      Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)
         */



        int arr9[] = {12, 5, 8, 4};


        int ortadakiElaman =arr9.length/2;
        System.out.println(arr1[ortadakiElaman]);


        int arr10[] = {15, 20 , 25, 30};
        int toplam = 0;

        for(int i =0; i<arr9.length; i++){
            if(i==arr9.length/2){
                toplam=arr9[i];
            }break;
        }
        System.out.println(toplam);










    }
}

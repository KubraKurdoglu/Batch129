package practice.practiceDTNT;

import java.util.Arrays;

public class C05_KelimeleriTersSiraliArray {

    /*
Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir.
Sözcükler değişmeden,her giriş satırındaki sözcüklerin sırasını
tersine çevirmek için kod yazınız.
Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir
        */


    public static void main(String[] args) {


        String str = "Kemal Can Kuzu";
        // bunu tersten yazabilmek icin en kolay yol arrays'ler
        // bunu split il ebosluktan parcalaman lazim
        // eger hiclikten parcalasan harf harf alir

        String arr[] = str.split(" ");

        System.out.println(Arrays.toString(arr));










    }










}

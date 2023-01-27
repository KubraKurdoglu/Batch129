package day29exceptions;

import java.io.FileInputStream;//io==> input Output
import java.io.FileNotFoundException;
import java.io.IOException;


/*

        1)FileNotFoundException ve IOException Compile Time Exception'lardir, yani code'u yazarken hata aliriz.
        2)FileNotFoundException path'in dogrulugu ve dosya'nin varligi ile ilgilidir.
          IOException tum input ve output islemleri ile ilgilidir.
        3)IOException Class, FileNotFoundException Class'in parent'idir.
        4)Istenirse FileNotFoundException yerine IOException da kullanilabilir.
        5)IOException Class ve FileNotFoundException beraber kullanilacaksa FileNotFoundException ustte, IOException altta kullanilmalidir.
     */


public class Exceptions03 {
    public static void main(String[] args) {


        try {
            FileInputStream fis = new FileInputStream("src/main/java/day29exceptions/File01.txt");

            int k = 0;

            while ((k = fis.read()) != -1){// read hata verdi ustune tikladi ve 4 secenek verdi, hoca hepsini denedi
                //bu oneriler arasinda genellikle multiple try catch kullanilir
                // "-1" yazmasinin nedeni, file dosyasinda hic karakter yoksa yahut hic karakter kalmamissa
                // -1 veriyor. (-1 != -1) dogru bir ifade olmadigi icin while kirildi.


                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {// bunun iki ihtimali var, path yanlis veya adres yok

            System.out.println("Path is wrong or the file does not exist");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        System.out.println("Hi!");

        //genel olanlar "parent", ozel olanlar "child" dir.
        //() icine adres yazmak gerekiyor
        //onu da "file" dosyasina girderek, tiklayip "copy/path reference" den yapti.

        //Users/kubrasimsek/IdeaProjects/Batch129/src/main/java/day29exceptions/File01.txt
        // ilk once yukardaki gibi yazdi sonra dedi ki hoca "src" den oncesini siliniz
        // cunku gerek yok

        //genelde kutuphaneden alinan seyler input oldugu icin io'dan aldi
        // ve sonra bir object olusturdu.

    }
}

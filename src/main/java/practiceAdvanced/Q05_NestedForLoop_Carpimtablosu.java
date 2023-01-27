package practiceAdvanced;

import java.util.Scanner;

public class Q05_NestedForLoop_Carpimtablosu {
    /*
       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.
       Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25
       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
       ekrana yazdıran bir kod yazabilirsiniz.
    */

    public static void main(String[] args) {




        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int limit=input.nextInt();

        //ikinci for loop u birincinin icine koyduk, cunku tekrar etsin ayni sayida calissin istiyoruz

        for(int i = 1; i<=limit; i++){

            for(int j = 1; j<=limit; j++){

                System.out.print(String.format("%2d", j*i)+ " ");
                        // burda j*i yaptik cunku her seferinde artiyor
            }
            System.out.println();// bu bos sout'u her seferinde asagi gecsin diye yazdik

        }



        /*

        1 2 3 4 5
        2 4 6 8 10
        3 6 9 12 15
        4 8 12 16 20
        5 10 15 20 25
        ilk basta yazdirinca boyle cikti
        bunlarin hepsini ayni satirda yazalim istiyoruz
        bunun icicn Strin class ' agidiyoruz orda
        format var
        %2d==> digit
        yani ikibasamakli yaz boyle diyoruz



         */

    }













}

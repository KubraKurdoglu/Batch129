package practiceAdvanced;

import java.util.Scanner;

public class Q06_ForLoop_Continue {

    /*
      Kullanıcıdan 5 adet sayı isteyiniz
      Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
      Not: 5 ve 10 dahil değil.
      */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int toplam=0;

        for(int i=1; i<6; i++){

            System.out.println(i+ " . sayiyi giriniz" );
            int sayi= input.nextInt();

            if(sayi>5 && sayi<10){
                System.out.println("5 ile 10 arasinda sayilar toplama dahil edilemez");

                continue;// buradaki continue yukari git tekrar yoluna bak demek
                // yukari cik

            }
            toplam +=sayi;

        }
        System.out.println("toplam "+ toplam);














    }



}

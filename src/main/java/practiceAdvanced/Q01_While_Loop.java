package practiceAdvanced;

import java.util.Scanner;

public class Q01_While_Loop {
    //Kullanıcıdan alınan bir sayıdan başlayarak ardışık sayıları 10'un katına gelene kadar yazdıran bir kod yazınız.
    //Örn: Sayı: 46 Çıktı: 46, 47, 48, 49

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi=input.nextInt();


        while(sayi%10!=0){

            System.out.print(sayi + " " );
            sayi++;

        }






    }



















}

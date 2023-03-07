package calisma03intewievsorulari;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {

         /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o
        sayiyi veriyorsa sayi  Armstrong sayidir

            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız
           */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        amstrongNumber(sayi);

    }

    public static void amstrongNumber(int n){
        int sayininKupleriToplami = 0;
        int basamaktakiSayi = 0;
        int girilenSayi = n;

        while (n>0){
            basamaktakiSayi=n%10;//sayilari 10'a bolerek o sayinin her basamagindaki sayiyi aalabiliriz
            sayininKupleriToplami +=(basamaktakiSayi*basamaktakiSayi*basamaktakiSayi);
            n=n/10;
        }
        if(girilenSayi==sayininKupleriToplami)
            System.out.println(girilenSayi+" sayisi amstrong sayidir");
            else System.out.println(girilenSayi+ " sayisi amstrong sayi degildir");

        }
    }



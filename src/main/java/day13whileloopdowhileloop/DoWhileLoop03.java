package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {

        /*
         Gecerli  Username="admin" Password="pwd123" dur.
         Kullanicidan usernema ve password'u alin
         username ve password dogru ise console'a, "hesabiniza hosgeldiniz" desin
         username veya password ynalis ise 4 kere "Username ve Password'unuzu giriniz"mesaji versin
         Username veya Password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz

         */
        Scanner input = new Scanner(System.in);


        // tekrarli calisanlar loop un icine girmeli



        int counter=0;

        //counter icin sayac dedi
        //giris sayisini almak icin


        do {
            if (counter == 4) {
                System.out.println("Hesabiniz bloke olmustur");// hesap bloke olursa "break" calisir kod un disina cikariz
                break;
            }
            System.out.println("Username'nizi Giriniz");
            String username = input.next();

            System.out.println("lutfen password'unuzu Griniz");
            String password = input.next();

            if (username.equals("admin") && password.equals("psw123")) {
                System.out.println("hesabiniza hosgeldiniz!");
                break;
            }

           counter++;

        }while (true);// kirma islemini kendim yptigim icin buraya boyle yazdik dedi hoca

        // while in bu kulllanimini verdi
        // while(true) sonsuz defa calisir normalde
        // fakat biz onun calismasini "break" lerle engelliyoruz





    }
}

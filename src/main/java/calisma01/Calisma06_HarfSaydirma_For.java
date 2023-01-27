package calisma01;

import java.util.Scanner;

public class Calisma06_HarfSaydirma_For {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir cumle ve bir harf giriniz");
        String cumle = input.nextLine().toLowerCase();
        char harf = input.next().toLowerCase().charAt(0);
        int sayac = 0;

        for (int i = 0; i< cumle.length(); i++){
            if (cumle.charAt(i)== harf){
                sayac++;
            }
        }
        System.out.println(sayac);










    }
}

package day03scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {


        // kulanicidan adresini aliniz ve ekrana yazdiriniz
        // adres tek kelimeli string degil; o zaman burda next kullanamazsin

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adresinizi giriniz..");
        // kullanicinin girdigi butun satiri almak icin nextline kullandik

        String address=input.nextLine();
        System.out.println(address);
    }
}

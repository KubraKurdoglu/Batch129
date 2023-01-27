package day03scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        // kullanicidan ilk ismini ve soyismini alip ikisini ayni satirda ekrana yazdiriniz

        Scanner input = new Scanner(System.in);

        System.out.println("ilk isminizi giriniz..");
        // next method kullanicidan tek kelimelik string almak icin kullanilir
        // ali can gibi bir kelimeyi next le alsan sadece ali yi yazar

        String firstName = input.next();

        System.out.println("soy isminizi giriniz...");
        String lastName = input.next();

        System.out.println(firstName+""+lastName);





    }
}

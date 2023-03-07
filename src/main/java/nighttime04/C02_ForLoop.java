package nighttime04;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {

        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk " " veya 'a' harfi geldiginde bunlari yazmasin


        Scanner input = new Scanner(System.in);
        String str = "";


        for (int i = 0 ; i < str.length(); i++){
            if (str.charAt(i)=='a'  || str.charAt(i)==' '){
                continue;// continue dedik cunku devam edecek
            }

            System.out.println(i);
        }

        //System.out.println(str.charAt(i));// bunu boyle yazinca burdaki "i" yi okumadi
        // cunku for loop un disinda bunu tanimlamadik
        // o nedenle sout'u if'in disina yazdik





    }
}

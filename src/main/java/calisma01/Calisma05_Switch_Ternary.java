package calisma01;

import java.util.Scanner;

public class Calisma05_Switch_Ternary {
    public static void main(String[] args) {
        /*
     Yazdırmak için switch ifadesini kullanınız.
    a) Aralık, Ocak, Şubat için "Kış"
    b) Mart, Nisan, Mayıs için "Bahar"
    c) Haziran, Temmuz, Ağustos için "Yaz"
    d) Eylül, Ekim, Kasım için "Güz"
    e) Diğerleri için "Geçersiz ay adı"

 */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir ay adi giriniz");
        String nameMoi= input.next().toLowerCase();


        switch (nameMoi){
            case "janvier":
            case "fevrier":
            case "december":
                System.out.println("hiver");
                break;
            case "mars":
            case "avril":
            case "may":
                System.out.println("printemps");
                break;
            case "juin":
            case "juillet":
            case "aout":
                System.out.println("été");
                break;

            case "septembre":
            case "octobre":
            case "novombre":
                System.out.println("automne");
                break;

            default:
                System.out.println("gecersiz ay");
        }


/*
     Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
    a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
    b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
    c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "
 */

        int a = 5;
        int b = 5;
        int c = 5;

        String ucgenMi = (a==b && b==a && a==c)? "eskenar ucgen" : (a==b && b!=c) || (a==c && c!=b) || (b==c && c!=a) ? "ikizkenar ucgen" : "cesit kenar ucgen";
        System.out.println(ucgenMi);

/*
 Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
 Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
 Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"
 */


        System.out.println("lutfen bir parola giriniz");
        String parola=input.next().trim().replaceAll(" ", "");

        String varMI = parola.length()<9 && parola.length()>=8 ? "gecerli paralo" : "gecersiz parola";
        System.out.println(varMI);


        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        System.out.println("lutfen bir cumle ve bir harf giriniz");
        String s= input.nextLine().toLowerCase();
        char ch = input.next().toLowerCase().charAt(0);

        int sayac = 0;

        for(int i=0 ; i>s.length() ; i++ ){
            if(s.charAt(i)==ch){
                sayac++;
            }
        }
        System.out.println(sayac);








    }
}

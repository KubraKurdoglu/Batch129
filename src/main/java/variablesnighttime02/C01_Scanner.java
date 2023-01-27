package variablesnighttime02;

import java.util.Scanner;

public class C01_Scanner {




        /*

        TechproEd spor salonu icin kullanicidan isim; soyisim; yas; kilo; boy; salona devam edecegi ay suresi;
        bilgilerini alip aylik 20 dolar olarak toplam ucreti yazdiriniz

         */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("TechProEd Spor Salonuna Hosgeldiniz....");

        System.out.println("Lutfen Isminizi Giriniz...");

        String tamisim = input.nextLine();

        System.out.println("Lutfen yasinizi giriniz...");


        byte yas= input.nextByte();

        System.out.println("Lutfen Kilonuzu giriniz...");

        double kilo= input.nextDouble();

        System.out.println("lutfen boyunuzu giriniz...");

        double boy=input.nextDouble();



        int aylik_ucret=20;

        System.out.println("aylik_ucret = " + aylik_ucret+"$");

        System.out.println("lutfen uyelik suresini giriniz...");

        int aylik=input.nextInt();

        int toplam_tutar=aylik_ucret*aylik;
        System.out.println("toplam_tutar+\"$\" = " + toplam_tutar+"$");

        System.out.println();




    }
}










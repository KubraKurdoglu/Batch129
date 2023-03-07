package calisma01;

import java.util.Scanner;

public class Calisma_03_DikdortgeninKenarUzunlulariVS {
    public static void main(String[] args) {


       /* EXAMPLE 11:

        Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin
        kare olup olmadigini yazdiriniz
     */

        Scanner input1 = new Scanner(System.in);
        System.out.println("Lutfen iki kenar uzunlugu giriniz");

        double kenar1 = Math.abs(input1.nextDouble());
        double kenar2 = Math.abs(input1.nextDouble());




        if(kenar1<=0 || kenar2<=0 ){
            System.out.println("karenin kenarlari sifir veya negatif olamaz");

        }else if(kenar2==kenar1 ){
            System.out.println("bu bir karedir");
        }else {
            System.out.println("bu bir kare degildir");
        }

       // EXAMPLE 12:

        //Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdiriniz


        //Scanner input2 = new Scanner(System.in);
       // System.out.println("lutfen bir karakter giriniz..");

        char ch ='c';




        //EXAMPLE 13:

        //Kullaniciya yasini sorun, eger yas 65'den kucuk ise "emekli olamazsin, calismalisin",
        // 65'e esit veya buyukse "Emekli olabilisin" yazdiriniz

       Scanner input3 = new Scanner(System.in);
       System.out.println("lutfen yasinizi giriniz..");

       byte age= input3.nextByte();

       if(age<65){
           System.out.println("emekli olamazsin, calismalisin");
       }else if(age>=65){
           System.out.println("emekli olabilirsin");
       }else {
           System.out.println("lutfen gecerli bir yas giriniz");
       }

        /*
    EXAMPLE 14:

    Kullanicidan bir ucgen uc kenar uzunlugunu alin eger uc kenar uzunlugunu birbirine esit ise
    ekrana "Eskenar ucgen " yazdiriniz. diger durumlarda ekrana "Eskenar degil" yazdiriniz
     */


        Scanner input4 = new Scanner(System.in);
        System.out.println("lutfen ucgenun kenar uzunluklarini griiniz");

        double k1=Math.abs(input4.nextDouble());
        double k2=Math.abs(input4.nextDouble());
        double k3=Math.abs(input4.nextDouble());

        if(k1<=0 || k2<=0 || k3<=0){
            System.out.println("ucgenin kenarlari sifir ve negatif olamaz");
        }else if(k1==k2 && k2==k3){
            System.out.println("eskenar ucgendir");
        }else {
            System.out.println("eskenar ucgen degildir");
        }














    }
}

package day08nestediternary;

import java.util.Scanner;

public class NestedIf01 {

    public static void main(String[] args) {

       /* kullanicidan uc tane sayi alin
        bu uc sayinin ucgen olusturma durumunu kontrol edin
        eger ucgen ise "eskenar" olma durumunu kontrol et

        INFO:
        ucgen olma sarti: herhangi iki kenar toplmai ucuncu kenardan buyuk olmali
                          herhangi iki kenar farki ucuncu kenardan kuyuk olmali


         */


        //java nested if kullanmayi sevmez
        // cunku nested if ler cok vakit kaybettirirler
        // eger mumkunse baska islem kullanmak gerekir
        // nested if "time consuming" yapar


        Scanner input = new Scanner(System.in);
        System.out.println("ucgenin kenarlari icin uc tane uzunluk giriniz");


        // kullanici yanlislikla negatif sayi girdigin de onu boyle ignore ediyoruz


        //double a = Math.abs(input.nextDouble());
        //double b = Math.abs(input.nextDouble());
        //double c = Math.abs()input.nextDouble();

        //hoca yukarda math.abs kullanarak mutlak deger aldi
        // negatif sayi girilmesi durumu icin
        // ama dah sonra  if le negatif ve sifira esit deger alamazsiniz diyerek zaten bunu bastan engelledi



        //kullanicin negatif sayi vermesini istemiyorsam
        // bastan bunu engellemek icin
        // en basa bir if yazmaliyim
        // asagidaki sekilde


        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        boolean ucgenmi = (a + b > c && c > Math.abs(a - b)) && (a + c > b && b > Math.abs(a - c)) && (b + c > a && a > Math.abs(b - c));

        //normalde bu "ucgenmi" diye olan kod kismini if'in  icne yazmistik
        //sonra kodu sadelestirmek icin  boyle kisalttik

        //asagida;
        // kucuk esit sifir kullandik cunku bir ucgenin kenari 0 da olamaz
        // >1 de yazamadik cunku ucgenin bir kenari 0.99 da olabilir
        // or isartei kullandik cunku kenar degerleinin bir tanesi bile sifir olamaz


        if(a<=0 || b<=0 || c<=0){
            System.out.println("ucgenin kenarlari negatif olamaz");
        }

        if (ucgenmi) {

            if (a == b && b == c && a== c) {
                System.out.println("ucgen hemde eskenar ucgen");


            } else {
                System.out.println("ucgen ama eskenar degil");
            }

        }else{

            System.out.println("sen ucgen degilsin");
        }









    }}





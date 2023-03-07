package ssg_ifstatementternary;

public class Ternary01 {
    public static void main(String[] args) {


        int sayi = 0;

        //DIKKAT
        // asagida iki farkli deger var
        // hem string hemde int
        // o nedenle "object" kullandik
        //YADA YAZDIGIN TERNARY'I DIREK SOUT ICINE YAZDIR


        //1.YOL
        Object obj =sayi> 100 ? sayi*sayi : "sayi 100'den buyuk olmali";
        System.out.println(obj);


        //2.YOL
        System.out.println(sayi> 100 ? sayi*sayi : "sayi 100'den buyuk olmali");

        //3.YOL
        // OUTPUT AYNI ISE

        int num = sayi>100 ? sayi*sayi : sayi*sayi*sayi;



    }
}

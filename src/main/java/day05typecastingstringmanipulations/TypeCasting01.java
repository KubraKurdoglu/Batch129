package day05typecastingstringmanipulations;

public class TypeCasting01 {

    /* numeric primitive data type'lerinin birbirine donustruurlmesine "Type Casting"
    type casting sadece numeric data typeleri arasinda olur
    Numeric Data Typeleri== byte-short-int-long-float-double

    Note 1: kucuk data type larini buyuk data type lerine cevirmeyi JAVA kendi otomatik tapar
            bu isleme "AutoWidening" denir(otomatik genisleme

    Note 2: buyuk data typlerini kucuk data type lerine cevirmek riskli olur.




     */

    public static void main(String[] args) {

        //byte data type sini int data type sin cevirin
        byte age = 13;
        int ageInt= age; //AuotoWidening

        // long data type sini short data typesin cevirin

        long weight = 234;
        short weightShort= (short)weight;

        // int data type sini float a cevir

        int ders= 23;
        System.out.println(ders);


        float dersFloat= ders;
        System.out.println(dersFloat);


        // double data type short a cevir

        double sinifsayi= 23.453;
        System.out.println(sinifsayi);//23.453

        short sinifsayiShort= (short) sinifsayi;
        System.out.println(sinifsayiShort);//23

        //DIKKAT!
        // donusum yaptiginiz sayi donusecegi data type sinin sinirlari disinda ise java
        // kullandiginiz sayi ile "mod" islemi yapar ve mod isleminin sonucu sozin yeni degeriniz olur

        // exampe 1: short data type sini byte cevir

        short num= 260;
        System.out.println(num);


        byte numByte= (byte)num;
        System.out.println(numByte);

        // example 2:
        short n= 1023;
        System.out.println(n);// 1023

        byte nByte= (byte)n;
        System.out.println(nByte);// -1

    }
}

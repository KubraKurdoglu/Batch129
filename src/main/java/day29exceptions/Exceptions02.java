package day29exceptions;

public class Exceptions02 {
    public static void main(String[] args) {

        /*
        "throw" ile "throws" keyword'leri arasindaki fark nedir?
        1)"throw" method body'si icinde, "throws" ise method paranetzinden hemen sonra kullanilir.
        2)"throw" method body'si icinde istenilen yerde istenildigi kadar kullanilir,
        "throws" ise method paranetzinden hemen sonra sadece bir kere kullanilabilir.
        3)"throw" dan sonra "new" keyword ve "constructor" kullanilarak object olusturulur.
        "throws" dan sonra sadece Exception Class ismi yazilir
        4)"throw" belli sartlar icin Exception atmada kullanilir, "throws" ise application'i Exception attiktan sonra durdurur.


         */
        try{
            printAge(-12);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            getMark(999);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        //IllegalArgumentException: Marks cannot be greater than number==> bu uyariyi verdi bana
        // bu "exception"u verince ogrencinin notu asla 109 olmayack,
        // buna izin vermeyecek, uyari verecek





        //burda lethodun icinde bir uyari koydu "throw" ile
        //try yazmasa idi asagida methodu throw ile dondurdugumuuz icin, appplication uyari vermeden
        // dururdu
        // sonra o uyari ile karsilasma ihtimlai icin "try" yazdi


    }

    // "throw" bir methodun bodys'i icinde istedigiiz yerde istedigimiz kosullar icinde, istedigimiz
    // kadar Exception atmamizi saglar
    //"throw" keyword yazildiktan sonra bir exception class object'i olusturulur
    //Exception class constructor'unun parantezi icine istediginiz exception mesajini yazabilirsiniz
    // asagida,  ("Age cannot be negative");==> bunu yazdi
    // cunku burda "exception"un ne zaman atilacagini sen belirliyorsun, dogal olarak mesajida sen
    // belirlemelisin

    public static void printAge(int age){

        if(age<0){
        throw new IllegalArgumentException("Age cannot be negative");

        }else{
                System.out.println(age);
        }
    }

    //Ogrenci notlari girisi yapan ve notu konsola yazdiran bir method olusturunuz

    public static void getMark(double d){

        if(d<0){
            throw new IllegalArgumentException("Marks cannot be less than zero");
        } else if (d>100) {
            throw new IllegalArgumentException("Marks cannot be greater than number");

        }else {
            System.out.println(d);
        }


    }


}

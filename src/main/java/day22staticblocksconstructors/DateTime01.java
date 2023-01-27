package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {


        //hem date class'i hemde Time class'i vardir
        //Date Class
        //Java'nin Util Kutuphanesinden geliyor

        Date myDate = new Date();

        System.out.println(myDate);//Sat Jan 07 21:26:58 CET 2023

        //sadece tarihi almak istiyorsam;
        //mydate yazip nokta koyup

        System.out.println(myDate.getTime());//1673123366763 ==> 1 Ocak 1970'den su ana kadar ki mili saniye miktari
        // bu mili saniyeyi ne yapacak
        // bu deger "unique" dir, yani essizdir


        //ICINDE BULUNDUGUMUZ AN NASIL ALINIR(Current Day)
        // bu kisiden kisiye degsirmis, cunku su an avustralya da ki "current day" farkli


        System.out.println(LocalDate.now()); // ==> bu bize simdiki zamani veriyor(tarih olarak)

        System.out.println(LocalTime.now());//21:34:49.424090==> simdiki zamani veriyor
        //21:34:49.424090 ==> saat-dakika-nanosaniye

        System.out.println(LocalDateTime.now());//2023-01-07T21:36:14.656876 ==> bu bulundugum yern tarih ve zamani

        //Japonya'nin tarhini ve zamanini bulmak icin
        //Yada dunyanin herhangi bir yerindeki saati bulmak icin

        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Paris")));
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow")));

        //Ileriki bir tarihe nasil gidilir?

        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));
        //sonuc su cikti==>2030-07-12
        // 2023'deyiz ve 7 sene, 5 ay, 35 gun,  sonrasina gidiyoruz


        //Onceki bir tarihe nasil gidilir?
        // "minus"==> eksi demektir.

        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));
        //2018-10-05

        //Ileriki bir zamana nasil gidilir?

        System.out.println(LocalTime.now().plusHours(3).plusMinutes(45));//01:41:29.988927

        //Geriki bir zamana nasil gidilir

        System.out.println(LocalTime.now().minusHours(2).minusMinutes(30));//19:28:48.866483

        //Zamanda belli bir bolumu nasil aliriz?
        // asagisda "get" methodu ile sadece saat ve dakikayi aldik

        System.out.println(LocalTime.now().getHour() +":"+ LocalTime.now().getMinute());//22:1
        //yukarda saati int belirledig icin, ":"dan sonra sadece "1" i aldi


        //TArihte belli bir bolumu nasil aliriz?

        System.out.println(LocalDate.now().getMonth() + ":" + LocalDate.now().getDayOfMonth());// isim olarak ay'i verdi
        System.out.println(LocalDate.now().getMonthValue() + ":" + LocalDate.now().getDayOfMonth());// tarih olarak ay
        //1:7==> birinci ayin yedisi

        //IKI TARIH NASIL KARSILASTIRILIR?
        //02/13/2005 - 03/01/2007

        boolean result = LocalDate.of(2005,02,13).isBefore(LocalDate.of(2007,03,01));
        System.out.println(result);//True

        boolean result1 = LocalDate.of(2005,02,13).isAfter(LocalDate.of(2007,03,01));
        System.out.println(result1);//false

        //TARIHLERIN FORMATLARI NASIL DEGISTIRILIR?
        //Bunun icin bir class olusturulmus "daytimeformatter"
        // bunu kulllanbilmek icin bir "object" olusturulur

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dtf.format(LocalDate.now());// simdiki tarihe formeti uyguladik

        // month'u kucuk harfle yazamiyoruz cunku kucuk m'yi "minutes" olarak algiliyor
        //Month'un icine "MMM"==> uc tane M koyarsan, aylarin ilk uc harfini yazar ==> "JAN"
        //MM==> iki rakamla ay no'sunu yazar
        //m==> tek rakamla ay no'sunu yazar
        //MMM==> ay'in ilk uc harfini yazar
        //d==> yazarsan tek rakam yazar
        //dd==> iki rakamla gun no'sunu yazar
        //ddd==> fakat boyle bir kullanim yoktur
        //yy==>yilin son iki rakamini yazar
        // yyyy==> Yilin tamamani yazar

        // "ofPattern();" ==> bunun icine istedigin methodu koyuyorsun. ornegin "DD/MM/YYYY"




    }

}
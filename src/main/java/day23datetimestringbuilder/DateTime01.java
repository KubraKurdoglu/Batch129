package day23datetimestringbuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        //Example 1: Time'i formatlayiniz

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);//19:38:29.343719 ==> ensondaki nano second

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh-mm  a");

        //hh==> 12 lik saat sistemini kullanir
        //HH==> 24'luk saat sistemini kullanir
        //hh kullandiginizda AM veya PM demelisiniz, bunu demek icin "a" yazmaniz yeterlidir.
        // yani ("hh-mm a")


        System.out.println(dtf.format(myTime));//07-42==> 19'u , 07 yapti, cunku kucuk "h" yazdik
        // 12 saat dilimini kullandiginda , saatin sonuna "am" veya "pm" yazman gerekiyor
        // bunun icinde ("hh-mm");==> bunun sonuna "a" ekliyoruz


    }
}

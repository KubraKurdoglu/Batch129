package day09incrementdecrementternaryswitch;

public class NestedTernary01 {

    public static void main(String[] args) {

        /*
        Example 1: Verilen "artik yil"(Leap Year) olup olmadigini konr-trol eden kodu yaziniz
        (bu intewiev sorusu imis

        1) yil 100' e bolunurse 400'e de bolunmelidir 1600==> leap  1800==> lep degil
        2) yil 100'e bolunmuyorsa 4'e bolunmelidir.  2004==> Leap  2005== Leap degil


         */

        int year = 1600;

        String result=year%100==0 ? (year%400==0 ? "Leap": "Not Leap"):(year%4==0 ? "Leap":"Not leap");
        System.out.println(result);

        // burda suna dikkat et ilk kisim true yada false olmasina gore birinci yada
        // ikinci tenary de islem yapiyorsun
        // true ise ilk
        // false ise ikinci tenary e git
        // orda dene kodunu orda da true yada false ye gore yine birinci ve ikinci kisma git
        // ayni mantik



        /*
        int year = 1800; // icin not leap dedi

        String result=year%100==0 ? (year%400==0 ? "Leap": "Not Leap"):(year%4==0 ? "Leap":"Not leap");
        System.out.println(result);

        int year = 2004 ; // icin  leap dedi, fakat 2005 icin not leap dedi

        String result=year%100==0 ? (year%400==0 ? "Leap": "Not Leap"):(year%4==0 ? "Leap":"Not leap");
        System.out.println(result);

         */







    }
}

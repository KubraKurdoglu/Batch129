package day11forloop;

public class ForLoop04 {
    public static void main(String[] args) {

        //Example 1: 5 den 8'e kadar tamsyilarin toplamini veren kodu yaziniz
        //  5+6+7+8==>26
        // elde edecegimiz yeni 26 degeri icin memory de bir yer ayirmaliyiz
        // genelde memory de ayrilan bu degere "sum" deniyor
        // ve bu genelde sum=0 olarak yaziliyor
        // cunku biz islemi yapana kadar onun degeri 0
        // COK ONEMLI SORU




        int sum = 0;

        for( int i=5    ;  i<9      ; i++  ){

            sum= sum + i;
        }

        System.out.println(sum);// 26

        // sout u loop un disina yazdik cunku en son degeri istiyoruz
        // "i" ilk deger 5 oldugu icin, deger olarak 5'den baslayacak



        //Example 2: 7'den 9'a kadar tam sayilarin carpimini veren kodu yaziniz
        // 7*8*9==> 504

        int multiply = 1;

        for(int i=7 ; i<10 ; i++){

             multiply=multiply*i;

        }
        System.out.println( "multiply"+ multiply );






    }
}

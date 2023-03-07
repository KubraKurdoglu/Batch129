package day09incrementdecrementternaryswitch;

public class Ternary01 {

    public static void main(String[] args) {

        int a= 10;
        int b= 20;

        int r1= a<7 ? a++ : b++;

        System.out.println(r1);//20
        System.out.println(a);//10
        System.out.println(b);//21

       // a<7 old icin ternary a ya hic dokunmadi a =10 kaldi
        // a<7 false old icin : bu kisim olan b++ yi ladi
        // boylece b 21 oldu
        // b=21  'i java r1 e aynen koydu


        /*
        b nn artirilmis mi yoksa artirilmamis degerinin mi
        r1 e konulacagini yazacgimiz komuta gore karar vermeliyiz

        asagida yukardakine gore bir farklilik var dikkat et

        int a= 10;
        int b= 20;

        int r1= a<7 ? a++ : ++b;

        System.out.println(r1);//21
        System.out.println(a);//10
        System.out.println(b);//21

        bu durumda r1 de 21


         */


        /*

        int a= 10;
        int b= 20;

        int r1= a<b ? a++ : b++;
        // dikkat et bura a<b yaptik bu dogru old icin a++ dogru
        // bu durumda a artirilmadan direk a=r1 oldu
        // ama sonra a nin arkasini gordu a'yi 11 yapti
/       / b ayni kaldi


        System.out.println(r1);//10
        System.out.println(a);//11
        System.out.println(b);//20


         */


        //Example 2: verilen sayinin mutlak degerini hesaplayan kodu yaziniz
        //  negatif ise -4==>  -1*-4     pozitif ise ==>4

        int c = -4;

        int r2 =c<0 ? -1*c : c;
        System.out.println(r2);

        // yukardaki kodun okunusu soyle
        // sayi 0'dan kucukse "-1" ile carp
        // sayi 0'dan kucuk degilse aynen al
        // sart yani condition true ise birinci ihtimali al
        // burda true oldugu icin -1*c aldik ki pozitif yapalim


        /*
       int c = 4;

        int r2 =c<0 ? -1*c : c;
        System.out.println(r2);

        // yukardaki kodun okunusu soyle
        // sayi 0'dan kucukse "-1" ile carp
        // sayi 0'dan kucuk degilse aynen al
        // sart yani condition true ise birinci ihtimali al
        //sart false ise ikinci ihtimali al
        // burda 4 pozitif o yuzden c'yi aldik direk
         */

        //Example 4: iki sayidan isaretleri ayni ise bu sayilari carpan, isaretleri farkli ise "farkli
        // isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz

        int m = 5;
        int n = 6;

        Object r3=(m>0 && n>0)   ||  (m<0 && n<0) ? m*n : "Farkli Isaretli sayilari carpamiyorum";


     //DIKKAT!!
        // burda iki farkli data tipi var
        // integer yazsan ikinci kosul String
        // bu nedenle her ikisini kapsayan Object data tipini yaziyoruz
        // bunu yeni ogrendik

     //Example 5:
        // size verilen sayinin uc basamakli olup olmadigini kontrol eden kodu yaziniz

        int p= - 436;
        // int p= -436 ; ise de mutlak degeri aldigimiz icin sonuca - 436 yazacak
        int r= Math.abs(p);


        String r4= r>99 && r<1000  ? p+ "sayi uc basamakli" : p+ "sayi uc basamakli degil";

        System.out.println(r4);






    }
}

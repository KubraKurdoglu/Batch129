package day12forloopwhileloop;

public class WhileLoop01 {
    public static void main(String[] args) {

       //  Example 1: 3'den 6 ' a kadar tamsayilari consola 'a yazdiriniz

        //1.YOL
        for (int i=3 ; i<7 ; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        //2.YOL WHILE LOOP

        int i=3;

        while (i<7){
            System.out.print(i + " ");

            i++;
        }

        System.out.println();// bosluk birakmak icin koyduk

        // for loop il ewhile loop un java acisindan bir farki yok
        // for ile yaptiginiz isi while ile de yapabilirsiniz
        // fakat while in anlasilmasi daha kolay
        // while 'in okunmasi daha kolay
        // genellikle "while " kullanilir
        // uzun sure kod yazinca for ' a el daha cok alisiyormus fakat
        // while daha iyi okunuyormus


        //Example 2: 23 den 12 'ye kadar cift tamsayilari console'a yazdiriniz
        // k degeri verdik cunku "i" yi yukarda kulllandik

        int k=23;

        while (k>11){

            if(k%2==0){

                System.out.print(k+ " ");// aralarin abosluk biraktik ki iyi okuyalim

            }

            k--;
        }


        System.out.println();

    //Example 3: verilen bir tamsayinin rakammlari toplmini consola yazdriiniz



        //1.YOL WHILE LOOP
        // rakamlar toplmai genellikle While  Loop ile cozulur



        //578==>  5+7+8==20
        // 578%10==> 8 verecek bana


        int num=578;

        int sum = 0; // elde edecegimiz toplama icin memoryde yer ayirdik

        while(num>0) {   // num 0'dan buyuk oldugu surece loop calismali(kalan sifir olana kadar calismali)

             sum = sum + num%10;


            num/=10; // decrement i bolme ile yapti
        }
        System.out.println(sum);//20

      // "-" eksili degerlerle calismadigini gorduk, o nedenle math.abs kullandik
        // maths.abs kullandigimiz hali asagida

      /*//Example 3: Verilen bir tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz
        int num = -578;

        num = Math.abs(num);
        int sum = 0;

        while(num>0){
            sum = sum + num%10;
            num/=10;
        }
        System.out.println(sum);

       */

        //2.YOL: FOR-LOOP

        int a=684;
        int toplam= 0;

        for (  int m=a  ; m>0    ; m/=10 ){


            toplam=toplam+m%10;


        }

        System.out.println(toplam);


        //WHILE IN YAPTIGI  herseyi for loop da yapar, FOR LOOP UN YAPTIGI HERSEYI WHILE DA YAPAR
        // WHILE ILE FOR ARASINDA SOZ DIZIMI FARKI VAR
        // WHILE LOOP A NISPETEN DAHA KOLAY
        // HOCA BEN WHILE I TERCIH EDIYORUM DEDI


    }
}

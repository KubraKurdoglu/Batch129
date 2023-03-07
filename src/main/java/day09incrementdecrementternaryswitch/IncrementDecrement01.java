package day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {
    public static void main(String[] args) {


        // Increment Decrement
        //Increment artirma demek
        // Increment iki turlu yapilir
        // java tekrari sevmez
        //1.YOL

        int a=5;
        System.out.println(a);//5
        a=a+2;
        System.out.println(a);//7

       //2.YOL

        a += 2;

        // bu yukarda + ile = arasinda bosluk olmamali

        // Example bir tane integer variable olusturun ve onu iki sekilde 5 artirin

        int b=10;
        System.out.println(b);//10

        b=b+5;
        System.out.println(b);//15

        b += 5;
        System.out.println(b);//20


        //DECREMENT (azaltma)

        int c=8;
        System.out.println(c);//8

        c=c-3;
        System.out.println(c);//5

        c -= 3;
        System.out.println(c);//2

        //java tekarari sevmedigi icin "c" yi tekar etmekistemiyor
        // o nedenle c -=3; kullaniyor
        // dikkat - ile = arasinda bosluk olmamali

        // INCREMENT 2:

        int d =6;
        System.out.println(d);//6


        d=d*2;
        System.out.println(d);//12

        d *= 2;
        System.out.println(d);//24

        //DECREMENT 2

        int e =24;
        System.out.println(e);//24

        e=e/2;
        System.out.println(e);//12

        e /= 2;
        System.out.println(e);//6

        // bolme mi cikarma mi yapacagimizi verilen gorevden anliyoruz

        // "1" ile increment ve decrement
        // cok sik kullanilirmis
        // mesela bir okul uygulamasinda ogrencilerin yasi bir seneden seneye
        // bir artacagi icin kolay bir yolunu yapmislar bunun
        // cunku cok kullaniliyormus

        // o nedenle "1" ile artirmalarda
        // a ++;
        // b ++;
        // c ++; seklinde BIRER tane artirabilirsin





        // 1 ile icrement
         int f=12;

         // f=f+1;
        // f += 1;
        f++;


        // 1 ile decrement

        int h= 10;

        // h=h-1;
        // h -= 1;

        h--;


        // POST-INCREMENT ve PRE-INCREMENT
        //post increment

        int i=10;
        System.out.println(i);

        int k= i++;
        System.out.println(k);
        System.out.println(i);


        //post-increment buna post increment diyorlar cunku
        // increment variable den sonra geldi
        // bura COK ILGINC BIR SEKILDE java soldan saga dogru okudugu icin
        // ilk once i'ye k nin degerini hemen veriyor yani i=10 diyor
        // sonra arkadan gelen ++ islemini k'ya atiyor direk
        // k=11 oluyor
        //artmasi gerken i olmasi gerekirken k artiyor


       // pre-icrement

        int m=15;
        System.out.println(m);//15

        int n= ++m;// pre increment cunku increment once yazildi

        System.out.println(m);//16
        System.out.println(n);//16

        // POST- DECREMENTve PRE-DECREMENT

        int p=17;

        int r = p--;// p'yi azaltmadan oldugu gibi r'ye koy

        // r=17  p=16

        int s=20;
        System.out.println(s);//20

        int t=--s;
        System.out.println(t);//19
        System.out.println(s);//19





    }
}

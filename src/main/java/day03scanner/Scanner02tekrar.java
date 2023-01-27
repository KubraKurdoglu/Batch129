package day03scanner;

import java.util.Scanner;

public class Scanner02tekrar {

    public static void main(String[] args) {

      // String de "java kolaydir" ifadesinin tum chacaracterlerini buyuk harf yapiniz

        String s1= " java kolaydir";
        System.out.println(s1.toUpperCase());

        // Kullanicidan ilk ismini ve soyadini alip bunlari alt alta yazdiriniz.

        Scanner input = new Scanner(System.in);


        System.out.println("Ilk isminizi giriniz...");
        System.out.println("Soyadinizi giriniz...");



        // ALISTIRMALAR
        //1
        System.out.println(2+3*(4+5));

        //2

        int sayi1= 5;
        int sayi2= 2;
        int result= sayi1 / sayi2;
        System.out.println(result);

        // 3
        int sayi3= 5;
        int sayi4= 2;
        double result2= sayi3 / sayi4;
        System.out.println(result2);

        //4

        double sayi5= 5;
        double sayi6= 2;
        double result3= sayi5/ sayi6;
        System.out.println(result3);

        //5

        int num= 12;

        num= num+1;
       System.out.println(num);//13

       num= +1;
       System.out.println(num);//1

       num++;
       System.out.println(num);//13

       num+=1;
       System.out.println(num);//13

        // yukardakilerin ucu de topladi ve sonucu 13 verdi birtek num=+1 "1" verdi

        //6
        // asagidaki int in degerini iki azaltabilmek icin asagidakilerden hangisi yapilabilir

        int nombre =12;

       // YONTEM 1

        // nombre  = nombre-1;
        // System.out.println(nombre);//11

       // nombre = -1;
        //System.out.println(nombre);// -1 verdi

        //nombre --;
        //System.out.println(nombre); //11 verdi

        //nombre -= 1;
       // System.out.println(nombre);//11 verdi

        //nombre -2= nombre;// bunda hata verdi


        // asagidaki islemin erkran ciktisi nedir

        int x= 12;
        int y= 15;

        int x2= x*=2;
        System.out.println(x2);// 24


        int y2= y/=3;
        System.out.println(y2);  //5

       // su anda x=24 y=5

        x++;  // bura x degerini 2 artir diyor  yani 2+24=26
        y--;  // burda da y yi 2 azalt diyor  5-2=3



        System.out.println(x+y);// 29  (26+3)

     // example

        int nomber2= 4;
        int nomber3= 5;

        String str0= "Ali";

        // bu verilere gore asagidaki yazdirma seceneklerinden hangisi dogrudur

        System.out.println(str0+nomber2+nomber3); // Ali45 yazdirdi

        System.out.println(nomber2+str0+nomber3); //4Ali5

        System.out.println(nomber2+nomber3+str0); // 9Ali

        // bu yukardakinde toplama islemi yapti bilmiyorum neden

       // System.out.println(str0+[nomber2+nomber3]);

        // yukardaki koda hata verdi ama cevap anahtarinda dogru diyor

        // EXAMPLE: kullanicidan bir byte dat tipinde bir sayi alip, o sayinin 5 katini ekrana yazdirmak icin
        // hangi kodu kullanabiliriz


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen -128 ile 127 arsinda bir sayi giriniz");
        Byte kat= scan.nextByte();

        System.out.println(5*kat);


        //Scanner scan2= new Scanner(System.in);
        //int numbr=scan2.nextInt();
        // System.out.println("lutfen -128 ile 127 arasinda bir sayi giriniz");

        //DIKKAT bu yukardaki kodu calistrimadi



        //Scanner
        // kullanicidan data talep ettigimizde kullaniyorduk

        //EXAMPLE:

        Scanner scan3= new Scanner(System.in);
        System.out.println("Karenin bir kenar uzunlugunu giriniz");
        double kenar= scan3.nextDouble();
        double alan = kenar*kenar;
        System.out.println("Alan"+ alan);//Alan25.0

        // bu yukardaki sorularin hepsini suleyman hocanin kitabindan cozdum
        // simdi asagida tekrar yapacagim


        // kullanicidan ilk ismini ve son ismini alip ikisinide ekrana yazdiriniz


        Scanner deli =new Scanner(System.in);
        System.out.println("adinizi ve soyadinizi yaziniz");
        String ilkad= deli.nextLine();
        System.out.println(ilkad);

        //WRAPPER CLASS

        int num1=Integer.MIN_VALUE;
        System.out.println(num1);

        int num2=Integer.MIN_VALUE;
        System.out.println(num2);

        int num3=Byte.MAX_VALUE;
        System.out.println(num3);

        int num4=Byte.MIN_VALUE;
        System.out.println(num4);

       //MODULUS % bir bolme isleminde bize kalan sayiyi verir

        int sayi= 538;
        sayi= sayi/10;
        System.out.println(sayi);

        int a=15 % 4;
        System.out.println(a);//3

       int sayi0=539;
       sayi2= sayi0 %10;
       System.out.println(sayi2);

       //INCREMENT: bir variable nin degerini artirma yontemleri

        int numA=2;
        numA=numA+3;// veya numA+=3; yapabilrisn
        System.out.println(numA);

        int numB=10;
        numB=numB*7;//veya numB*=7;
        System.out.println(numB);

        int numC=7;
        numC++;
        System.out.println(numC);// ++ iki tane arti bir tane artiriyor sayiyi
        int numD=11;
        numD++;
        System.out.println(numD);// burda da yine iki arti olmasin aragmen sayi br artti

        //DECREMENT bir variable nin degerini azaltma yontemi

        int numZ=2;
        numZ=numZ-2;// yada numZ-=2
        System.out.println(numZ);

        int numE=20; //yada numE/=5
        numE=numE/5;
        System.out.println(numE);

        int numR=11;
        numR--;
        System.out.println(numR);// burasi 10 ve yani iki eksi bir eksiltiyor

        // pre-icrement islemi: variable statement'da kullanilmadan once artirilir veya azaltilir
        // post icrement islemi: variabale statement 'da kulanilir, sonra artirilir veya azaltilir

        int a1=15;
        int b1= ++a1;

        System.out.println(b1);//16

        // int a1=15;
        //int b1= a1++;// burda sonucu 15 veriyor cunlu bu post icrement
























    }
}

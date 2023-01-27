package day28exceptions;

public class Exceptions01 {

/*
  1)Exception demek beklenmedik problem demektir. Seyehatte benzinin bitmesi, arabanin bozulmasi gibi...
  2)Gercek hayatta karsilastigimiz beklenmedik problemler icin cozum yollarimiz vardir. Mesela benzin bitince
    yol yardimi arariz.
  3)Applicationlarda da beklenmedik problemler icin cozum yollari uretmeliyiz,bu isleme "Exception Handling" denir.
    Exception'lar temel olarak ikiye ayrilirlar.
    i)Compile Time Exception:Siz code yazarken fark edilir ve yazdiginiz kodun alti kirmizi cizgi ile cizilir
    ii)Run Time Exception:Siz code yazarken fark edilmez ama code u calistirdiginizda console da hata alirsiniz.
  4)Exceptionlar'lar disinda "error" diye adlandirdigimiz "handle edilemeyen" problemler vardir.
    Gercek hayatta soforun olmesi gibi handle edilemeyecek durumlar "Error" dur.
    Application'larda "Memory" nin dolmasi "Error" dur.
    Iki tur memory vardir;
    i)Stack Memory: dolarsa "StackMemoryFlow Error" alirsiniz.
    ii)Heap Memory: dolarsa "OutOfMemory Error" alirsiniz.
  5)Yazdiginiz kod calismadiginda problemi bulmak icin "Log" lara bakariz.
  6)if else kullanirsak olusabilecek her problemi spesifik olarak if parantezinin icine yazmamiz gerekir.
  Bu da ciddi bir matematik bilgisi gerektirir ve yazacagimiz code u cok uzatir.
  Ama try catch'te Java ilgili Exception ile alakali olusabilecek butun problemleri yakalar.
 */




    public static void main(String[] args) {

        int a = 12;
        int b = 0;

        divide(a,b);
        divide2(a,b);


        //mesela divide methodun da ir "exception olusabilir. eger "b=0" degeri girilirse
        //compile time normal gorunse de run time de hata verecek.
        // cunku bolum sifir olamaz


        //Bu hatayi nasil Handle edecegiz?
        //calistirmamiz gereken kodu try{} body sinin icinde calistirdik. asagidaki sekilde==>
        //try{
        // divide(a,b);
        //}
        // java'ya "dene" diyoruz. denemesini bekledik sonra soyle demeliyiz "yapamazsan..."
        // catch(AritmeticException  e){
        //    system.out.print("Do not divide by zero") }
        //catch==> ben yaklarim o hatayi deyip
        // sout'un icine yapilmamasi gereken mesaji yaziyoruz

    }


    //ArithmeticException yazdiginiz code'da matematiksel islem kullaniyorsaniz alinabilecek bir Exception'dir.
    //Nasil handle edilecegini asagida yazdik.


    public static void divide(int a, int b){

        try {
            System.out.println(a/b);
            System.out.println("I am here");

        }catch (ArithmeticException e){

            System.out.println("Do not divide by zero");

        }

        System.out.println("You are here");
    }

    //"AritmeticException" da if- else kulllanilmaz. bakiniz note 6.

    public static void divide2(int a, int b){
        if (b==0){
            System.out.println("Do not divide by zero");
        }else {
            System.out.println(a/b);
        }
    }

    /*
    bu methodu yazarak hoca sunu gosterdi, if else ile de try cach in yaptigi isi yapamaz miydik?
    hayir yapamazdik cunku, bolme ile alakali matematikteki butun problemleri "try catch ile yakalayabilirsin"
    bunu "if" ile yapmaya kalksan bir matematikci gibi butun problmeleri bilmen ve "if" ile uzun uzun
    yazman lazim, birer birer yazman lazim. buda yazacagin kodu uzatir.
    fakat try catch matematigi bildigi icin muhtemel problemler yakalar.


    try catch de ise "aritmeticException" yazinca aritmetik olarak olusabilecek tum problemeri yakaliyor.

     */
}

package day22staticblocksconstructors;

public class StaticBlocks01 {

   // Bir variable olusturdugunuzda, deger atamazsaniz o variable'i "initialize" etmediniz demektir
    // static variable'lar static block'lar icindde initialize edilirlerse o class icinde herseyden once hazir hale
    // getirilmis olurlar
    // bazen main method calismadan once variable'ler hazir hale getirilmelidir
    // bu yuzden "static block"lar kullanilir

    // bir kac tane static blocks varsa, java yukardan asgi calistigi icin
    // birinci static block u calsitirir, sonra digerlrini sirasiyla calistirir
    //yazarken static bloklar tepeye yazilir
    // DIKKAT !! main'i yukari koysakta ilk once STATIC BLOCKS calisir

    //NOTE: "static blocks" lar static variable'lari initialize etmek icin kullanilirlar
    // NOTE: "static blocks" lar clas  icersinde herseyden once calisirlar


    static double pi;
    static String shape;


    static {
        pi = 3.14;
        System.out.println("Static Block 1");
    }

    static {
        shape = "Circle";
        System.out.println("Static Block 2");
    }

    public static void main(String[] args) {

        pi = 3.14;

    }
}

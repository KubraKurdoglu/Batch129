package calisma01;

public class Calisma02_MethodOlusturma {
    public static void main(String[] args) {

//METHOD CREATION

    int sonuc= add(5,7);
        System.out.println();

    long carpmaSonuc=  multiply(3,6);
        System.out.println(carpmaSonuc);


    int sonuc2 = alan(7,8);
        System.out.println(sonuc2);

    int sonuc3=myMethod(2,3,4);
        System.out.println(sonuc3);


    int sonuc4=dikdortgeninAlani(5,6);
        System.out.println(sonuc4);


    int sonuc5=dikdortgeninCevresi(4,8);
        System.out.println(sonuc5);

    int sonuc6=daireninCevresi(3,14);
        System.out.println(sonuc6);

    int sonuc7=daireninAlani(3,5);
        System.out.println(sonuc7);

    //asagida methodda static yazmazsan hata verir


     int sonuc8=kareninAlani(7);
        System.out.println(sonuc8);

    }


    public static int add(int a, int b){
        return a+b;
    }

    public static long multiply(int a, int b){
        return a*b;
    }


    public static  int alan(int a, int b){
        return 2*(a+b);
    }

    private static int myMethod(int a, int b, int c){
        return a*b+c;
    }

    public static int dikdortgeninAlani(int a, int b){
        return a*b;
    }


    private static int dikdortgeninCevresi(int a, int b){
        return 2*(a+b);
    }

   protected static int daireninCevresi(int p, int r){
        return 2*p*r;
   }

   public static int daireninAlani(int p, int r){
        return p*r*r;
   }

   public static int kareninAlani(int a){
        return a*a;
   }

}


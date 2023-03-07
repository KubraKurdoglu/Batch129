package day02datatypesmethodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {

      int sonuc = add(3, 5);
        System.out.println();



        /*
           1)method olustrurken main method un disinda olustrurman gerekiyor
           2) Accses modofier yazilir+ return type yazilir+ method isimleri yazilir
           3)Mothod olusturduktan sonra parantez acman gerekiyor ki
           java bunun method oldugnu anlasin
           4)asagida yazdigimiz method bize nasil toplmama yapacagimizi verdi
         */


    }
    public static int add(int a, int b){
        return a+b;


}

    protected static long multiply(long a , long b) {
        return a*b;
    }

    }

    //yukariyi niye long yaptik carpmanin sonucu cok buyuk olabilir

    /*       METHOD OLUSTURMA

    1) access modofier yazmalisin
    2) static yazmalisin
    3) data typesini girmelsiin
    4) method adi yaz (yaptigin isleme uygun olmali, carpma ise carpma toplama ise toplmama yaz
    5) sonra degerleri girmelisin
    6)main mthodun iicinde bunu kullanabilirsin


     */
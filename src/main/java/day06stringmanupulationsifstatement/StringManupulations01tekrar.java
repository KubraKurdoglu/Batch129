package day06stringmanupulationsifstatement;

public class StringManupulations01tekrar {

    public static void main(String[] args) {


        String str1="Java";
        String str2= "Guzel";
        int sayi1=5;
        int sayi2= 4;

        System.out.println(str1+" "+ str2+" "+ sayi1+sayi2);//JavaGuzel54
        System.out.println(str1+" "+sayi1+" "+str2);//Java 5 Guzel
        System.out.println(str1+" "+(sayi1+sayi2)+sayi2 );//Java 94
        System.out.println(sayi1+""+ sayi2+ " "+ str2);//54 Guzel


        String a= "Hello";
        String b= "World";
        System.out.println(a+b);
        System.out.println(a+" "+b);

        int k= 2;
        int c=3;

        System.out.println(a+k+c);
        System.out.println(k+c+a);
        System.out.println(a+(k+c));
        System.out.println(a+(k+c+1));







    }
}

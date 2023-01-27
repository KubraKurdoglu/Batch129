package day28exceptions;

import java.lang.invoke.StringConcatException;

public class Exceptions03 {
    public static void main(String[] args) {


        String s = "java";

        getCharFromString(s, 2);
        getCharFromString(s,4);


    }
    //  //String'lerde var olmayan index'ler kullanildiginda Java StringIndexOutOfBoundsException atar.

    public static void getCharFromString(String s, int idx){//method ismi fonksiyonu ozetlemeli



        try{
         char ch = s.charAt(idx);
            System.out.println(ch);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullanma hatasi yaptiniz...  " + e.getMessage());
           // genellikle dev'ler bunu kullanirmis. handle etmeden once yazilan mesaji yazar.
            e.printStackTrace();//printStackTrace()==> bunu kullandiginda "sout" yazma cunku bu methodun icinde var sout.
            System.out.println( e.getCause());
            // hatanin sebebini soyler(bu soruda soylemedi) ama bunun icinde sout yok, sout' la yazdirmalisin
            // oyle yapmazsan "null" der
        }


        //e.getMessage()==> teknik olarak hata mesaji vermej-k
    }


}

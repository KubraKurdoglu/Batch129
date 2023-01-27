package day28exceptions;

public class Exceptions02 {
    public static void main(String[] args) {


        String s = "1234";
        convertStringToInt(s);

        String t = "1a2b";
        convertStringToInt(t);



    }


    public static void convertStringToInt(String s){//String i integer a donusturme metodu

        int intS=0; // en alttaki sout, scope uyarisi verdi. ondan kurtulmak icin int olusturdu burda
        // degerini "sifir" verdi.

        try{
            intS = Integer.valueOf(s);
        }catch(NumberFormatException e){

            System.out.println("Bir String'in sayisa donusturulebilmesi icin rakam disi karakter icermemesi gerekir");

            System.out.println(e.getMessage());//yukardaki sout'un icinde acik bir mesaj var
            //fakat bu sout'ta teknik bir mesaj var
        }



        System.out.println(intS+1);
    }
}

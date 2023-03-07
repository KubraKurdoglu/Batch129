package ssg_ifelse_nestedif;

public class IfElse01 {
    public static void main(String[] args) {

        // gunduz dersimiz varsa katilabilirim

        // gece sinifimiz varsa ona da katilabilirim


        boolean dt = true;
        boolean nt = false;

        if(dt || nt){//eger dt veya nt true ise sinifa katilabilirim

            System.out.println("sinifa katilabilirim");
        }else{
            System.out.println("sinifa katilamam");

        }


        //ISTERSEN SOYLE DE YAPABILIRSIN

        boolean dt1 = true;
        boolean nt1 = false;
        boolean aktifMi= dt1 || nt1;

        if(aktifMi){//eger dt veya nt true ise sinifa katilabilirim

            System.out.println("sinifa katilabilirim");
        }else{
            System.out.println("sinifa katilamam");

        }



    }
}

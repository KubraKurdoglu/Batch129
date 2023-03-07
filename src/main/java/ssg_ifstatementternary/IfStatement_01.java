package ssg_ifstatementternary;

public class IfStatement_01 {
    public static void main(String[] args) {


        int a=12;
        int b=13;

        if(a==b){
            System.out.println("verilen sayilar esittir");
        }

        if(a>100)// eger if icindeki kod dogru ise body icindeki tum kodlar calisir
            System.out.println("a yuzden buyuktur");
            System.out.println("body icindeki tum kodlar calisir");


            // mesela yukarda suslu parantezi kaldirdik, sadece if'in altindaki calisti
        //sonraki sout calismadi

        if(a*b>5){
            System.out.println("verilen sayilarin carpimi 5'ten buyuktur");
        }




        //DIKKAT
        // if 'de suslu parantez kullanmazsan sadece sart true ise sadece if'in altindaki ilk satir calisir
        // condition "false" ise ilk satir calismaz, sonraki satirlar bagli oldugu if' e gore calsir veya calismaz







    }
}

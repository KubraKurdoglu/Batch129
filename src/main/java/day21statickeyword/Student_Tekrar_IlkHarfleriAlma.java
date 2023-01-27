package day21statickeyword;

public class Student_Tekrar_IlkHarfleriAlma {
    public static void main(String[] args) {


        String name = "Tom Hanks";
        String newString=ilkHarfler(name);
        System.out.println(newString);

    }

    public static String ilkHarfler(String name){

        String first = name.substring(0,1);
        String second = name.split(" ")[1].substring(0,1);


        return first+second;

    }

}

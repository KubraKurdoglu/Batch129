package day28exceptions;

public class Exceptions06 {
    public static void main(String[] args) {

        String s = "Java";

        getNumberOfChar(s);//4

        String t = "";
        getNumberOfChar(t);//0

        String u = null;
        getNumberOfChar(u);//NullPointerException




    }

    public static void getNumberOfChar(String s){
        try {


            int numOfChar = s.length();
            System.out.println(numOfChar);
        }catch (NullPointerException e){
            System.out.println("null degeri icin  bazi method'lar kullanilamaz");
        }
    }
}

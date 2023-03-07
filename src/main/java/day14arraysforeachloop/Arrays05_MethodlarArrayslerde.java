package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05_MethodlarArrayslerde {
    public static void main(String[] args) {

        String colors[]= new String[6];

        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";


        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));


        // asagida direk "int=num1" gibi bir deger attamadan da sout la cevabi verdi

        int num1 = Arrays.binarySearch(colors, "Blue");//"0" verdi cunku bu "index"
        System.out.println(num1);
        System.out.println(Arrays.binarySearch(colors, "Blue"));//boyle de oldu

        int num2= Arrays.binarySearch(colors, "Red");
        System.out.println(num2);//"red"nin index ini verdi


        int num3= Arrays.binarySearch(colors, "Orange");


    }
}

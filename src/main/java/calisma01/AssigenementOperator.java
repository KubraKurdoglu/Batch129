package calisma01;

public class AssigenementOperator {
    public static void main(String[] args) {

        int x=5;
        int y=4;
        x=x+4;

        System.out.println(x);//9
        x=x/2;
        System.out.println(x);//4
        x=x%y;
        System.out.println(x);//0
        y=x;
        System.out.println(y);//0
        x= x*y;
        System.out.println(x-y);//0

        // KARSILASTIRMA OPERATORLERI


        System.out.println(5+2==8);
        boolean sonuc1= 5>4 && 7<9 && 6+3==9 && 5+2!=8 ;
        System.out.println(sonuc1);
        boolean sonuc2 = 5>4 && 7>9 && 6+3==9 && 5+2!=8 ;
        System.out.println(sonuc2);
        boolean sonuc3 = 5>4 & 7>9 & 6+3==9 & 5+2!=8 ;
        System.out.println(sonuc3);


     // LOGICAL OPERATORLER

        int mark1 =40;
        int mark2= 60;
        int mark3=30;


        System.out.println(mark1>30 && mark1<70);//TRUE
        System.out.println(mark2>=60 && mark3!=70);//TRUE
        System.out.println(mark3<100 || mark2>80);//TRUE
        System.out.println(mark3!=mark2 && mark2>mark1); //TRUE
        System.out.println(mark2<30 || mark2 >50 && mark2==70);//FALSE












    }
}

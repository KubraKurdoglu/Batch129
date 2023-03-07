package day05typecastingstringmanipulations;

public class SwapValues {


    // Swap: yer degistirmek demektir. 1. kap patataes 2. kap domates. S
    // Swap==> 1. kap domates 2. kap patates

    public static void main(String[] args) {

        int a=12;
        int b=5 ;  // Swap tan sonra a==5 b==12
        int temp= 0;// temporary (gecici)

        System.out.println("a:"+a);//12
        System.out.println("b:"+b);//5

        // Swap ta 1.adim
        // temp in icine a yi koy

        temp = a;

        //2. adim
        a=b;

        //3. ADIM
        b= temp;


        System.out.println("a:"+a);//5
        System.out.println("b:"+b);//12


        //2.YOL

        int x=12;
        int y= 5;

        x=x+y;
        y=x-y;
        x=x-y;











    }
}

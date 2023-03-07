package day19listvarargs;

public class Varargs01_SayiEkleme {
    public static void main(String[] args) {



        add2(3,4,5,67,12);


        toplama(3,6,7,8,9,10);


    }







    public static void add2(int... a){

        int sum = 0;

        for (int w: a) {

            sum += w;

        }
        System.out.println("girilen sayilarin toplami = " + sum);
    }

    public static void toplama(int... x){

        int sum2 = 0;
        for (int k:x) {

            sum2 += k;

        }
        System.out.println(sum2);
    }
}

package day16multidimensionalarrays;

public class Md05 {
    public static void main(String[] args) {

        ////Example 1: Bir integer multi-dimensional array olusturunuz
        ////           Bu array'deki tum elemanlarin carpimini console'a yazdiran kodu yaziniz



        // tekar edecek loop kulanmam lazin
        // icdeki degerleri alacagim kesinlikle each loop kullanmam lazim



        int  a [][] = {{1,2,3}, {1,2,3}};
        int carpim= 1;

        for (int [] w : a){
            for (int k : w){

                carpim = carpim*k;

            }

        }

        System.out.println(carpim);






    }
}

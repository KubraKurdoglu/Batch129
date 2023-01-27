package day11forloop;

public class ForLoop05 {
    public static void main(String[] args) {

        // /*
        //    Example 1: Asagidaki ciktiyi verecek kodu yaziniz
        //                Week: 1
        //                  Day: 1
        //                  Day: 2
        //                  Day: 3
        //                  .....
        //                Week: 2
        //                  Day: 1
        //                  Day: 2
        //                  Day: 3
        //                  ....
        //                Week: 3
        //                  Day: 1
        //                  Day: 2
        //                  Day: 3
        //                  ....
        //
        //  */

// asagida loop un icinde bask abir loop oldugu icin buna nested loop dedik
        // nested yapilar zaman emicidir (time consuming)
        // oyuden mecbur olmadikca kullanilmaz
        // ama interviewler da sorulur
        // nested loop lar aynen soyle calisir
        // "Dünya nın kendi(inner) ve gunes(outer)  etrafında donmesi gibi


        for (int i=1;  i < 5;  i++){

            System.out.println("week" + i);

            for (int k = 1; k < 8; k++) {

                System.out.println("day" + k);

            }
        }










    }
}

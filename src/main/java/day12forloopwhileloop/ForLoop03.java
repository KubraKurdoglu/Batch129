package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop03 {
    public static void main(String[] args) {


/*
    Example 1: Asagidaki sekli cizdiren kodu yaziniz
                * * * *
                * * *
                * *
                *
 */

        //dikkat et ilk satirdaki yildiz sayisis verilen sutun sayisi kadar
        // ilk satirdan azalarak son satira gidiyor

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen satir(row) sayisini giriniz");
        int  row = input.nextInt();


        for(int i=1; i<=row; i++){

            for (int k=row; k>=i ; k--){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}

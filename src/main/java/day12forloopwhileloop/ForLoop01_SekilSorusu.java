package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop01_SekilSorusu {
    public static void main(String[] args) {


        /*
      Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
            X X X X X
            X X X X X
            X X X X X
*/


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen satir(row) sayisini giriniz");
        int  row = input.nextInt();

        System.out.println("lutfen sutun(column) syisini giriniz");
        int column = input.nextInt();


        for (int i=1 ; i<=row ; i++){

            for (int k=1 ; k<=column ; k++){
                System.out.print("X ");
            }

            System.out.println();// bos sout bir alt satira atti
            // bunu yapmak gerekiyordu cunku icdeki loop un isi bitince
            // asagi satirdan yazmak gerekiyor
            // bunu da ancak boyle yapabiliriz
        }


          /*
      Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
            X X X X X
            X X X X X
            X X X X X
*/


        System.out.println("Lutfen satir sayisini yeniden giriniz");
        int satir =input.nextInt();

        System.out.println("lutfen yeni sutun sayisini giriniz");
        int sutun = input.nextInt();

        for (int k= 1; k<=satir; k++){
            for (int l=1; l<=sutun; l++){

                System.out.print("X ");
            }

            System.out.println();
        }

        System.out.println("lutfen 3.kere satir sayisi giriniz");
        int satir1 = input.nextInt();

        System.out.println("Lutfen 3.kere sutun sayisi giriniz");
        int sutun1 =input.nextInt();

        for (int m= 1; m<=satir1; m++){
            for (int n = 1; n<=sutun1; n++){
                System.out.print("W ");
            }
            System.out.println();
        }


        for(int o= 1; o<=4; o++){
            for (int h= 1; h<=4; h++){
                System.out.println("("+o+","+h+")");
            }
        }
        System.out.println("");





    }
}

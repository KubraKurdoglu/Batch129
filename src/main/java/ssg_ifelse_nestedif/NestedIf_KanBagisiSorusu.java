package ssg_ifelse_nestedif;

import java.util.Scanner;

public class NestedIf_KanBagisiSorusu {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");

        int yas=scan.nextInt();

        System.out.println("lutfen kilonuzu giriniz");
        int kilo =scan.nextInt();


        if(yas>18){

           if(kilo>50) {
               System.out.println("kan bagisi yapabilirsiniz");
           }else{
               System.out.println("kan bagisi yapamazsiniz");
           }

        }else{
            System.out.println("kan bagisi yapaya yasiniz uygun degil");
        }









    }
}

package day07ifStatements;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {

        //kullanicidan bir karakter alacagiz ve bu karakter buyuk harf ise ekrana buyuk harf yazdiran
        //kucuk harf ise ekrana kucuk harf yazdiran kodu yaziniz

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir chararcter giriniz..");


        char ch=input.next().charAt(0);

        //yukarda kullanicidan data aldik
        //charAt koyduk cunku tek karakter aliyoruz

        //1.YOL

      //  if(ch>='A' && ch<='Z'){
//
  //          System.out.println("Buyuk Harf..");
//
  //      }

    //    if(ch>='a'  && ch<='z'){

      //      System.out.println("Kucuk harf..");
        //}

/// yukardaki 1.YOLU KAPATARAK asagidaki kodu calistir

        //2.YOL
        // else: disinda tumu demek
        // else de arkasindda gelen kodun disinda tumunu kastediyor
        //else demek, yukardakilerin disindaki demek

        if(ch>='A' && ch<='Z'){

            System.out.println("Buyuk Harf..");

        }else if (ch>='a'  && ch<='z'){

            System.out.println("Kucuk harf..");


        }else {

            System.out.println("harf degil..");

        }




    }

}

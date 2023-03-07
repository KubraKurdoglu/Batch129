package practice.practiceDTNT;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {


        /*
        kullanicidan alacaginiz iki sayiyi yine kullaniciya
        sectireceginiz dort islemden biri ile isleme koyup yazdiriniz

         */


        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen \n Toplma yapmak Icin 1 \ncikarma yapmak icin 2\n " +
                "carpma yapmak icin 3 \n bolme yapmak icin 4 giriniz");
        // yukarda kulllaniicya secmesi icin menu olusturdum



        int islem= input.nextInt();
        System.out.println("Lutfen Iki Tamsayi Giriniz");// menu olusturuldu

        double num1=input.nextDouble();//1. sayi assign edildi
        double num2=input.nextDouble();//2.sayi assign edildi

        if (islem==1){
            System.out.println("toplama isleminin sonucu"+num1+"+"+num2+"="+(num1+num2));
        }else if(islem==2){
            System.out.println("toplama isleminin sonucu"+num1+"-"+num2+"="+(num1-num2));
        }else if(islem==3){
            System.out.println("carpma isleminin sonucu"+num1+"*"+num2+"="+(num1*num2));
        }else if(islem==4){
            System.out.println("bolme isleminin sonucu"+num1+"/"+num2+"="+(num1/num2));
        }else{
            System.out.println("Hatali secim yaptiniz, yeni sayi giriniz");
        }





    }
}

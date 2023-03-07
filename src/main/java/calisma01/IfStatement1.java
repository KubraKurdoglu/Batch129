package calisma01;

import java.util.Scanner;

public class IfStatement1 {
    public static void main(String[] args) {

        // EXAMPLE 1: Verilen karakter buyuk harf ise ekrana "Buyuk harf" yazan kodu olusturunuz.

        char ch='a';

        if(ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf..");
        }

     //Example 2: Verilen sayi cift sayi ise ekrana "Cift sayi" yazdiran kodu olusturun

        int a =3;
        if(a%2==0){
            System.out.println("Sayi cift sayidir...");
        }

    // EXAMPLE 3: Verilen bir sayi 300 den kucuk veya 1200 den buyuk ise ekrana
        // "harika sayi" yazdiran kodu olusturun

        int sayi= 1300;
        if(sayi<300 || sayi>1200){
            System.out.println("harika sayi");
        }
        // EXAMPLE 4: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");

        int num =input.nextInt();

        if(num%2==0){
            System.out.println("bu bir cift sayidir..");

        }else{
            System.out.println("bu bir tek sayidir..");
        }

        // EXAMPLE 5: Verilen bir sayinin negetif, pozitif yada notr oldugunu soyleyen kodu yaziniz.

        int sayi2 = -12;

        if(sayi2<0){
            System.out.println("Sayi negatiftir..");
        }else if(sayi2>0){
            System.out.println("Sayi pozitiftir..");

        }else{
            System.out.println("Sayi notrdur");
        }

        // EXAMPLE 5: kullanicidan alinan bir sayinin negetif, pozitif yada notr oldugunu soyleyen kodu yaziniz.

        Scanner input2= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");

        int sayi3 = input2.nextInt();

        if(sayi3>0){
            System.out.println("bu sayi pozitiftir..");

        }else if(sayi3<0){
            System.out.println("sayi negatiftir..");
        }else {
            System.out.println("sayi notr dur...");
        }


       // EXAMPLE 6:

        //Kullanici gun numarasini girsin kod gun ismini yazsin

        Scanner input3 = new Scanner(System.in);
        System.out.println("Lutfen bir numara giriniz..");

        int nombreDay=input3.nextInt();

        if(nombreDay==1){
            System.out.println("lundi");
        }else if(nombreDay==2){
            System.out.println("mardi");
        }else if(nombreDay==3){
            System.out.println("mercredi");
        }else if(nombreDay==4){
            System.out.println("jeudi");
        }else if(nombreDay==5){
            System.out.println("vendredi");
        }else if(nombreDay==6){
            System.out.println("samedi");
        }else if(nombreDay==7){
            System.out.println("dimanche");
        }else{
            System.out.println("lutfen dogru bir numara grirniz..");
        }

        // EXAMPLE 7: Kullanicidan gun isimlerini aliniz haftaici mi haftasonu mu oldugunu yazdiran kodu olusturunuz.


     Scanner input4=new Scanner(System.in);
        System.out.println("Lutfen bir gun adi giriniz..");
      String nomDay =input4.next();

      if(nomDay.equalsIgnoreCase("lundi")){
          System.out.println("Haftaici..");
      }else if(nomDay.equalsIgnoreCase("mardi")){
          System.out.println("Haftaici..");
      }else if(nomDay.equalsIgnoreCase("mercredi")){
          System.out.println("haftaici..");
      }else if(nomDay.equalsIgnoreCase("jeudi")){
          System.out.println("haftaici..");
      }else if(nomDay.equalsIgnoreCase("vendredi")){
          System.out.println("haftaici..");
      }else if(nomDay.equalsIgnoreCase("samedi")){
          System.out.println("haftasonu");
      }else if(nomDay.equalsIgnoreCase("dimanche")){
          System.out.println("haftasonu");
      }else{
          System.out.println("Lutfen gecerli bir gun giriniz..");
      }


        //EXAMPLE 8:

        //Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore yazdiran kodu olusturunuz.
         //       - 0-4 arasi "Bebek"
          //      - 5-12 arasi "Cocuk"
          //      - 13-20 arasi "Genc"
          //   - 21-30 arasi "Yetiskin
        //Tanimlanmamis Evre
        //Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz


      Scanner input6 =new Scanner(System.in);
        System.out.println("lutfen yas giriniz..");
      byte age =input6.nextByte();

      if (age>0 && age<5){
          System.out.println("Bebek");
      }else if(age>4 && age< 13){
          System.out.println("Cocuk");
      }else if(age>12 && age<21){
          System.out.println("Genc");
      }else if(age>20 && age<31){
          System.out.println("yetiskin");
      } else {
          System.out.println("Lutfen gecerli bir yas giriniz..");
      }



        /*
        EXAMPLE 9:

        Kullanicidan bir gun alin
        - Eger gun cuma ise "Muslumanlar icin kutsal gun"
        - Eger gun cumartesi ise "Yahudiler icin kutsal gun"
        - Eger gun pazar ise "Hiristiyanlar icin kutsal gun"
        Yazdiran kodu yaziniz
        */


        Scanner input8 =  new Scanner(System.in);
        System.out.println("lutfeb bir gun adi giriniz");

        String jour=input8.next();

         if(jour.equalsIgnoreCase("cuma")){
             System.out.println("muslumanlar icin kutsal gun");
         }else if(jour.equalsIgnoreCase("cumartesi")){
             System.out.println("yahudiler icin kutsal gun");
         }else if(jour.equalsIgnoreCase("pazar")){
             System.out.println("hristiynalar icin kutsal gun");
         }else {
             System.out.println("lutfen gecerli bir gun giriniz..");
         }

         /*
        EXAMPLE 10:

        Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
        dort islemden biri ile isleme koyup yazdiriniz.
        */

       Scanner input9 = new Scanner(System.in);
        System.out.println("lutfen bir matematik islemi giriniz;\n toplama icin '1' " +
                "\n cikarma icin '2' \n carpma icin '3'\n bolme icin '4'" +
                "");

        int islem =input9.nextInt();
        System.out.println("lutfen iki tane sayi giriniz");

        double sa1= input9.nextDouble();
        double sa2= input9.nextDouble();

          if(islem==1){
              System.out.println(sa1+sa2);
          }else if(islem==2){
              System.out.println(sa1-sa2);
          }else if(islem==3){
              System.out.println(sa1*sa2);
          }else if(islem==4){
              System.out.println(sa1/sa2);
          }else{
              System.out.println("lutfen gecerli bir deger giriniz..");
          }




        // EXAMPLE 4
        // Iki sayinin isareti ayni ise bu sayilari carpan,
        // isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz









        }




    }






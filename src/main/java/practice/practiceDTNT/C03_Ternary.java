package practice.practiceDTNT;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        /*
        kullanicidan sifirdan buyuk pozitif bir tamsayi girmesini isteyin
        girilen pozitif tamsayi uc basamakli ise ekrana uc basamakli yazdirin
        uc basamakli degilse cift olup olmadigini kontrol edin
        cift ise uc basmakli olmayan cift sayi yazdirin
        cift degilse uc basamakli olmayan tek sayi yazdirin
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Sifirdan buyuk pozitif bir tamsayi girin");

        int sayi=input.nextInt();


          boolean sifirdanBuyukUcbasamakli=sayi>99 && sayi<1000;
          boolean sifirdanBuyukUcBasamakliOlmayanCift=!(sayi>99 && sayi<1000) && sayi%2==0;


        if(sayi>0){

           if (sifirdanBuyukUcbasamakli){

                          System.out.println("uc basamakli sayi");
            }else if(sifirdanBuyukUcBasamakliOlmayanCift){
               System.out.println("Sifirdan buyk uc basamakli olmayan cift sayi");

            }else{
                System.out.println("uc basamakli olmayan pozitif tek sayi");
            }





        }else {
            System.out.println("lutfen pozitif bir tam sayi giriniz");
        }// if in body si burasi


        System.out.println("*******TERNARY ILE COZUMU********");

        boolean sifirdanBuyukUcbasamakliternary=sayi>99 && sayi<1000;
        boolean sifirdanBuyukUcBasamakliOlmayanCiftTernary=!(sayi>99 && sayi<1000) && sayi%2==0;

      //TERNARY==>  sart ? true action    : false action



        String sonuc= sayi>0 ? sifirdanBuyukUcbasamakliternary ? ("3 basmakli sayi"):
                sifirdanBuyukUcBasamakliOlmayanCiftTernary?("3 basamakli cift say"):
                        ("3 basamakli olmayan tek sayi"):("lutfen pozitif bir tamsayi giriniz");

    }
}

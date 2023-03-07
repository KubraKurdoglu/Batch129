package day11forloop;

public class ForLoop02 {
    public static void main(String[] args) {

        // Example 1: verilen bir string de 'a' karakteri haric tum karakterleri yazdiriniz
        // "Madagaskar" ==> mdgskr
        // asagida uc yol goruyorsun ve hoca en iyisi 1.yol dedi
        //replace daha kisa for daha uzun
        // burda continue yi ogrenmis olduk
        // berak ile continue farki break kir birak orda
        // continue is edevam et demek

        String s = "Madagaskar";


        //1.YOL hic loop kullanmadn cozmek

        String t = s.replace("a","");
        System.out.println(t);// Mdgskr

        System.out.println();
        System.out.println();// bos sout attik rahat gorebilmek icin



        //2. YOL

        for (int i=0; i<s.length(); i++){

            char ch =s.charAt(i);
            if(ch!='a'){
                System.out.print(ch);
            }
        }

        System.out.println();
        System.out.println();

        //3.YOL

        for (int i=0; i<s.length(); i++){

            char ch =s.charAt(i);
            if(ch=='a'){
                continue;// continue keyword u bazi sartlar icin loop un adimlarini atlamamizi saglar
            }

            System.out.print(ch);
        }




    }
}

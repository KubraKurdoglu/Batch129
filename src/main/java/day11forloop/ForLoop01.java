package day11forloop;

public class ForLoop01 {
    public static void main(String[] args) {


// Example 1: verilen bir String de ilk 'a' harfinden  onceki tum karakterleri konsola yazdiriniz
 // String "I love Java" ====>  "I love J" olmali
       // nicin loop kullaniyoruz 1.karakrtere bakiyorum a degil yazdir
       //2. karaktere bakiyorum a degil yazdir
       // tekar eden bir islem var o nedenle loop kullandi

       String s="Tramvay";


       //s.lenght yapti cunku lenght a esit olana kadar git dedia yi bulana kadar yani
        // baslanguc degeri index i i=0
        // lenght ten bir kucuk olana kadar loop calismali
        // lenght-1  (lenght-1==11) 0'dan 11'e gidene kadara artirmam lazim

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                break;
            }
            System.out.print(s.charAt(i));
        }

        //Example 2: verilen bir string de son 'a' dan sonraki tum karakterleri
        // yazdiriniz
        // "Germany"==>  ny yi yazdirman gerekiyor ama onuda ters siradan yazdirmalisin
        // yani 'yn' olarak
        // ters sirada yazdir dedigi icin sondan basliyoruz
        // tersten baslamak demek baslanguc degerinizin en son indeks olmasi demek
        // son idex degeri length-1 ile oluyordu
        // loop un son ksminda i>0 dedik cunku 6 dan baslayip eksilere dogru gittik
        // negatife gidemez boylece

        String t="Germany";

        for(int i=t.length()-1; i>=0; i--){


            if(t.charAt(i)=='a'){
                break;
            }
            System.out.println(t.charAt(i));
        }

   //if in icindeki kod ne olursa olsun if in sarti true olursa calisir



     // yukardaki kodlari guzellestirmek icin soyle bir sey yapti
     //chatAt i iki kere kullanmak yerine charAt memory e atiyoruz yani deger atiyoruz buna
        // sonra o memorydeki degeri tekar tekrar kullaniyoruz
        // buna kod gelistirme deniyor== update
        // negatif sayilar indexlerde yoktur o nedenle yukarda i>= dedik




        /*


        for(int i=0; i<s.length(); i++){
        char ch=s.charAt(i)
            if(ch=='a'){
                break;
            }
            System.out.print(ch);
       */











    }
}

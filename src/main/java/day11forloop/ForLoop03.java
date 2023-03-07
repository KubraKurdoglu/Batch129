package day11forloop;

public class ForLoop03 {
    public static void main(String[] args) {


        //inretview sorusu
        //bu sorunun cevabini tek basina cozemezsen interview e girme dedi!

        //Example 1:  Size verilen bir String i tersten yaziniz
        // "Germany" ==> ynamreG


      String s= "Germany";
      String t= "";


       for(int i= s.length()-1; i>=0 ; i--){

       t= t+ s.charAt(i);

   }
        System.out.println(t);




      // bunu yaptik ama simdi asil mesele memory de yer acmak bunu
      //  bunun icinde bir string t aciyoruz
      // sonra ilk basta yazdigimiz sout u siliyoruz
      // ve t' yi bir kodla kulaniyoruz
      // "+t " dedik cunku concatination yapiyoruz
      // loop kirilinca
        // sout u loop un icine yazarsan tum ters yazim asamalarini tek tek gosterir






        /*
        String s= "Germany";



       for(int i= s.length()-1; i>=0 ; i--){

       System.out.println(s.charAt(i));// ynamreG
   }
         */


        //Example 2: size verilen bir String in "Palindrome" olup olmadigini kontrol ediniz
        //   civciv, nalan , kucuk ; 11211 ==> Palindrome
        // Logic: String'i ters cevir sonra da duz hali ile ters halini karsilastir, ayni ise "Palindrome" de.
        // interview lerde bu mantigi sesli dusunup soylersen bazen sana kod bile yazdirmaz


        String duz = "civic";

        String ters = "";


        // ikinci bir String daha actik cunku tersten gelen deger icin elde ettigimiz degeri o String e attik

        for (int i=duz.length()-1 ; i>=0 ; i--){
            ters= ters + duz.charAt(i);

        }

        if(duz.equalsIgnoreCase(ters)){
            System.out.println(duz + " Palindromdur");
        } else {
            System.out.println(duz + "palindrome degildir");

        }


        // ters= ters + duz.charAt(i); // duzden aldigin karakteri ters ile concatination yap
        // ve ters'e ata esit ise palindrome dir;
        // String lerde "==" kullanmiyorduk
        // o nedenle equals kullaniyoruz
        // buyuk harf kucuk harf duyarliligini kaldirmak icin equalsignorecase kullandi
        // bize String "duz" palindrome mu diye soruyor o nedenle mesajda onu kullandik

    }
}

package calisma01;

public class Calisma07_TekrarlananKarakterler {
    public static void main(String[] args) {


// Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
// Örneğin; accessories ´ ces

        String s = "accessories";
        String d = "";
        for(Integer i=0; i<s.length(); i++){
            String c = s.substring(i,i+1);
            if(s.indexOf(c)!=s.lastIndexOf(c)){
                if(!d.contains(c)){
                    d = d + c;
                }
            }
        }
        System.out.println(d);





        /*
     120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
     ardışık tam sayı arasında boşluk bırakarak yazınız.

      */


        for (int i=11 ; i<121 ; i++){
            if(i%4==0 && i %6==0){
                System.out.print(" "+i);
            }

        }

        //WHILE ILE COZUMU

        int i=120;
        while(i>10){
            if (i%4==0 && i%6==0){
                System.out.print(i + " ");//120 108 96 84 72 60 48 36 24 12

            }
            i--;

        }


      //Exemple: Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız.
      // Bir String, tersi ile aynıysa, buna palindrom denir. Örneğin; "anna", "123321" palindromlardır.
        System.out.println();

        String str3= "kubra";
        String str4= "";


        for(int k=str3.length()-1 ; k>-1 ; k--) {
            String ch = str3.substring(k, k + 1);

            str4 = str4 + ch;

        }
        if (str3.equals(str4)){
            System.out.println("polidromdur");


        }else {
            System.out.println("polidrom degildir");
        }






    }
}

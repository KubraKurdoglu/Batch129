package day15arrays;

public class Arrays04 {
    public static void main(String[] args) {

        //Example 1: bir Array'in icinde herhangi bir elemanin olup olmadigini
        // kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz


        int a[] = {0, 2, 3,0, 12, 0};

        int num = 0;// bunu rakamlari denemek icin kullandik, yukardaki rakamlarin hepsini yazabilirsin
        //int a[] = {0, 2, 3,0, 12, 0}; burdan sayi al, int num ile karsilastir ayni ise, counter'i artir

        int counter = 0; // sayacagimiz icin counter dedik

        // a'nin icindeki degerleri tek tek alacagiz int num'a esit mi bak
        // esitse counter'i artir

        for (int w : a){

            if (w==num){
                counter++;

            }
        }


        if(counter>0){// loop bittigindeki counter'in degerine gore buna gececek
            System.out.println(num+ " array'de "+ counter +" defa var");//0 array'de 3 defa var
        }else {// mesela counter 0 oldugunda bu kisim calisacak cunku if calismayacak buraya atacak
            System.out.println(num + " Array'de yok.");//15
        }






    }
}

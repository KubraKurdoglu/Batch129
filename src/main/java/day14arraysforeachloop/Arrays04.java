package day14arraysforeachloop;

public class Arrays04 {
    public static void main(String[] args) {

        //Example 1: String bir array olustrurunuz 6 eleman ekleyiniz, Yellow'dan onceki elemanlari yazdiriniz
        //(Red
        //Orange
        //Blue bunlari yazdirmali

        //yine for-each-loop kullanacagiz cunku ARRAY

        String colors[]= new String[6];

        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        for(String w : colors){

            if (w.equals("Yellow")){

                break;
            }

            System.out.println(w);
        }



        // for-each-loop da da "break" kullaniliyor
        // "yellow" a kadar olanlari al dedigi icin yellow sonrasini kirdik

        //Example 1: String bir array olustrurunuz 6 eleman ekleyiniz, Yellow'dan sonraki elemanlari yazdiriniz


        String color[]= new String[6];

        color[0] = "Red";
        color[1] = "Orange";
        color[2] = "Blue";
        color[3] = "Yellow";
        color[4] = "Green";
        color[5] = "Brown";

        //1.YOL:
        // note: elemanlari almaya son elemandan baslayacagim icn for-each-loop kullanamam
        // bu yuzden for-loop kullandik


        for(int i = color.length-1; i>=0; i--){

            if(color[i].equals("Yellow")){
                break;
            }
            System.out.println(color[i]);
        }


        //2.YOL:
        //Yellow elemaninin indeks ini bul ve o index'ten daha buyuk indeks'e sahip ilan elmeanlari yazdir.

        int counter = 0;

        for (String w : color){
            if(w.equals("Yellow")){
                break;
            }

            counter++;
        }

        for(int i=counter+1; i<color.length; i++){// burda "counter+1" dedi cunku, counter zaten "Yellow"u veriyor
            System.out.println(color[i]);
        }





    }
}

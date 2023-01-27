package day14arraysforeachloop;

public class Arrays04OncekiElemanlariYazdir {
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





        /*
         for (String w: colors) {

            if (w.equals("Yellow")){
                break;
            }
            System.out.println(w);
        }

        System.out.println();


         */


        //Example 1: String bir array olustrurunuz 6 eleman ekleyiniz, Yellow'dan sonraki elemanlari yazdiriniz

       /* for (int i= colors.length-1; i>=0; i--){

            if (colors[i].equals("Yellow")) {
                break;
            }
            System.out.println("Yellow'dan sonrakiler: "+colors[i]);
        }


        */

/*
        for(int i = colors.length-1; i>=0 ; i--){
            if (colors[i].equals("Yellow")){
                break;
            }
            System.out.println(colors[i]);
        }

 */

        //2.YOL:
        //Yellow elemaninin indeks ini bul ve o index'ten daha buyuk indeks'e sahip ilan elmeanlari yazdir.

        int counter =0;

        for (String w: colors){
            if(w.equals("Yellow")){
                break;
            }
            counter++;
        }

        for (int i = counter+1; i<colors.length; i++){
            System.out.println(colors[i]);
        }










        }

    }


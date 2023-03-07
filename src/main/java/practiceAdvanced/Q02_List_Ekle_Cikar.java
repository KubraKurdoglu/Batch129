package practiceAdvanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_Ekle_Cikar {

    //Kullanıcıdan aldığınız bir sayıyı bir list'e ekleyen,
    // list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        List<Integer> list = new ArrayList<>();



        //soruyu dinamik yapabilmek icin "while" kullandi
        // "set" methodu
        // "remove" methodu kullanacagiz dedi
        // WHILE 'in icine (true) yazarsan sonsuz calisir
        // onu kiracak bir sey koyman lazim, "break" koymalisin
        // eklemek icin "add"
        // silmek icin "remove"
        //cikmak icin "break"
        //"remove" methodu primitive data olarak yazilirsa "eleman" olarak algilayacak
        // "remove" methodu wrapper class olarak yazilirsa "index" olarak o sayiyi alir ve siler
        // yani o indexteki sayiyi siler
        // silerken de "ILK GORUNMU "alir
        //degistirirkende "ILK GORUNUMU" alir


        while (true){
            System.out.println("Ekleme yapmak icin 'add' \n+" +
                    "Element guncellemek icin 'set' \n"+
                    "Element silmek icin 'remove' \n"+
                    "cikmak icin: 'break' \n" + "komutunu giriniz");

            String komut =input.next();
            if(komut.equalsIgnoreCase("add")){

                System.out.println("eklemek istediginiz tamsayiyi giriniz");

                int eklenecekSayi=input.nextInt();

                list.add(eklenecekSayi);

            } else if (komut.equalsIgnoreCase("set")) {
                System.out.println("guncellemek istediginiz index'teki elemani giriniz");

                int guncellenecekIndex = list.indexOf(input.nextInt());
                System.out.println("yerine eklemak istediginiz sayiyi giriniz");

                int yeniSayi = input.nextInt();

                list.set(guncellenecekIndex, yeniSayi);

            }else if(komut.equalsIgnoreCase("remove")){
                System.out.println("silmek istediginiz sayiyi giriniz");

                Integer silinecekSayi=input.nextInt();// wrapper class aldi cunku object 'i silmek istiyor
                //yani direk degeri silmek istiyor
                //eger primitive yazsaydi yani int yazsaydi direk "index" olarak algilayacak
                // ve index'teki degeri silecekti

                list.remove(silinecekSayi);

            } else if (komut.equalsIgnoreCase("break")) {
                break;

            }else{
                System.out.println("gecerli bir komut giriniz");
            }

            System.out.println(list);

        }
        System.out.println("gule gule");
        System.out.println("list " +list);


    }











}

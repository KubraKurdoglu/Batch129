package day03scanner;

import java.util.Scanner;

public class Scanner01 {

    // kullanicidan data alip appplication da kullanacagiz.
    // java bunu scanner class yardimi ile yapar
    // sacnner class kullanicidan data alip kodlarimizda kullanmayi saglar

    Scanner Input= new Scanner(System.in);


// bu yukardaki obje olusturma
// object in ismini "input" yapti cunku bu object kullanicidan alinan data yi benim kodlarimin icine koyacak
    // system.in yazdi cunku verilen datayi kodlarimin icine koyuyorum

    // mesela system.out.println de  out dedik cunku o zaman disarda yazsin istiyorduk.


    public static void main(String[] args) {

        Scanner Input= new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz...");

        byte age = Input.nextByte();
        System.out.println(age);
    }

}
package day30exceptionsinterface;

public interface Ac {

    //"Interface" ler calss degildir. Interface interface'dir
    //interface'lerin icine "concrete" method konulamaz. Cunku "concrete" methodlarda body vardir
    // ve body o isin nasil yapilacagini belirtir. Isin nasil yapilacagi
    // bir cok detay icerir ve bu Child class'larda kafa karisikligina neden olur
    //Halbuki sadece yapilacak isi belirtip nasil yapilacagini Child Class'a birakirsaniz
    //Child Class'in kafa karisiligini engellemis olursunuz.


    //interface'ler concrete method icermezler, dolayisiyla interface'in icindeki hicbirsey istege bagli degilidr
    // hersey Cild Classs'lar icin mecburidir. Bu yuzden Interfac'lere
    //"to-do List" de denir.


    //Interface'lerdeki tum methodlar otoamatik olarak;
    // "public'tir
    //"abstract"tir
    // "static" degildir .

    //Inrerface'deki method'lar otomatik olarak
    //


    void cool();
    void run();

   int price = 2000;
   String model = "Mitsubishi";

}

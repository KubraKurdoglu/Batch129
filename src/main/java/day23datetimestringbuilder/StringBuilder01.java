package day23datetimestringbuilder;

public class StringBuilder01 {

    /*
     Java'da String, String Class kullanilarak veya StringBuilder Class kullanilarak olusturulabilir.
     "String Class kullanilarak urettigimiz Strinler "Immutable"(Degistirilemez) dir
     "StringBuilder Class" kullanilarak urettigimiz Stringler"Mutable"(Degistirilebilir) dir.
     */
    public static void main(String[] args) {

        //Immutable
        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        //String'i degistirdikten sonra ayni String assign ederseniz, Java yine yeni bir container olusturur,
        //degismis degeri bu yeni container'in icine koyar ve eski container'i gosteren oku yeni container'a yonlendirir.
        //Dolayisiyla eski container adressiz kalir, ve "Garbage Collector" adressiz olan container'lari siler.

        String a = "Money";
        a = a + "More";

        //Mutable
        // StringBuilder kullanarak String uretmenin 1.Yolu
        StringBuilder sb1 = new StringBuilder("Python");
        sb1.append("!").append("?").append(".");
        System.out.println(sb1);//Python!?.

        //StringBuilder kullanarak String uretmenin 2. Yolu
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());//0
        //StringBuilder kullandiginizda baslangic kapasitesi 16 dır.
        //Kapasite asildiginda varolan kapasitenin 2 fazlası kadar varolan kapasiteye ekleme yapilir.
        // 16--> 16*2+2       - 34 ==> 34*2+2
        System.out.println(sb2.capacity());//16

        sb2.append("Java");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34 = 16*2+2

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//70 = 34*2+2

        //StringBuilder kullanarak String uretmenin 3. Yolu:
        StringBuilder sb3 = new StringBuilder(2);


        sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6

        sb3.insert(2,"XXXXX");//FlXXXXXo
        System.out.println(sb3.length());//9
        System.out.println(sb3);

        //toString methodu String builder'i String'e cevirir
        //String Class'ta var olan ama String builder class'ta var olmayan split() methot gibi
        //methotlara ihtiyac duydugumuzda toString() methodunu kullanarak String class'a gecer ve o methotlari
         //kullaniriz

        sb3.toString().split("l");//burda sb3'u String'e cevirdi

        //String'i tekar StringBuilder'a cevirebilirsiniz
        StringBuilder sb4  = new StringBuilder(sb3);
        System.out.println(sb4);



        //reverse() methodu String'leri ters cevirir.
        sb3.reverse();
        System.out.println(sb3);//oXXXXXlF



        //Karakter silme

        sb3.deleteCharAt(1);// sb3 deki "1". index'teki karakteri sil
        System.out.println(sb3);//oXXXXlF


        sb3.delete(1,6);// baslangic ve bitis index'lerini vereceksin aradkileri silecek
        // java'da hep ikinci index alinmaz, o nednele yukarda 1. ve 5. index'leri silmek icin
        // index olarak 1 ve 6 aldik, 6 dahil olmayacak ve boylece 5. index'e kadar alacak

        StringBuilder sb5  = new StringBuilder("Java");
        StringBuilder sb6  = new StringBuilder("Java");


        System.out.println(sb5.compareTo(sb6));//0
        // bu yukarda yeni tazdigi iki string'i karsilastirdi
        // sb5.compareTo()==> alfabetik olarak karsilastirir

/*
        StringBuilder sb5  = new StringBuilder("Hava");==> bura H var, H ile J arasinda kac
        deger varsa "+" o kadar deger verecek
        StringBuilder sb6  = new StringBuilder("Java");
        // mesela, ikici StrinBuilder'de
        // J yerine K koysaydin, -1 verir. Yani alfabetik sira olarak J harfi, K harfinden 1 oncedir.
        // compareTo() alfabetik olarak karsilastirir. Bu method ascii degerlere gore islem yapar.
        // compare (ENG) == karsilastirma (TR)
        //
        Bunu disarda yazdir ve calistir, boylece sonucu bulursun

 */
        //sb6.setCharAt();==> "set" java'da hep degisim icin kullanilir

        sb6.setCharAt(2, 'm');// char kullandigimiz icin java ' ' istedi.
        // yukardaki kodun anlami, index 2'deki karakteri m'ye cevir

        System.out.println(sb6);//Jama


        // replace methodu ile ise index'ler arasindaki degerleri degistirebiliyor

        sb6.replace(1,3, "xyz");

        System.out.println(sb6);//Jxyza


        //StringBuilder Class'ta kullanmamiza izin verilen bazi String Class methodlari vardir
        // ornegin "substring()" method gibi. Bu methodlari StringBuilder ustunde kullaninca
        // StringBuilder'in orijinal degeri degismez
        //substring() methodu String Class' in methodudur.
        // sen substring'i kullandiginda orijinal degeri degistiremezsin.

       String sb7 =  sb6.substring(1,3);//substring'de icinde verilen index'lerdeki degerleri aliyorduk
        System.out.println(sb7);//xy
        System.out.println(sb6);//Jxyza ==> sb6 hala ayni, degismedi









    }
}

package day04asciiwrapperclassoperatorsmemoryusage;

public class WrapperClass {
    public static void main(String[] args) {

        // primitive: char  -  boolean -- byte -- short---int--long -- float-- double
        // Wrapper Class : Character -- Boolean -- Byte -- Short-- Integer-- Long-- Float--Double
        // non-primitiveler buyuk harfle basladigi icin wrapper class larda buyuk harfle baslar
        // Wrapper Class lar non-primitive dirler o yud-zden memory de cok yer kaplarlar.
        // o nedenle Wrapper class gerekli degilse kullanmayiz.


        int n = 12;

        //"n" yazip "." koydugumuzad  ardindan method gelmiyor cunku primitive lerin icinde method yok

        Integer m = 12;

        // burda ise "m"yazip "." koydugumuzda  ardindan hemen bir cok method geliyor cunku wrapper lerin icinde method var

        byte p = 23;
        Byte b = 23;

        //Example 1: short data type inin minimum ve maksimum degerlerini kod yazarak bulunuz

        short maxShort=Short.MAX_VALUE;
        System.out.println(maxShort);//32767

        short minShort= Short.MIN_VALUE;
        System.out.println(minShort);//-32768

// Example 2:int data type sinin min degeri ile byte data type sinin maks degerinin toplamini bulunuz

        int intMin =Integer.MIN_VALUE;
        byte byteMax= Byte.MAX_VALUE;
        System.out.println("Toplam"+ (intMin+ byteMax));

        //example 3: i) Primitive int'i Wrapper Integer e cevriiniz

        int num= 22;
        Integer wrapperNum= num;

        System.out.println(wrapperNum);//22

        //ii) Wrapper Byte i primitive byte ceviriniz

        Byte k = 43;
        byte primitiveK= k;
        System.out.println(primitiveK);

        char cev= 't';// char tek karkter ve tek tirnak icinde olmali
        Character primitivecev= cev;// burdaki islemde memory de depo olusturuyoruz
        System.out.println(primitivecev);

        Boolean wrapperl= true;
        boolean primitivewrapper = wrapperl;// burdaki islemde memory de depo olusturuyoruz
        System.out.println(primitivewrapper);

        // hocanin cozumu

        //ii)

        char initial = 't';
        Character initialWrapper = initial;
        System.out.println(initialWrapper);

        Boolean isOld = true;
        boolean isOldWrapper= isOld;
        System.out.println(isOldWrapper);

//Example 5: size String olarak verilen iki fiyat in toplamini ekrana yazdirin
        String shirt= "2300";
        String shoes= "5200";

        // java da "+" sembolu iki sayi arasinda kullanilirs toplama islemi olur
        // java'da "+" sembolu iki String arasinda veya iki String bir sayi arasinda kullanilirsa
        // CONCATENATION islemi olur. Concatenation birlestirme dmektir.
        // Concatination islemlerinde java matematikteki islem onceligi kurallarini kullanir

        System.out.println(shirt+shoes);//23005200

       int toplamfiyat=  Integer.valueOf(shirt)+ Integer.valueOf(shoes);

       // bu ilk kisim memory de yer acmak demek   ikinvi kisimda ise stringer degerlerin miktarlarini cektik.
        // burdaki valueof ilk is olarak burdaki karakterlerin hepsinin rakam olup olmadigin bakiyor.
        // hepsi rakamsa bu karakterlein hepsini cevirebilir

        System.out.println(toplamfiyat);//7500

        //example 6: size String olarak verilen iki fiyatin toplamini ekrana yazdiriniz
        // valueof() metodu tum karakterleri rakam olan String lerisayilara cevirir.
        // eger valueof() metodu kullanirken String in icine rakam olmayan bir karakter koyarsaniz java hata verir
        // bunu duzeltmeyi ilerde gorecegiz

        String tv= "$11000";
        String radio = "$3000";
        System.out.println(tv+radio);//$11000$3000

        int toplamtvradiofiyati= Integer.valueOf(tv)+ Integer.valueOf(radio);







    }
}

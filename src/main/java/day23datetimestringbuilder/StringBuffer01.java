package day23datetimestringbuilder;

public class StringBuffer01 {

    /*
    String olustrumak icin String Class, StringBuilder Class ve StringBuffer kullanilabilir
    1)stringBuffer Java'nin String uretmek icin olusturdugu ilk Class'tir. Java'nin 5. surumunde
    uretilmistir.
    2) StringBuffer "synchronized" dir, StringBuilder "synchronized" degildir.
    3) StringBuffer "thread-self" dir, StrinBuilder "thread-safe" degildir.
    4) StringBuffer ve StringBuilder ikisi de "mutable" degildir.

    Note 1:Immutable String lazim oldugunda String Class kullaniriz.
    Note 2:Mutable String lazim oldugunda StringBuilder veya StringBuffer kullaniriz.
    Note 3:StringBuffer "Multithread" ve  "Synchronization" lazim oldugunda tercih edilir.
       StringBuilder "Multithread" ve  "Synchronization" gerekmezse tercih edilir.


QA'LAR BU UCUNUN FARKINI BILSIN YETER DEDI
     */

//Bir string'i ayni anda birden fazla gorevde kullanmak gerekirse
    //Strinbuffer kullanman gerekiyor
    //java'da coklu is yapmaya "multithread" denir.
    //Bir anda birden fazla is yapar
    // "multi ==> cok demek , thread==> is demek"
    //"multithread"in basarili olabilmesi icin "Mantikli Bir siralama" cok onemlidir
    // Bu mantikli siralamya " synchronized" deniyor
    //StrinBuffer ==> "thread-safe"dir yani isleri mantikli bir sekilde siralar
    // ama eger multithread kullanmayacaksan StrinBuffer kullanma
    // cunku o cok ozelligi oldugu icin yavas calisir
    // multithread is yapmayacaksan, stringBuilder kullan



    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);

       //" sbf." yazinca methodlar cikiyor karsimiza . nerdeyse StringBuilder ile ayni method'lar var

        System.out.println(sbf.capacity());//20==> 4 zaten vardi, 16'da kendi verdi, 20  oldu






    }
}

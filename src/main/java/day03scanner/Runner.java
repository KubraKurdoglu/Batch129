package day03scanner;

public class Runner {

    public static void main(String[] args) {

        //Object nasil olusturuluyor?
        // object olusturmak icin hangi classs i kullanacagini java ya soylemelisin
        // once class in ismini yazacaksin
        // sonra object e isism verceksin "Object ismi"
        // Java da her seye bir isim vermek gerekiyor
        // sonra atama operatoru koymalisin =
        // ondan sonra "new keyword" yazmalisin
        // new keyword, "object yaratmak" demek
        // obje olusturuken en son constructer olusturacaksin
        // class ismi ve parantez bize constructer un ismini verecek
        // bir onceki car class da olutrudugumuz hersey obje de  olacaktir. kalipta fiyat varsa obje de olmali.
        // kalipta hareket etme fonksiyonu varmaobjeden durma fonksiyonunu kullanabilirsiniz



        // class ismi        object ismi       atama oprertoru          "new" keyword         Constructer
               Car               myCar             =                      new                  Car();

        System.out.println(myCar.fiyat);

        System.out.println(myCar.model);

        myCar.hareket();

        // hareket icin sout yapmadik cunku car sinifnda onun yazili var


        Student tomHanks = new Student();
        System.out.println(tomHanks.name);
        System.out.println(tomHanks.grade);
        System.out.println(tomHanks.adres);



    }
}

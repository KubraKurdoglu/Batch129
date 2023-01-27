package day22staticblocksconstructors;

 /*
    Constructor nedir?
    Calss'tan obje uretmemeize yarayan code block'laridir.

    Class olusturdugumuzda java bize otomatik olarak bir constructer verir.
    (java sunu biliyor ben bir class olusturdu isem otomatik olarak bir constructer vermeliyim.
    ama bu constructer gozle gorulmez. bunlarin adi "Default Constructer" dir.

    "Default Constructer'lar su sekilde olur:==> "Car(){}"

    klas ismi+ () + {}

    // goruldugu gibi default constructer in fazla ozelligi yok

    ONEMLI: Kendimiz "constructor" olusturdugumuzda java, default constructor'u siler


     Asagidaki constructerlere access modifier yazilmadi, ama genellikle "public" yazilir.
     cunku heryerden ulasilsin istenir.

     --> bir class'ta farkli parametreler kullanarak istediginiz kadar "constructer" olusturabilirsiniz
     --> farkli construvterler sayesind ebir class'tan farkli farkli objeler olusturabiliriz


            ****INTETVIEW SORUSU**==> Method ile Constructer'in farki var midir?

       Cevap:   Method ile constructer farkli yapilardir
                Neden?
                1) Method'larda "return type" vardir ama "constructer" larda "return type" yoktur
                2) Method'larin ismi yaptiklari ise gore developer'lar tarafindan belirlenir.
                      Constructor'larin ismi ise her zaman Class ismi ile ayni olmalidir.



     */


public class Car {

    String make = "Honda";
    String model = "Accord";
    int year = 2023;

    boolean hybrid = true;


    Car(String make, String model){
        this.make = make;
        this.model = model;
        if(year==2023){
            this.year=0;
        }
        if(hybrid==true){
            this.hybrid=false;// yani mana olarak sunu dedik
            // ben bunlari kinci car da kaldirdim ama yine de yazdiriyor bunlari
            // silmek icin yukardaki if leri yazdi
            // hybrd'de if 'in icine true dedi, cunku true ise false gibi gor
            // alma yani demek istedi
        }

    }

    //CONSTUCTER I OTOMATIK YAZMA YOLU
    // Car class inda  "@Override" bunun ust tarafina gel ve sag tikla "generete" gir
    // orda constructer var, ordaki degerlerden otomatik  constructer olustrabilirsin



    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }

    Car (String make, String model, int year, boolean hybrid){
        this.make = make;// hey java sendeki modeli bunun ile(this=bunun ile) degistir
        this.model= model;
        this.year = year;
        this.hybrid = hybrid;


    }
    //arabanin yili, hybrd olmasi beni ilgilendirmiorsa yeni bir contructer olustruruz





    public static void main(String[] args) {



    }
}

package day27encapsulationabstraction;

public abstract class Courses {

    /*
    1) Bazen method body'sini yazmak gerekmez.bu durumlarda body'sizmethod olusturmak gerekir
       Bodys'i olmayan method'lara "abstract" methodalar denir.

    2) "Abstract" method'lar child class'lar tarafindan "override" edilmek zorundadirlar
        Bu yuzden, eger bir fonksiyonun child class'lar tarfinda kulanilmasini mecbur kilmak isterseniz
        o method'u "Abstract" yapmak zorundasiniz.

    3) Bir method'un bodys'ini silmek o method'un abstract olmasi icin yeterli degildir
       "access modifier" ile "return type" arasina "abstract" keyword'u koymak gerekir.

    4) Abstract Lethod'lar siradan class'larin(concrete==somut class)  icine yazilmazlar, "abstract method'larin" icine yazildigi class'larda
       abstract olmak zorundadir.

    5) abstract Class'larda hem abstract method'lar, hemde "concrete" method'lar kullanilabilir.

    6) Concrete Class'lar, abstract class'larin child'i olabilirler.
       "Abstract method'larin" override edilme zorunlulugu "concrete class'lar"  icindir.


     */

    public abstract void math();

    public void art(){
        System.out.println("Painting");
    }
    //Final method'lar "abstract" edilemezler, halbuki "abstract" ethod'lar override edilmek icin
    //olusturulurlar, bu yuzden java abstract method'larin final olmasina musade etmez
   // public final abstract void science();


    //Concrete Class'lar final oldugunda, Child Class'a sahip olmazlar
    // Ama "abstract Class'lar" icin Child Class olmalidir
    // cunku Child Class' lar abstract parent class'taki abstract methodlari kullanirlar
    // bu yuzden java abstract class'larin final olmasina musade etmez ,hata verir.


    //Abstract Method'lar "private" olamazlar cunku Child Class'lar abstract methodlari kullanirlar
    // private yapinca kullanima kapali olur, bu celiskidir, bu yuzden java abstract method'larin
    //"private" olmasina musade etmez.

    //Abstract Method'lar "static" olamazlar, cunku "static method'lar" override edilemezler
    //halbuki abstract methodlar override edilmek icin olusturulmustur.

}

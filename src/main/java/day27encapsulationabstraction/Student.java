package day27encapsulationabstraction;

public class Student {
    //Encapsulation is a data hiding
    // encapsulation==> data yi saklamaktir.
    //"private" yaparak, encapsulation yapmis oluruz.




    private String stId = "AC123";
    private double gpa = 3.99;
    private boolean poor = true;


//Encapsulation yapilmis datayi okuyabilirmiyiz?
//get method'lar(getter methodlar) encapsule edilmis(saklanmis) datayi okumamiza yarar.
//get method'lar(getter) her zaman "public" olurlar.
//cunku zaten get method saklanmis datayi gormek icin kullaniliyor, neden "private" yapsin ki
//protected da pek yapilmazlar dedi hoca
// get method'larin(getter) return type ' i variable'nin data type'i ile ayni olur
// get method'larin (getter) isimleri "get  + variable name" seklinde olur
// get method'larin (getter) isimleri variable boolean ise
// "is + variable name" seklinde olur
// get method'lar(getter) parametre kullanmazlar



    public String getStId() {//getter() methodu saklanmis datayi okumaya yarar
        return stId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isPoor() {
        return poor;
    }

    //Encapsulation yapilmis data'lari degeri degistirilebilir mi?
    // set method'lar (setter) encapsule edilmis data'larin degerlerini degistirmemize yara.
    //set method'lar(setter) herzaman "public" olurlar.
    //set method'larin(setter) return type'i her zaman "void" olur
    // set method'larin(setter) isimleri "set + variable name" seklinde olur.
    //set method'lar (setter)


    //getter ve setter'larin ikisine birden "java beans" denir.
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }

    public void setStId(String stId) {
        this.stId = stId;
    }
}

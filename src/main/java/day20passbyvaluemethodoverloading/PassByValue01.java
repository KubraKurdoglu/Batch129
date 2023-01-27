package day20passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {


        /*

        //1) Java "PassByValue" sayesinde variablelerin degerini "koruma" altina alinir.

         */

        double shirt = 100;

        double studentShirtPrice =  discount("student", shirt);
        double veteranShirtPrice = discount("veteran", shirt);
        double seniorShirtPrice = discount("senior", shirt);

        System.out.println(shirt);
        System.out.println(studentShirtPrice);
        System.out.println(veteranShirtPrice);
        System.out.println(seniorShirtPrice);
        System.out.println(shirt);


        // gazilerin fiyatini orjinal fiyat yap derse:
        // asagidaki gibi yapmalisin
        //shirt = discount("veteran", shirt);
        // boyle yaparsan artik fiyat, gazilerin fiyatina esit oluyor
        // java'nin kendi kurallari var, bazen bunlari kirabilir dev.ler
        // fakat bu noktada java derki, "kirmizi isikta gecme dedim sana
        // sen gectin, kazayi goze aldin"


    }

    public static double discount(String state, double price){


        switch (state){
            case "student":
                price=price*0.90;
                break;
            case  "veteran":
                price = price *0.80;
                break;
            case  "senior":
                price = price*0.95;
                break;
            default:
                price=price;


                // 4. bir kesimm var yukardaki ucten farkli olaral
                // onlarda "indirimsiz" olanlar
                // onlar icin default yazildi ve price ayni kaldi
        }
        return price;// burda hata verdi cunku, method kisminda ilk "int" yazmistik
        // public int discount(String state, double price{ ==> boyleydi
        // hatanin ustune tikladik, sonra "more actions" un ustune geldik
        ///orda "int" i double yap secenegi vardi, onu tikladik ve duzeldi.


    }
}

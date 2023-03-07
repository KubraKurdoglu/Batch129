package day30exceptionsinterface;

public class Exceptions01 {

    //Exception Classs'larin sadinin son kelimesi hep Exception olmalidir
    // her zaman boyle isimlendirilirler

    /*
  1)Exception olsa da olmasa da calistirmamiz gereken code'lari "finally block" icine yazariz.
  2)DB ile baglantiyi kesme isini yapan code'lar gibi code'lar her halukarda calistirilmalidir, bu tarz code'lari
  "finally block" icine koyariz.


    1)Exception olsa da, olmasa da calistirmamiz gereken kod'lari "finally block" icine yazariz.
2)DB ile baglantiyi kesme isini yapan kod'lar gibi kod'lar her halukarda calistirilmalidir, bu tarz
  ko'lari finally block icine koyariz.
3)"try block" yalniz kullanilamaz
  "try block" + 1 "catch block" mumkundur
  "try block" + 1 "catch block" + 1 "finally block" mumkundur
  "try block" + coklu "catch block" mumkundur
  "try block" + coklu "catch block" + 1 finally block mumkundur
  "try block" + 1 "finally block" mumkundur
4)Coklu "finally block" kullanilamaz

     */

    public static void main(String[] args) {

        int a = 12;
        int b = 4;
        int[] c = {3, 6, 9, 12};


        m(c, a, b);
    }


    public static void m(int[] c, int a, int b) {

        try {
            int idx = a / b;
            int element = c[idx];

            System.out.println(element);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Cut the connection with the DB(database ile baglantiyi kes)");
        }// bir kodun herhalukarda calismasini istiyorsan onu "finally block"a koymalisin
    }
}

//try'dan sonra catch yazmaliyiz, bu su demek "burcu hanim cocugunu odevini yapmayi "dene"
//yapamazsan ben yardim ederim, ogretmene sorariz gibi secenekler var.
// ama sonunda odevi yapsa da yapmasa da "defteri kapatacak"
// try'dan sonra hic catch kullanmadan, direk "fially" kullanilabilir
// try+ catch      ---
//try+catch+catch    ----
//try+catch+finally     ----- bunlarin hepsi mumkundur
//try+finally       -----
//coklu finally kullanilmaz
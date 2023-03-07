package day10switchloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

    /*
      Ask user to enter country name among
      "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
      Type code to print abbreviation of the countries.
      "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"
    (Kullanicidan bir ulke ismi aliniz.Alinan ulke adina gore kisaltmalari yazdiriniz)


     */

        Scanner input = new Scanner(System.in);
        System.out.println("ulke adini giriniz");
        String countryName=input.nextLine();



        //  String countryName=input.nextLine().toLowerCase(); ISTERSEK tolowercase yi burda
        // da kullanabilirsin ama hoca switch kodunun icinde kullanlayi tavsiye etti
        // cunku swicht de buyuk kucuk onemli ama yukardaki derlerleri baska yerlerde de kullanabiliriz
        // o nedenle switch in icinde kullanmak daha onemli

        switch (countryName.toLowerCase()){
            case "amerika":
                System.out.println("US");
            break;
            case "england":
                System.out.println("UK");
            break;
            case "germany":
                System.out.println("DE");
             break;
            case "turkey":
                System.out.println("TR");
             break;
            case "india":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "alabania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("bu ulke tanimli degildir..");



        }



    }
}

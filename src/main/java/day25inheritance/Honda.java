package day25inheritance;

//Honda classin a geldik, Car'i onun parents 'i yaptik

public class Honda extends Car {

    public int price = 10000;

    public void engine(){
        System.out.println("Honda engine...");
    }


    public Honda(){

        System.out.println("Honda1");
    }

    public Honda(String model, int year){
        super("Audi");

        System.out.println("Honda 2: "+model+"-" +year);

    }
}

//Constructor oldugunu nasil anlarsin?
//Ismi class ismi ile ayni olmali
//return type'i olmamali
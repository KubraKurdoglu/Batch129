package day30exceptionsinterface;

public class HondaRunner {

    public static void main(String[] args) {


        Civic myCivic = new Civic();
        myCivic.cool();

        System.out.println(Ac.price);
        System.out.println(Engine.price);
        System.out.println(Security.price);
        System.out.println(Ac.model);

       // Ac.price = 7000;//bunu yapamazsin, cunku final variable'ye deger atayamazsin

        Accord myAccord = new Accord();
        myAccord.cool();

    }
}
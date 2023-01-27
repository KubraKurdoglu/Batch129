package day22staticblocksconstructors;

public class CarRunner {
    public static void main(String[] args) {

        Car c1 = new Car("BMV", "M4", 2023, false);
        Car c2 = new Car("Audi", "AR8", 2022, true);
        Car c3 = new Car("Honda", "Civic", 1999, false);


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        //olustrudugumuz objeleri konsolda yazdirabilmek icin "toString" methhoduna ihtiyacimiz var
        // toString olmadan objeler konsolda yazdirilamazlar
        // bunun icin objek-leri olusturudugun class ' a gitmelisin

        // orda sag tiklmali
        //generete'ye gitmelisin
        // orda "toString" goreceksin
        // tum objeleler orda olmali
        // "ok" de ssonra yazdir


        Car c4 = new Car("Mercedes", "C300");

    }
}

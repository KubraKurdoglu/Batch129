package day20passbyvaluemethodoverloading;

public class PassByValue_Tekrar {
    public static void main(String[] args) {

        String name = "Ajda Pekkkan";


       String updateName =  updateName("Ajda Pekkan", "Sayin");


        System.out.println(name);
        System.out.println(updateName);

        name = updateName(name, "Sayin");
        System.out.println(name);

        //2. METHOD4UN KULLANIMI

        String isim = "Kubra Simsek";

        String yeniIsim=ismeEkEkleme(isim, "Jr");

        System.out.println(isim);
        System.out.println(yeniIsim);





    }



    public static String updateName(String name, String add){

        name = name + " " + add;

        return name;
    }


    public static String ismeEkEkleme(String isim, String ek){

        isim =isim +" " + ek;

        return isim;
    }
}

package day20passbyvaluemethodoverloading;

public class PassByValue02 {
    public static void main(String[] args) {

        //java daima passByValue kullanir, cunku orjinal degeri korumak ister
        // PassByReference kullanmaz cunku bu orjinal degeri adres araciligi ile degistirir
        // PassByValue'de java otomatik olarak bir kopya yapar ve onun uzerinden degisiklikleri yapar.
        //

        String name = "Tom Hanks";

        String updatedname = updateName(name, "Jr");//upDate methodu burda kopyayai degsitirdi
        // o nednele altta konsolda gormedik

        System.out.println(name);//Tom Hanks==> sonuna "Jr" yazdirmadi, cunku java
        // Pass By Value ile orjinal degeri korudu
        // degismis ahlini gormek istersen sunu kullanmalisin==>
        //
        System.out.println(updatedname);

        name = updateName(name, "Jr");// java kendi basina orjinal degeri korur
        // ama sen israrla orjinali de degistirmek istersen, orjinal deger olan "name" e degistirdigin degeri atarsin
        System.out.println(name);// bunu yazdirdiginda artik orjinal deger degisti ve "Tom Hanks Jr" oldu.


    }


    public static String updateName(String name, String add){

        name = name + " " + add;

        return name;

    }
}

package day02datatypesmethodcreation;

public class Variables01 {

    // primitive data types
    // char boolean byte short long int float double
    // java decimal number si yani ondalik sayilari direk olarak double kabul eder
    // float olmasinda israr ederseniz kodun sonuna "F" ve "f" koymalisiniz

    public static void main(String[] args) {

        // ornek gomlek ve ayakkabi fiyatlari icin iki tane fiyat olusturun.

         float prixDeChemise = 25.44f ;

         float prixDeChassure = 45.54F;

         System.out.println(prixDeChassure + prixDeChemise);
        System.out.println(prixDeChassure);

        double weightCell = 0.00000000000112;
        double weightAmip = 0.00000000000045;

        System.out.println(weightCell-weightAmip);

    }
}

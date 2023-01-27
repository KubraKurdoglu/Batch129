package variablesnighttime02;

public class C02_MethodCreation {

    public static void main(String[] args) {

        // dikdortgenin alanini hesaplayankodu yaziniz ve kullaniniz

        System.out.println("Dikdortgenin Alani.." + dikdortgenAlani(10, 5));

        System.out.println("Dikdortgenin Cevresi.." +dikdortgeninCevresi(45, 2));

        kareninAlani(25);


        // method lari main methodn suslu parantezinin disinda olusturmalisin
        //asagida main methodun disinda olusturduk sonra onu main methodun icinde cagirdik
        // main methodun icinde olustirdigumuz bu alanin icinde
        //dikdortgenAlani(10, 5); burda parantez ile noktali virgul arasina . koyup sout diyoruz
        // sout u otomatik cagirdik



        // dikdortgenin alanini hesaplayankodu yaziniz ve kullaniniz


    }//main in curely si

    // method u main in parantezinin altinda olusturdu

    public static int dikdortgenAlani(int a, int b) {

        return a * b; // carpmanin sonucunu kullaniciya verdim return diyerek yaptim bunu


    }//method body





    public static int dikdortgeninCevresi(int a2, int b2){

        return (a2+b2)*2;


    }

    // karenin alanini hesaplatan kodu yaziniz

    public static void kareninAlani(int a3){

        System.out.println("karenin alani..."+ (a3*a3));

        //burda hic uyari vermedi, return istemedi cunku void
        //cok onemli return istemiyor void
        //sout u da methodun icinde yazabiliyorum
        // cunku bu void in ozelligi bu
        //oludturdugumuz tum methodlari main method dan cagirmaliyiz
        // void de sout u onun method body sinin altina yazabiliyorsun





    }


}//class

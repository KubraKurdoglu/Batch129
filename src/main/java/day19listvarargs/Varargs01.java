package day19listvarargs;

public class Varargs01 {
    public static void main(String[] args) {

        //Varargs==> variable arguments
        //varargs==> sifir elemanla da calisir, 100 elemanla da calisir
        // istedigin kadar elemanla calisir
        //"..." uc nokta varargs'in sembolu(int... a)
        //genel kabul gorus "uc noktanin" data type'sinden hemen sonra konulmasidir
        // NOTE: bir methodda birden fazla varargs parametre kullanilamaz
        // cunku ikincisi "Unreachable Code" olur
        // yani varargs "dipsiz kuyu" oldugu icin, ikinci bir varargs koyamiyorsun


        //varrangs==> arkada Array kullaniyor
        // varrangs==>non-primitive'dir



        //public static void add(int... a)==> buraya iki tane eleman koyamiyoruz
        // yani bir tane daha "int...b" koyamiyorsun
        // cunku varargs'lar dipsiz kuyu gibidir. dolduramiyorsunki ikinci bir deger
        // ekleyebilesin

        /*
         Varargs'lar method olustururken "parametre" sayisinda bize esneklik saglar
         Method'un parantezleri icine yazilanlara "parametre" denir
         Method'u cagirirken kullanilan sayilara da "argument" denir.

         Note: varrangs, varrangs disindaki parametrelerle de kullanilabilir
         ama varangs her zaman "son parametre" olmalidir
         //public static void add(String s, int... a) gibi

        */


        addTwonumbers(3,5);
        addThreeNumbers(2,4,5);
        add(1,2,3,4);

        //iki sayiyi , uc sayiyi toplayan yontem olustrdun fakat
        // senden bin sayi da isteyebilirler
        // iste burda istedigimiz kadar sayiyi toplayabilecegimiz bir method
        // yapabiliriz




    }

    // iki sayiyi toplayan method olusturunuz

    public static void addTwonumbers(int a, int b){
        System.out.println(a+b);

    }





    //uc sayiyi olusturan method olusturunuz

    public static  void addThreeNumbers(int a, int b, int c){
        System.out.println(a+b+c);
    }



    //istediginiz sayida sayiyi toplmak icin bir method olusturunuz


    public static void add( int... a){

        int sum = 0;

        for(int w : a){
            sum += sum+ w;

        }
        System.out.println(sum);
    }



}

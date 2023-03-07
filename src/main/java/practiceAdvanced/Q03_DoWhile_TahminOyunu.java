package practiceAdvanced;

import java.util.Scanner;

public class Q03_DoWhile_TahminOyunu {
    public static void main(String[] args) {


        //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
        //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!! ? tahminde sayiyi buldunuz. Puaniniz: ?


        //Math.random()==> bize rastgele bir sayi verecek
        // bunu 100 ile caparsak bize sayiyi verecek
        // 100 ile carpilmis hali lazim bize
        // 100 ile carpimi bize hocbir zaman 1 vermeyecegi icin en fazla istedigi sainin daima
        // 1 fazlasini almak lazim
        // o nedenle 101 aldik
        // 1 rakamini da alabilmek icin yaptik bunu


        Scanner input = new Scanner(System.in);
        int rastgeleSayi = (int) (Math.random() * 101);// bura 101 yaptik, 1'i de alabilmek icin
        System.out.println("0-100" + "(arasi (dahil) bir tamsayi giriniz");

        int sayi;
        int sayac = 10;

        do {
            sayac--;
            sayi = input.nextInt();

            if (sayi < rastgeleSayi) {


                System.out.println(sayac + "hakkiniz kaldi");
                System.out.println("daha buyuk bir sayi giriniz");

            } else if (sayi > rastgeleSayi) {

                System.out.println(sayac + "hakkiniz kaldi");
                System.out.println("lutfen daha kucuk bir sayi giriniz");

            } else {

                System.out.println(sayac + "hakkiniz kaldi");
                System.out.println("tebrikler!! " + (10 - sayac) + "  tahminde sayiyi buldunuz. Puaniniz: " + ((sayac + 1) * 10));
            }
            if (sayac == 0) {
                System.out.println("hakkiniz bitti");
                //ODEV: YENIDEN OYNAMA HAKKI VER
                break;
            }

        }while (sayi!=rastgeleSayi);












    }
}

package practice02;

public class KitaptakiSorular239 {
    public static void main(String[] args) {

        //soru1

        double et = 23.44;
        double sut = 12.23;
        double pirinc=14.45;

        System.out.println("Toplam Fiyat= " +(et+sut+pirinc));

        //soru 2:


        float rize =200000f;
        long artvin = 34563211;
        int samsun= 234512;

        System.out.println("Carpim Sonucu= "+(rize*artvin*samsun));

        //3.SORU

        //Basit faizi bulmak icin kod yaziniz
        // not: basit faiz formulu=anapara*oran*yildegeri/100

        int  anapara = 50000;
        int oran = 10;
        int yil =10;
        int basitfaiz =  anapara*oran*yil/100;

        System.out.println("BasitFaiz Orani= "+basitfaiz);

        //4.soru:
        //degerleri farkli iki boolean data tipi olusturunuz ve bu degerleri iki ardisik deger
        // arasinda bosluk birakacak sekilde ayni satirda yazdiriniz

        boolean a=true;
        boolean b= false;

        System.out.println(a+ ""+ b);

        //5.SORU

        float kitap= 13.46F;
        float defter=45.56F;
        float laptop=789.67F;
        float toplamFiyat =2*kitap+4*defter+3*laptop;

        System.out.println("toplam fiyat= "+toplamFiyat);








    }
}

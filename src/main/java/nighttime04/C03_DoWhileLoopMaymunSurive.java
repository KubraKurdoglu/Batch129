package nighttime04;

public class C03_DoWhileLoopMaymunSurive {
    public static void main(String[] args) {


        /*

    INTETVIEW QUESTION
    Adada yalnız bir maymun var
    Her gün 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

    */

       /* int numberOfBanana = 165;
        int suvivalDay = 1;//yasdigi gun sayisini bir ile baslattik, dort muzu yedi bir
        // gundur hayatta, 0 gundur hayatta diyemeyiz. 4 muz yedi 1 gun Hayatta, 8 muz yedi 2 gun hayatta
        boolean monkeyAlive = true; // maymun hayatta mi?, false atasan da calisirdi fakat
        // genel olrak true diye kullaniliyor


        // 4   8   12   ....164==> geriye bir muz kaldi yasamasi icin yeterli degil
        // 1   2   3    ....41==> 42. gun oldu

        */


        int numberOfBananas = 165;
        int survivalDays = 1;
        boolean monkeyAlive = true;// memory de hafizada bir yer ayirmakk icin deger atadik


        do{
            System.out.println("***maymunlar yasamak icin gunde 4 kuz yer***");//bunu suslemek icin koyduk, gunleri
            // birbirinden ayirabilmek icin
            numberOfBananas-=4; // numberofbabanas= numberofbananas-4;
            System.out.println("kalan muz sayisi" + numberOfBananas);
            survivalDays++;

            if (numberOfBananas<4){
                monkeyAlive=false;
                System.out.println("bu "+survivalDays+ ".gun yeterli muz kalmadi maymun cennetlik oldu");
                System.out.println("Maymun"+survivalDays+".gun oldu");
            }else
                System.out.println("bugun"+survivalDays+".gun  ve maymun yasiyor");




        }while (monkeyAlive);








    }
}

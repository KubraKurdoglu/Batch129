package day13whileloopdowhileloop;

public class DoWhileDo01 {
    public static void main(String[] args) {
        //WHILE-LOOP DOWHILE-LOOP FARKI
        //1) while-loop
        // while loop da bir baslangic degeri olmasi lazim int i=1
        // sonra while yazip sarti yazmaliyiz


        int i=1;

        while (i<1){
            System.out.println("sen bir while loop'sun");
            i++;

        }

        // yukardaki while hic calismadi, ekrana da bir sey yazdirmadi
        // 1<1 false dir
        // buna "ZERO EXECUTION" denir
        //DIKKAT!!!!
        // 1.While body hic calismadi
        // 2. while-loop'ta "zero execution" mumkundur


        //DO-WHILE-LOOP

        int k=1;
        do {
            System.out.println("sen bir do-while-loop'sun");
            k++;
        }while (k<1);

      //1.do-while body yukarda ki durumda calisti
      // 2.do-while kullaniginizda body en az bir kere calisir
      // 3.do-while'da "zero execution" mumkun degildir



        //WHILE-LOOP ONCE DUSUNUR SONRA HAREKET EDER
        //DO-WHILE-LOOP ONCE HAREKET EDER SONRA DUSUNUR
        // "KUBRA'CIM SONUNU DUSUNEN KAHRAMAN OLAMAZ"
        // DO-WHILE-LOOP OYUNLARDA KULLANILIR


    }
}

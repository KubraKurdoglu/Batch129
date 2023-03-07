package day12forloopwhileloop;

public class ForLoop05 {
    public static void main(String[] args) {

        //interview de asagidaki gibi sorular cikabilir
        //muzip soru
        // burda hic sayi kullanmayacagiz

        //Example 1: hic sayi kullanmadan 1'den 100'e kadar olan sayilari konsola yazdiriniz
        // char lar matematiksel islemlerde kullanilirsa java ascii dgerleini alir
        // 'd'==> 100  ,  'd'/'d'=1

        for (int i='d'/'d' ; i<='d' ; i++){
            System.out.println(i+ " ");
        }

        // Note 1: bazi loop'lar hic calismayabilir


         for(int i=1 ; i<0 ; i--){
                System.out.println("Hi!");
            }

         // loop calismadan kirildi, cunku i==1 hemde i<0
        // boyle loop lara "ZERO EXECUTION" denir


        // NOTE: bazi loop lar sonsuz defa calisabilir
        // bu tarz loop lara "infinitive(sonsuz) loop" denir
        // "infinitive (sonsuz) loop " genellikle "increment/ decrement" kisminda yapilan hatadan
        // kaynaklannir





        //NOTE 3 : baska bir sonsuz (infinitive) loop

        for( int i=1;     ;       ){
            System.out.println("Hi!");
        }

        // i=1 ya artirmiyorum hep bir jkaliyor
        // loop u kiran buradaki sarttir
        // sart olmadigi icin loop kirildi
        // for( int i=1;     ;  i++     ){  // increment i yazip artirsan da yine de infinitive olur
        //loop olusturdugunuzda ikinci kismi yazmazsaniz yin einfinitive loop olur
        // icrement/ decerement de onemli
        // application da infinitive loop yaparsaniz application calismayabilir










    }
}

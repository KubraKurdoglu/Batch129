package day06stringmanupulationsifstatement;

public class StringManupulations01 {

    public static void main(String[] args) {

        //Example 1: Bir String in bas ve sonunda space karakteri varsa siliniz
        // kullanicinin "   Ali   Can   " diye bosluklarla girdigi ismi "Ali Can" yapacagiz

        String s= "   Ali Can  ";
        System.out.println(s);



        // burda basta iki space var sonda da iki space var
        // bu kullanici hatasi nasil tamir edilecek
        // bastaki ve sonraki spaace leri sileme lazim
        // bunun icin "trim" methodunu kullanmak lazim
        // trim methodu aradaki space lere dokunmaz

        String sTrimmed=s.trim();
        System.out.println(sTrimmed);
        // ikincinin adini sTrimmed koyduk cunku trim yapilmis "s"

        // Example 2: asagida fiyatlari verilen urunlerin toplam fiyatlarini bulunuz
        // String tv= "$456.99"; String laptop= "$875.99"; ===> 456.99+875.99=1332.98

        String tv1= "$456.99";
        String laptop1= "$875.99";


        String tv2= tv1.replace("$","");
        System.out.println(tv2);//456.99

        String laptop2 = laptop1.replace("$","");
        System.out.println(laptop2);//875.99

        // toplama yaparken $ israteini kullanamam
        // o nednele onu kaldirdik
        // $ bu isaretin yerine bosluk koyduk

        // bura tv ve laptop fiyatlarini toplamak istiyoruz
        // ama ikisi de string o nedenle once bunlari "valueof" methodu ile
        // double ye cevirmem lazim

        Double totalPrice = (Double.valueOf(tv2)+ Double.valueOf(laptop2));
        System.out.println(totalPrice);//1332.98

        //Example 3: verilen ismin ilk isminin ilk harfini ve soy iminin ilk harfini ekrana yzdiriniz ve tum harflerini
        // buyuk harf yapiniz ve tum bosluklari da kaldiriniz

        String name= "   ali cAN  ";

        char first= name.trim().toUpperCase().charAt(0);
        System.out.println(first);// A

        char second= name.trim().toUpperCase().split("")[1].charAt(0);
        System.out.println(second);//C
        // split methdundan sonra index koseli patrantez ile yazilir
        // burda "split" ile bosluktan parcala, bosluktan kes anliyoruz.
        // bosluktan kesince bosluk yok olur
        // burda da space den itibaren kesdigimiz icin bosluk yok oluyor
        // split("")[1].charAt(0); ben burda java ya diyorum ki burayi boldukten sinra
        // ben sifirinci degil birinci index ile ilgileniyorum
        // birinci index in sifirinci karakterini al

        System.out.println(""+ first+ second);// AC

        // bu yukardakini ikisini yanyana yazdirmak icin yaptik
        // yine burada ikisini yanyana yazdirmak icin sout ayptik ama
        // char lari toplarken baslarina "" koymazsak ascii degerlerini alir
        // o nedenle basina "" koyduk

        //Example 3: bir string in hic karakter icermedigini kontrol eden kodu yaziniz
        // "" ==> hiclik demektir
        // space bir karakterdir


        String str="";
        boolean result1=str.length()==0;
        // ==0 icinde hic karakter yok demek
        System.out.println("String Bos Mu?" + result1);// true


        //Example 4: bir string in  karakter icerip icermedigini kontrol eden kodu yaziniz

        String str2=" ";
        boolean result2=str2.length()==0;
        System.out.println("String Bos Mu?" + result1);// true


        //2.YOL
        // isEmpty Methodu

        boolean result3= str.isEmpty();
        System.out.println("String Bos Mu?" +result3);

        // Example 5: bir String in Spaace haric hib-c bir karakter icerle-medigini kontrol eden kodu yaziniz
        //(asagida sadece space var)
        // simdi var mi yok mu konrol edecegiz
        //JAVA bir konu da method uretmisse onu kullanmak daha iyidir
        // yukardaki soruda da isEmhty methodunu kullanmak daha mantikli
        // is lenght mehodunda hem bos mu bakiyor hem de esit mi diye bakiyor
        // sifir a esit bos demek cunku


        String t= "      ";
        boolean result4= t.replace(" ","").length()==0;
        System.out.println("Sadece space var mi?" +result4);// true

        // burda space karakterlerini sildik
        // sonra lenght ile =0 yaparak space den baska karakter olup
        // olmadigini olctuk
        // bu soru isEmthy ile de cozulebilir

        //2.YOL:

        boolean result5= t.replace(" ","").isEmpty();
        System.out.println(result5);

        //3.YOL:
        // isBlank() Methodu sadece space icerin stringler icin true veir
        // isBlank() space disinda bir karakter icerirse false verir
        // isBlank() Methodu bos String ler icin de true verir
        // isBlank() ==> space+ hicbirsey icin true    isEmpty ==> hicbirsey icin true

        boolean result6= t.isBlank();
        System.out.println(result6);// true


        //Example 7: bir string de a,e,i karakterlerinin ilk gorunumlerinin indexleri toplamini ekrana yaziniz
        // "java is easy" ==> indexleri 0123567891011
        // a=1 , i= 5, e=8   toplamalri 14



        String r="java is easy";

        int idxA= r.indexOf('a');
        System.out.println(idxA);

        int idxI= r.indexOf('i');
        System.out.println(idxI);

        int idxE= r.indexOf('e');
        System.out.println(idxE);

        System.out.println("index'ler toplami" + (idxE+idxA+idxI));

        // example 8: bir string de "java " kelimesinin ilk olarak kacinci indexte kullanildigini
        // gossterenn kodu yaziniz

        String u= "ah java vah java sensiz olmuyor java";

        int idxJava = u.indexOf("java");
        System.out.println(idxJava);

        // indexof() methodunda olmayan karakterler kullanilirsa sonuc her zamaan  "-1" dir

        int idxOfXyz= u.indexOf("xyz");
        System.out.println(idxOfXyz);// -1 cunku olmayan bir karakteri sordum




        //Example 9: bir string de a,e,i karakterlerinin son gorunumlerinin indexleri toplamini ekrana yaziniz
        //String v= "java is easy to learn"  ===> 18+5= 40
        // lastindexof() string olmayan bir katrkater icin kulanilirsa her zamana -1 verir

        String v= "java is easy to learn";
        int idxOfA=v.lastIndexOf('a');//18
        System.out.println(idxA);

        int idxOfI=v.lastIndexOf('i');
        System.out.println(idxOfI);//5

        int idxOfE= v.lastIndexOf('e');
        System.out.println(idxOfE);//

        System.out.println("index toplami"+ (idxE+idxOfA+idxOfI));

        // Example 10: bir String deki tekrarsiz karakterlerin ekrana yazdiriniz
        // abbccdc ===> burda tekrarsiz olanlar a ve d

        String y= "abbccdc";

        char ch1=y.charAt(0);
        if(y.indexOf(ch1)==y.lastIndexOf(ch1)){

            System.out.println(ch1);
        }

        char ch2=y.charAt(1);

        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);

            }

        char ch3=y.charAt(2);
        if(y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }

        char ch4=y.charAt(3);
        if (y.indexOf(ch4)==y.lastIndexOf(ch4)){
            System.out.println(ch4);

        }

        char ch5=y.charAt(4);
        if (y.indexOf(ch5)==y.lastIndexOf(ch5)){
            System.out.println(ch5);
        }

        char ch6=y.charAt(5);
        if (y.indexOf(ch6)==y.lastIndexOf(ch6)){
            System.out.println(ch6);
        }

        char ch7=y.charAt(6);
        if (y.indexOf(ch7)==y.lastIndexOf(ch7)){
            System.out.println(ch7);
        }





        // NOTE: bazi kodlarin bazi sartlara bagli olarak calismasi gerekir
        // bazi kodlari bazi sartlara gore aktive etmek icin "if statement" kullanmak gerekir
        // "if you study hard, you will learn java"





        // "if statement"
        //Example 11; sayi pozitif ise ekrana pozitif yazdirin

        int num=-12;
        int num2= 12;

        if(num2>0){

            System.out.println("pozitif");
        }


        if(num>0){
            System.out.println("pozitif");
        }
        // kodun calistirilmasi if in dogru olmasina bagli

        //Example 12; sayi -1 ile 10 arasinda ise  ise ekrana rakam yazdirin



        int number = 3;

        if(number>-1 && number <10){

            System.out.println("rakam");

        }

        // asagida hicbir sey yazdirmadi cunku sartlar uygun degil


        int number1 = 30;

        if(number1>-1 && number1 <10){

            System.out.println("rakam");

        }


        // Example 12: sayi uc baasamakli ise ekrana "Woow!" yazdirin
        //

        int x= 123;

        if(x>99 && x<1000){

            System.out.println("Woow!");
        }

        // yukarda bir hata var, cunku kodu eksik yazdik.
        // cunku kodu eksili de vermis olabilir
        // bu duurmda matematik klasina gideceksin ve mutlak degerini alacaksin
        // bunun icin Math.abs kullanmalisin

        int x1= -123;

        x1= Math.abs(x);



        if(x1>99 && x1<1000){

            System.out.println("Woow!");
        }


        // bu yukarda mutlak degeri alarak x in negatif olma durumunu ortadan kaldirdik


        













































    }
}

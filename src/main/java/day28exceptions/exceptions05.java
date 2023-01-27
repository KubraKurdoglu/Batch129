package day28exceptions;

public class exceptions05 {
    public static void main(String[] args) {

        int a = 16;
        int b = 2;// b'ye sifir degeri ver dene ve a'ya 16 ve b 'ye 2 degeri ver dene
        String s = "My Java";
        getCharFromString(s, a, b);


    }
    //try kisminda birden fazla Exception olusturma ihtimali olan kod varsa,coklu "cath" kullanabilirsiniz.

    //Coklu "cath" kullandiginizda Exception Class'lar arasinda "parent-child" iliskisi yoksa, catch'lerin sirasi

    //onemli degildir. Ama kod'daki siralamaya uymak tavsiye edilir.

    //Coklu "cath" kullandiginizda Exception Class'lar arasinda "parent-child" iliskisi varsa, catch'lerin sirasi

   //onemlidir, child olan class ustte olmalidir.

    //Exception Class'lar arasinda "parent - child" iliskisi varsa, ya child class'i uste yazarak child ve parent class'lar

    //icin ozellestirilmis code'lar yazarsiniz.(Hirsiz icin 155, hasta icin 112 gibi)

    //Veya child'i hic kullanmaz sadece parent ile exception'lari handle etmeye calisirsiniz.
     // (Hirsiz icin 911, hasta icin 911 gibi)

    public static void getCharFromString(String s, int a, int b){

        try{//try'in icinde problem olusmazsa catch'ler calismaz.

        int idx = a/b;// burda bolme var riskli bir operasyon, aritmetikexceptions ihtimali var

        char ch = s.charAt(idx);// burda da "StringIndexOutOfBounds" exceptions ihtimali var

        System.out.println(ch);

        }catch(ArithmeticException e){
            System.out.println("do not divide by zero");// b==0 olsaydi bu calisacakti
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("olmayan index kullandiniz");
        }

        //catch'leri yukardaki, yani try'in icindeki siralamaya gore yazdi
        // bu cok onemli degil ama siralmaya gore yazmak daha iyidir

    }

}

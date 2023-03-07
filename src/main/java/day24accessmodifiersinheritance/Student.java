package day24accessmodifiersinheritance;

public class Student {

    //name herkes tarafindan bilinebilir, o yuzden public yaptim
    public String name="Tom Hanks";

    //student Id okul yonetimindeki insanlar tarafindan bilinebilir, o yuzden "default" yaptim.
    String stdId="TH2023HU12001";

    //account number, ben ,esim ve cocuklarim tarafindan bilinebilir, o yuzden "protected" yaptim.
    int AccountNum=76512345;

    //hesabimdaki para miktari sadece benim tarafimdan bilinmelidir, bu yuzden "private" yaptim
    private int balance=123000;


    //strudent class'taki nesnelere ulasmak icin, "OBJE" olusturmalisin
    //bu "sutudent" class'la ayni package icinde olusan yani bir class olustrursan
    //o class'ta "private" olanlari ulasamazsin

    //Default olalara ayni package icinde oldugun muddetce ulasabilirsin
    //Default bir gruba ait demektir, grubu burda package temsil ediyor
    // bu package da yeni bir class acsan "stId" ye ulasabilirsin.

    //Protected==> bir grup ve punun cocuklari, package grup oluyor
    // bu nedenle accountNumber 'e ulasilir

    //name'e heryerden ulasilir cunku, o "public"

    // baska classs'ta ise objemiz "private" olani goremeyiz



}

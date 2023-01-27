package day24accessmodifiersinheritance;

public class StudentRunner {

    // myStd.stdId
    // default olan variable'lar ayni "Package" adindan ulasilabilir oldugundan bu class da gorulebilir
// myStd.accountNumber
// ayni package ile bir grup ve cocuklari tarafindan gorulebilir oldugu icin gorulur
// "balance" Private oldugundan baska class da gorulemez .Student classin icindeki balance variable a bu class dan ulasamayiz.

//Access Modifier'lari genisden dara dogru sayiniz
//         public > protected > default > private

    //Note: "protected" ile "default" un farkini soyleyiniz.
    //         protected olanlar baska package'lerden kullanilamaz ancak
    //         baska package'de "child class" icinden kullanilabilir
    //         default olanlar baska package'den kullanilamazlar


    //Access Modifier :Variable lara, class lara,  method lara ulasmayi duzenler
            //Default ==> (Package Private)

/*
1)Access modifier'lar genis'den dara; public > protected > default > private
2)Class'lar protected ve private olamazlar, sadece public ve default olabilirler
            3)Access Modifier'lar ne ise yarar?
    Variablelara methodlara classlara ulasmayi duzenler.
4)Kac tane access modifier var ?
    public > protected > default > private
    i) "public"ler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
    ii) "protected" ayni package'in icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
    iii) "default" sadece ayni packageden ulasilabilir. Bu yuzden "default"larin diger adi "package private"dir
    iv) "private"  sadece class icinden ulasilabilir, class disina cikildiginda ulasilamaz
            v) "protected" ile "default"un farki nedir ?
    Package disina ciktigimizda childlardan "protected"lara ulasabiliriz. "default"lara ulasamayiz.

 */

}

package day04asciiwrapperclassoperatorsmemoryusage;

public class Operators01 {

          /*
        1) +, -,* islemleri java sa matematikte kullanildigi gibi olur
        note1: int/int==> int olur
        note2: double+int==> double olur . cunku java da matematiksel islemlerde data
        typeleri kullanirsa sonuc buyuk data typenda olur

        2) java da "logical operatorler" vardir
        AND ve OR islemleri "logical operator"lerdir.

        i) AND islemini true olabilmesi icin hersey true olmalidir
           AND islemini " perfectionist" tir
           AND isleminde bir tane false sonnucu false yapar

        ii) OR isleminde () bir tane true sonucu true yapmaya yeter
            OR isleminde sonucun False olasi icin hersey false olamlidir
            OR islemini "polyanna" gibidir.

        iii)NOT operatoru (!) true olani false false olani true yapar
            !true== false
            !false == true
            !!true ==true

       3) Comparison karsilastirma opertaor





         */






    public static void main(String[] args) {


        boolean first = 3<5;
        boolean seconde = 2+3 != 5;
        boolean third = 2+3*5 >= 19;

        System.out.println(first+ "-" + seconde+ "-" + third);
        System.out.println(first && seconde);
        System.out.println(first );

    }




    }

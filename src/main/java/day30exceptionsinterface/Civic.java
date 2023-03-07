package day30exceptionsinterface;


/*
1)Bir interface'i bir Class'in parent'i yapmak icin "implements" keyword'unu kullaniriz
2)Jva parent'ler "Class" oldugunda "multiple parent" a musade etmez ama biz bazen "multive parentée ihtiyac duyariz
bu durumda bu ihtiyaci gidermek icin interface ismini verdigi yeni bir yapi olustrdu
bu yapi sayesinde bir class' icin coklu "interface parent" olusturabiliriz
3) Coklu Interface parent'larin her birinin icine ayni isimli method'lar koyabiliriz.
Mesela Ac'nin, Engine'nin ve Securty'nin  herbirinin icleirne run methodu koymak gibi.

Child Class herhangi birini "override" ettiginde hepsini "override" etmis gibi olur sonrada
body'i Child'da yazarak uygulamasini yapmis olur.
 */





public class Civic implements Ac, Engine, Security {
    @Override
    public void cool() {
        System.out.println("Civic cools perfectly");
    }

    @Override
    public void run() {

        System.out.println("Ac runs perfectly");
    }
}

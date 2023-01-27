package day26overriding;

public class Cat extends Mamal{

    public void meow(){
        System.out.println("Cats meow..");
    }


    @Override //==>Bunun adi "Annotation", "override annotation" da denir
    //hatalarimzi gosterir, koymak gerekir dedi hoca
    public void eat() {
        //super.eat();//parents a git "eat" i kullan demek istiyor ama hoca bunu sildirdi
        //sout la baska bir sey yazdirdi, uygulamayi degistirdi
        // iste bu degisiklige "overriding" denir

        System.out.println("Cats eats..");
    }

//Override yaptiktan sonra cats class i kendi objesini kullanir
    // tekrar parents e gitmez

    @Override
    public void drink() {
        System.out.println("Cats drink..");
    }

    @Override
    public Animal create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {//burda data type'sini degistiremezsin, cunku primitive data type'si
        return a+b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b;
    }
}

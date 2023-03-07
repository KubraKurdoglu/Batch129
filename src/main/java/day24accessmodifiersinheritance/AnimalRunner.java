package day24accessmodifiersinheritance;

import day23datetimestringbuilder.Snake;

public class AnimalRunner {
    public static void main(String[] args) {

        // cat, dog, bird icin "extend" yapti
        // sonra "animal runner "class olustrudu
        // sonra da bu calss'ta ibje olusturdu
        //normlade "cat" classi-'ina baktiginda sadece "meow" yapiyor sanirsin
        // fakkat objeye bakinca gorursun ki hem "eat" var, hem "drink" var
        // asagida "object" olusturdu


        Cat myCat = new Cat();

        myCat.eat();
        myCat.drink();
        myCat.meow();

        //Dikkat et yukarda, cat sinifinda olmayan seylere burda ulastik


        Snake yourSnake = new Snake();

        yourSnake.eat();
        yourSnake.tiss();



    }
}

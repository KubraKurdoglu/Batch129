package day24accessmodifiersinheritance;

public class Animal {


    /*

Inheritance'in faydalari;
1) Code standardında tekrar iyi değildir.
2) Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
3) Gelişime update'e açık olmalıdır
4) Code atomic yapıda olmalı.
Note 1:  "parent class"(super class)(ortak ozellikleri icerir)-"child class"(sub class)(Class'a ozel ozellikleri icerir)
Note 2: Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız
Note 3: "public" method'lar child class'lar tarafindan kullanilabilir
        " child class"lar tarafindan kullanilabilir demek "inherit" edilebilir demektir
        (inherit == miras demek)
Note 4: "protected" method'lar "inherit edilebilir.
        cunku "protected" olan method ve variable'lar child'lar tarfindan kullanilir
Note 5: "default" method'lar object ile ayni package'de olduklari surece "inherit" edilebilirler.
            Ama default method ile object'in uretildigi class farkli package'lerde ise "inherit" edilemezler.
Note 6: "private methodlar" "inherit edilemezler".
Note 7: Java "birden fazla parent"i(multiple inheritance Java tarafindan desteklenmez) onaylamaz.
Note 8: Child --> Parent --> Grand Parent --> Grand Grand Parent ... seklinde ilerleyen inheritance'lara "Multi Level Inheritance" denir.
Note 9: Java'da "Object Class" tum Java Class'larinin ortak parent'idir.
Note 10: Java'da Object Class haric tum class'larin parent'i vardir.
     */
    public void eat(){// "eat methodu" olusturduk
        System.out.println("Animals eat...");
    }

    void drink(){// "drink methodu" olusturduk
        System.out.println("Animals drink..");
    }


    //drink methodu default yaptik, bu nedenle baska package de olustugu icin snake, "drink" methoduna ulasamadi

}

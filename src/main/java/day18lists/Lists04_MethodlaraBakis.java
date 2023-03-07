package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists04_MethodlaraBakis {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();

        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Mahsun");
        names.add("Muslum");
        names.add("Orhan");

        List<String> females = new ArrayList<>();

        females.add("Ajda");
        females.add("Emel");


        //" names" list'inde "females" list'indeki TUM elemanlarin var olup olmadigini kontrol eder
        // her hangi biri yoksa size "false" verir
       boolean r= names.containsAll(females);// bu su demek names'in icinde ajda ve emel var mi?
        System.out.println(r);//false verdi cunku cunku yukardaki listede "emel" yok



        //sublist() methodu==> list'in icinden bir kismini alabilmek icin ise yariyor
        //sublist() ==> bize list verir
        // o nedenle yeniden list tanimlamalisin




        //subList'te ikinci index olan 4, dahil olmaz. yani 3. index'e kadar alir
        // ondan bir onceki index'i alir
        //mesela yukardaki ornekte 1,2,3. elemanlari aldik
        // elemanlari bize tek tek vermiyor, list olarak veriyor o nedenle adi "subList"


        //retainAll() methodu
        // burda spesifik olan elemanlari siliyor, iki list'te ayni olan elemanlar kaliyor
        // silerken de birinci degerdeki elemanlari sadece siliyor, diger listeyi birakiyor

        List<String> sublist = names.subList(1,4);

        System.out.println(sublist);//[Cuneyt, Mahsun, Muslum]

        names.retainAll(females);

        System.out.println(names);//[Ajda]
        System.out.println(females);//[Ajda, Emel]


        //Example 1: Elektronik aletler ve ev aletleri List'iniz var,
        // elektronik ve ev aletlerini List'leyiniz

        List<String> electronics = new ArrayList<>();

        electronics.add("TV");
        electronics.add("Radio");
        electronics.add("Refregirator");
        electronics.add("Mobile Phone");
        electronics.add("Notebook");

        List<String> homeGoods = new ArrayList<>();

        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("Char");
        homeGoods.add("TV");


       //homeGoods.retainAll(electronics) homeGoods ile electronics
       // list'lerinin ortak elemanlarini homeGoods listi icinde verir.
        //baska bir deyisle (in the other words) homeGoods List'indeki ortak olmayan elemanlari siler


        homeGoods.retainAll(electronics);

        System.out.println(homeGoods);//[Radio, TV]


        // names.isEmpty()==> bu method list'te hic eleman yoksa "true" verir
        // bir veya daha fazla eleman varsa size "false" verir
        //isEmpty()==> esasinda "names.size()==0" demektir
        // ikisi ayni isi yapiyor ama java da bir sey icin ozel method varsa onu kullan
        // cunku burda "names.size()==0" java yi iki kere yoruyor, hem esitligi olcuyor
        // hem size'i olcuyor

        //names.hashCode()==> bize stack memory'deki adresleri verir.
        // bu javab icindir, Jav    'nin kendisi icindir
        // java'nin belli sistemle urettigi "unique" datadir

        System.out.println(names.hashCode());

    }
}

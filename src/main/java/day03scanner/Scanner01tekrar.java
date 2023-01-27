package day03scanner;

public class Scanner01tekrar {

    public int count = 0;


    public void increment() {
        count++;


    }

    public static void main(String[] args) {

        Scanner01tekrar obj1 = new Scanner01tekrar();

        Scanner01tekrar obj2 = new Scanner01tekrar();

        obj1.increment();
        obj2.increment();

        System.out.println("obj1: count is=" + obj1.count);
        System.out.println("obj2: count is=" + obj2.count);


    }
}







package day03scanner;

public class Student {

    public String name = "Tom Hanks";
    public byte grade = 8;
    public String adres = "Miami";

    // yukardakiler pasif ozellik

    public void study(){
        System.out.println("Gunu gunune ders calisir...");
    }

        // yukardaki aktif ozellik
    public void feed(){
        System.out.println();
    }
}

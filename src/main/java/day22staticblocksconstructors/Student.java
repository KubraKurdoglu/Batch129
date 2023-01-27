package day22staticblocksconstructors;

public class Student {


    String name;
    int age;
    int grade;
    String stdId;

    String adress;


    public Student(String name, int age, int grade, String stdId, String adress) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.stdId = stdId;
        this.adress = adress;
    }

    public Student(String name, int age, String stdId) {
        this.name = name;
        this.age = age;
        this.stdId = stdId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", stdId='" + stdId + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    //@Override' deki yesil olan degiskenleri degistirebilirsin
    //genellikle "toString() ' i  en sona koyarlar ama nereye koysan calisir
}

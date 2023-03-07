package variablesnighttime03;

public class C03_IncrementDecrement {
    public static void main(String[] args) {

        int a = 12;
        int b = a++;//Post Increment
        System.out.println(b);
        System.out.println(a);
///////// son olarak b=12 a ise 13 olur. cunku java once b=a yi gorur degeri atar, sonra a yi 1 artirir \\\\\\\\\\\\\\\\\\\\


        int x = 15;
        int y = x--;//Post Decrement
        System.out.println(x);
        System.out.println(y);
///////// y=15  x=14 \\\\\\\\\\\\\\\\\\\\


        int m = 21;
        int n = ++m;//Pre Increment
        System.out.println(m);
        System.out.println(n);
///////// burda da java once artir isaretini gorecek  tabi ki m yi artiracak sonra artirdigi m degerini n ye atayacak\\\\\\\\\\\\\\\\\\\\


        int t = 32;
        int u = --t;// Pre Decrement
        System.out.println(t);
        System.out.println(u);
/////////burda da t yi azalt sonra buldugun t degerini u ya at \\\\\\\\\\\\\\\\\\\\

        int sayı = 10;
        sayı++;
        System.out.println(sayı);//11
        sayı++;
        System.out.println("pre-incrementten once " + sayı);//12
        System.out.println(" pre-increment satırında " + ++sayı);//13
        System.out.println("pre-incrementden  sonra" + sayı);//13

        System.out.println("post-increment satırında" + sayı++);//13
        System.out.println("post-incrementdan sonra " + sayı);//14
        System.out.println(9f / 2f);//4.5 float old icin sonuc boyle sonuna f koymuyor
        System.out.println(9 / 2);//4  cunku int da yuvarlama yapmiyor

///////// ****************************************** \\\\\\\\\\\\\\\\\\\\

        int num = 15;
        int num2 = num++;
        System.out.println(num2);// 15 cunku java ilk olarak num2=num1 gordu ve degeri direk atadi
        System.out.println(num);

        int sayı1 = 10;
        int sayı2 = 20;
        int sayı3 = 30;

        sayı2 = sayı1++; // sayi2 yi direk sayi1 e esitledi ve sonra sayi1 i bir artirdi
        System.out.println(sayı1 + "," + sayı2 + "," + sayı3);//11 10 30

        sayı3 = ++sayı1;
        System.out.println(sayı1 + "," + sayı2 + "," + sayı3);//12 10 12

        System.out.println(sayı3++);//12 goruruz yani direk sayiyi goruruz sonra artirir fakat o artirdigi burda gorunmez

        System.out.println(--sayı2);//9

        System.out.println(sayı3++);//13

        System.out.println(sayı3);//14


        //dikkat et java direk sayiyi goruyorsa o degeri aliyor; eger sonra onu artiracaksa da
        // bir sonraki sout da ancak gorebilirsin onu





    }//main
















    }


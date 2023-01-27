package calisma01;

public class YildizSorusu {
    public static void main(String[] args) {

//Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız. A
//   A
//   A A
//   A A A
//   A A A A


        int rows = 4;
        int i=1;
        while(i<=rows){
            String s =" ";
            for(int k=1; k<=i; k++){

                s = s +"A ";
            }
            System.out.println(s);
            i++;
        }





       //Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız. A
//   A
//   A A
//   A A A
//   A A A A


        for (int l = 4; l>0 ; l--){
            for(int j =l ; j>=1; j--){
                System.out.print("A ");
            }
            System.out.println();
        }







    }
}

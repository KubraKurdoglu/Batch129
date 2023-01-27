package day14arraysforeachloop;

public class ArraysTekrar01 {
    public static void main(String[] args) {



        //Example 1: String Arrays olusturun icine 5 tane eleman ekleyin,
        // ilk eleman ile son elemanin icerdigi karakter sayilarini ekrana yazdirin

        String arr[]=new  String[5];

        arr [0]= "Maths";
        arr [1]="Science";
        arr [2]="Biology";
        arr [3]= "Physique";
        arr [4]="Philosophie";

        System.out.println(arr[0].length()+arr[arr.length-1].length());

        System.out.println(arr[2].length()+arr[4].length());

        System.out.println(arr[2].length());

        //Example 1: String Arrays olusturun icine 5 tane eleman ekleyin,
        //tum elemanlarin  icerdigi karakter sayilarini ekrana yazdirin


        String brr[] = new String[4];

        brr [0] ="ankara";
        brr [1] ="istanbul";
        brr [2] = "izmir";
        brr [3] ="adapazari";

        int totalchar = 0;

        for (int i = 0;  i< brr.length; i++){
            totalchar=totalchar+ brr[i].length();

        }
        System.out.println(totalchar);


        //String bir arrays olusturun ve 3 deger atatyin
        // birinci ve son karakterinin degerleri  toplamlarni yaziniz

        String crr[] = new String[3];

        crr [0] = "nigde";
        crr [1] = "nevsehir";
        crr [2] = "nazilli";

        System.out.println(crr[1].length()+crr[crr.length-1].length());

        System.out.println(crr[0].length()+crr[2].length());

        System.out.println(crr[0].length()+ crr[crr.length-1].length());

        System.out.println(crr[crr.length-1]);//nazilli














    }
}

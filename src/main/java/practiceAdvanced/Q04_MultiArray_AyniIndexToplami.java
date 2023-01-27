package practiceAdvanced;

public class Q04_MultiArray_AyniIndexToplami {
    /*
      Aşağıdaki multi dimensional array'lerin iç array'lerinde aynı indexe sahip elamanların
      toplamını yazdıran bir program yazın.
      arr1[]={{1,2},{3,4,5}{6}}
      arr2[]={{7,8,9},{10,11},{12}}
     */

    public static void main(String[] args) {

        int [][] arr1={{1,2},{3,4,5},{6}};
        int [][] arr2={{7,8,9},{10,11},{12}};// ust array ile aly array in elemani ayni olmali
        // bu karsilasmayi yapabilmek icin
        int toplam;
        int limit;

        //sort() methidu kullanmadik cunku sira degissin istemiyor

        // asagida iki tane index almamiz fgerekiyor
        // cunku aa1 deki 0,1 ile aar2 deki 0,1 'in alinmasi gerekiyor

        for(int i=0; i<arr1.length; i++){

            limit = arr1[i].length;

            if(limit> arr2[i].length){
                limit=arr2[i].length;

            }

            for(int j =0; j<limit; j++){

                toplam = arr1[i][j] +arr2[i][j];
                System.out.println("arr1[" + i + "][" + j + "] + arr2[" + i + "][" + j + "]= " + toplam);


            }
        }



    }







}

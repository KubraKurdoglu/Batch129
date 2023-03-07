package day28exceptions;

public class Exceptions04 {
    public static void main(String[] args) {

        String arr [] = {"A", "G", "M", "L"};
        getElementFromArray(arr, 1);
        getElementFromArray(arr,5);
        System.out.println("HI");



    }

    //Array'lerde olmayan bir index kullanildiginda Java ArrayIndexOfBoundsException atar.
    public static void getElementFromArray(String[] s, int idx){

        try {


            String el = s[idx];//array'in ismi ve index bize elemani verecek
            System.out.println(el);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array in lenght'inin sinirlarini astin");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }

    }
}

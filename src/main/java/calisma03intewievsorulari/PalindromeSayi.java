package calisma03intewievsorulari;

public class PalindromeSayi {


        /*
        Crteate a program checks if a String is PALINDROME or not.
        If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
        For Example : "madam" or "nursesrun" .
        Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
        polindrome :tersten okunuşu da aynı olan ifadeierdir.
        ornek : Ey edip Adanada pide ye,  Traş niçin şart
         */


        public static void palindromeMethod(String str){

            String tersStr = "";

            for(int i =str.length()-1 ; i>=0 ; i--){
                tersStr += str.charAt(i);

            }
            System.out.println("tersStr =" + tersStr);
            if(tersStr.equalsIgnoreCase(str)){
                System.out.println(tersStr + " bu ifade polindromdur");
            }else System.out.println(tersStr + " bu ifde polindrome degildir");
        }












}

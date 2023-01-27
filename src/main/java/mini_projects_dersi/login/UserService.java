package mini_projects_dersi.login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    List<String> usernameList = new ArrayList<>();
    List<String> emailList = new ArrayList<>();
    List<String> passwordList = new ArrayList<>();

    public void showMenu() {
        System.out.println("==TECHPROEDUCATION===");
        System.out.println("1-Uye Ol");
        System.out.println("2-Giris Yap");
        System.out.println("3-Cikis");
        System.out.println("Secimizi giriniz:");
    }

    public void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ad-soyad giriniz");
        String name = scanner.nextLine();


        String username;
        boolean existUsername;
        do {
            System.out.println("Kullanici adini giriniz");
            username = scanner.nextLine();
            existUsername = usernameList.contains(username);
            if (existUsername) {
                System.out.println("Bu username daha once kullanilmistir. Yeniden deneyiniz");
            }
        } while (existUsername);


        String email;
        boolean existEmail;
        boolean isValid;

        do {
            System.out.println("Email giriniz");
            email = scanner.nextLine();
            isValid = validateEmail(email);

            existEmail = emailList.contains(email);
            if (existEmail) {
                System.out.println("Bu email daha once kullanilmistir. Yeniden deneyiniz");
                isValid = false;
            }

        } while (!isValid);


        String password;
        boolean isValidPsw;

        do {
            System.out.println("Sifre giriniz");
            password = scanner.nextLine();
            isValidPsw = validatePassword(password);

        } while (!isValidPsw);

        User user = new User(name, username, email, password);
        System.out.println(user);
        usernameList.add(username);
        emailList.add(email);
        passwordList.add(password);
        System.out.println("Tebrikler kayir islemi gerceklesti");
        System.out.println("Kullanici adi veya sifre ile giris yapabilirsiniz.");

    }

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Email yada kullanici adi giriniz");
        String usernameOrEmail = scanner.nextLine();

        boolean isEmail = emailList.contains(usernameOrEmail);
        boolean isUsername = usernameList.contains(usernameOrEmail);

        if (isEmail || isUsername) {

            while (true) {
                System.out.println("Sifre giriniz");
                String password = scanner.nextLine();
                int idx;

                if (isUsername) {
                    idx = usernameList.indexOf(usernameOrEmail);
                } else {
                    idx = emailList.indexOf(usernameOrEmail);
                }

                if (passwordList.get(idx).equals(password)) {
                    System.out.println("Sisteme Giris Yaptiniz!!!!");
                    break;
                } else {
                    System.out.println("Sifre yanlis. Tekrar deneyiniz.");
                }
            }
        } else {
            System.out.println("Sisteme kayitli kullanici bulunamadi.");
            System.out.println("Bilgilerinizi kontrol ediniz yada uye olunuz");
        }


    }


    public static boolean validateEmail(String email) {
        boolean isValid;

        boolean space = email.contains(" ");
        boolean isContainAt = email.contains("@");

        if (space) {
            System.out.println("Email bosluk icermemeli");
            isValid = false;
        } else if (!isContainAt) {
            System.out.println("Email @ icermelidir");
            isValid = false;
        } else {
            String firstPart = email.split("@")[0];
            String secondPart = email.split("@")[1];

            boolean checkFirst = firstPart.replaceAll("[A-Za-z0-9-._]", "").length() == 0;
            boolean checkSecond = secondPart.equals("gmail.com") ||
                    secondPart.equals("yahoo.com") ||
                    secondPart.equals("hotmail.com");

            if (!checkFirst) {
                System.out.println("Email büyük-küçük harf,rakam yada -._ karakterler disinda karakter iceremez");
            } else if (!checkSecond) {
                System.out.println("Email gmail.com,hotmail.com veya yahoo.com ile bitmeli.");
            }


            isValid = checkFirst && checkSecond;

        }
        return isValid;
    }

    public static boolean validatePassword(String password) {
        boolean isValid;

        boolean space = password.contains(" ");
        boolean lengthGt6 = password.length() >= 6;
        boolean existUpper = password.replaceAll("[^A-Z]", "").length() > 0;
        boolean existLower = password.replaceAll("[^a-z]", "").length() > 0;
        boolean existDigit = password.replaceAll("[\\D]", "").length() > 0;
        boolean existSymbol = password.replaceAll("[\\P{Punct}]", "").length() > 0;

        if (space) {
            System.out.println("Sifre bosluk iceremez");
        } else if (!lengthGt6) {
            System.out.println("Sifre en az 6 karakter icermelidir");
        } else if (!existUpper) {
            System.out.println("Sifre en az 1 buyuk harf icermelidir");
        } else if (!existLower) {
            System.out.println("Sifre en az 1 kucuk harf icermelidir");
        } else if (!existDigit) {
            System.out.println("Sifre en az 1 rakam icermelidir");
        } else if (!existSymbol) {
            System.out.println("Sifre en az 1 sembol icermelidir");
        }

        isValid = !space && lengthGt6 && existUpper && existLower && existDigit && existSymbol;

        return isValid;
    }
}









    //asagida benim yazdigim kisim var, yetismedi
    /*

    List<String> usernamaList = new ArrayList<>();
    List<String> emailList = new ArrayList<>();
    List<String> passwordList = new ArrayList<>();


    public void showMenu() {
        System.out.println("==TECHPROEDUCATION==");
        System.out.println("1-Uye Ol");
        System.out.println("2-Giris Yap");
        System.out.println("3-Cikis");
        System.out.println("Lutfen seciminizi giriniz..");
    }

    public void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ad ve soyadiniz giriniz...");


        String userName;
        boolean existusername;//username'nin daha once olup olmadigini kontrol ediyoruz

        do {
            System.out.println("Kullanici adiniz giriniz..");
            userName = scanner.nextLine();

            existusername = usernamaList.contains(userName);// burasi true dondugu muddetce soruyu soracak
            //cunku o usernama var demek bu

            if (existusername) {
                System.out.println("Bu username daha once kullanilmistir, yeniden deneyiniz lutfen.");
            }

        } while (existusername);


        String email;
        boolean existEmail;
        boolean isValid;

        do {
            System.out.println("Email giriniz");
            email = scanner.nextLine();
            isValid = validateEmail(email);

            existEmail = emailList.contains(email);//bu true ise asagidaki kod calisacak
            if (existEmail) {
                System.out.println("Bu email daha once kulanilmistir, yeniden deneyiniz");
                isValid = false;// bunu false yapti cunku valid olmadigi surece asgidaki koda yani while'a in diye
            }
            //burda normalde email'i dogrulayan bir kod yapmaliyiz ama method cok siser diye disarda yapacagiz onu

        } while (!isValid);//email uygun degilse dondur.


        String password;
        boolean isValidPsw;

        do {
            System.out.println("sifre giriniz");
            password = scanner.nextLine();
            isValidPsw = validatePassword(password);


        }while (!isValidPsw);




    }

    public void login(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Email yada kullanici adi giriniz");
        String usernameOrEmail = scanner.nextLine();

        boolean isEmail  = emailList.contains(usernameOrEmail);
        boolean isUsername = usernamaList.contains(usernameOrEmail);



    }



    public static boolean validateEmail(String email) {
        boolean isValid;

        boolean space = email.contains(" ");
        boolean isContainAt = email.contains("@");

        if (space) {//space varsa "false"
            System.out.println("email bosluk icermemeli");
            isValid = false;

        } else if (!isContainAt) {
            System.out.println("email @ isareti icermelidir");
            isValid = false;// icermiyorsa sonuc false, yani uygun degil

        } else {


            String firstPart = email.split("@")[0]; // ali@gamail.com ==> gini bir adresin ilk yani "ali" kismini boyle aldi.
            String secondPart = email.split("@")[1];


            boolean checkFirst = firstPart.replaceAll("[A-Za-z0-9-._]", "").length() == 0;
            boolean checkSecond = secondPart.equals("gmail.com") ||
                    secondPart.equals("yahoo.com") ||
                    secondPart.equals("hotmail.com");
            if(!checkFirst){
                System.out.println("email büyük-küçük harf,rakam yada -._ karakterler disinda karakter iceremez");

            } else if (!checkSecond) {

                System.out.println("gmail.com,hotmail.com veya yahoo.com ile bitmeli.");
            }

            isValid = checkFirst && checkSecond;
        }
        return isValid;
    }


    public static boolean validatePassword(String password){

        boolean isValid;

        boolean space = password.contains(" ");
        boolean lenghtGt6 = password.length()>=6;
        boolean existUpper = password.replaceAll("[^A-Z]","").length()>0;
        boolean existLower = password.replaceAll("[^a-z]","").length()>0;
        boolean existDigit = password.replaceAll("[^0-9]","").length()>0;
        boolean existSymbol = password.replaceAll("[^\\P{Punct}]","").length()>0;//noktalama isaretleri icin yapti
        //noktalama isaretlerinin disindakiler buyuk "P"
        //"p" kucuk olan ise noktalama isaretleri olanlar

        if (space){//eger space varsa
            System.out.println("Sifre bosluk iceremez");

        } else if (!lenghtGt6) {//bu false ise, yani yanlissa 6'dan buyuk degilse
            System.out.println("sifre en az 6 karakter icermelidir");

        } else if (!existUpper) {
            System.out.println("sifre en az bir buyik harf icermelidir");

        } else if (!existLower) {// kucuk harf icermiyorsa
            System.out.println("sifre en az bir kucuk harf icermelidir");

        } else if (!existDigit) {
            System.out.println("sifre en az bir rakam icermelidir");

        } else if (!existSymbol) {
            System.out.println("sifre en az bir symbol icermelidir");

        }

        isValid = !space && lenghtGt6 && existUpper && existLower && existDigit && existSymbol;


        return  isValid;
    }


}


     */
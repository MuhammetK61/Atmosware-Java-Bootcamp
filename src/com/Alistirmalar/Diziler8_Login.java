package com.Alistirmalar;
import java.util.Scanner;

//Kullanıcıdan alınan bilgilere göre doğru kullanıcı adı ve şifre girerse sisteme giriş sağlar
//yoksa deneme hakkı 4'ten başlayarak azalacak
//Not: kullanıcıdan alınan username ve password String[] dizi metodu olacak
//default: kullanıcı adi: admin
//default: sifre: root

public class Diziler8_Login {

    //class Değişkenlerimiz
    private static int COUNTER=4;
    private static final String DEFAULT_USERNAME="admin";
    private static final String DEFAULT_PASSWORD="root";

    //username, password dizi
    private static String[] userLogin(){
        Scanner klavye =new Scanner(System.in);
        String userName,userPassword;

        System.out.println("Lutfen usernama giriniz.");
        userName= klavye.nextLine();

        System.out.println("Lutfen userPassword giriniz");
        userPassword= klavye.nextLine();

        String[] arr = {userName, userPassword};
        return arr;
    }
    //adminPage
    private static void adminMethod(){
        System.out.println("Admin Page Hosgeldiniz...:)");
        System.exit(0);
    }


    //Validaion Method
    public static void userValidation(String[] arr){
        String[] userInfo = arr;
            if(COUNTER>=0){
                if (userInfo[0].equals(DEFAULT_USERNAME) && userInfo[1].equals(DEFAULT_PASSWORD)){
                    System.out.println("Admin sayfasina giriyorsunuz...");
                    adminMethod();
                }else {
                    COUNTER --;
                    System.out.println("Sifre Yanlis. Kalan hakkiniz: " + COUNTER);
                    if(COUNTER==0){
                        System.out.println("Hakkiniz doldu. Sistem bloke oldu.");
                        System.exit(0);
                }
            }
        }
    }

    //main Method
    public static void main(String[] args) {
        String[] dizi =userLogin();
        userValidation(dizi);
    }
}

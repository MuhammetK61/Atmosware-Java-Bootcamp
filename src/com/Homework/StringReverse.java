package com.Homework;

import java.util.Scanner;
// Kullanıcıdan aldığı kelimeyi tersten yazdıran algoritma
//kelime kaç harfli
public class StringReverse {

    //Kullanıcıdan alınan data
    public static String scannerValueData(){
        Scanner klavye =new Scanner(System.in);
        System.out.println("\n Bir kelime giriniz:");
        String value = klavye.nextLine();
        return value;
    }

    //girilen kelimeyi tersten yazdırma
    public static String stringReverse(){
        String temp=""; //nullPointerException
        try {
            String data=scannerValueData();
            for (int i=data.length()-1;i>=0;i--){
                temp+=data.charAt(i);
            }
            System.out.println(temp);
        }catch (Exception e){
            e.printStackTrace();
        }
        return temp;
    }

    //main method
    public static void main(String[] args){
        for(;;){
            StringReverse reverse = new StringReverse();
            reverse.stringReverse();
        }
    }
}



package com.Homework;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args){
        Scanner klavye =new Scanner(System.in);
        System.out.println("Bir kelime giriniz:");
        String str = klavye.next();

        System.out.println("Kelimenizin Ters hali:" +reverseStr(str));

    }

    public static String reverseStr(String str){
        String result = "";
        for (int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }
        return result;
    }
}



package com.Homework;

import java.util.Scanner;

public class IsLetterIsDigit {

    public static void isLetterIsDigit(char c){
        if(Character.isLetter(c)){
            System.out.println("Harf: "+c);
        }else if (Character.isDigit(c)){
            System.out.println("Sayi: "+c);
        }else {
            System.out.println("Ozel karakter: "+c);
        }
    }

    public static void main(String[] args){
        for (;;){
            Scanner scn = new Scanner(System.in);
            System.out.println("Lutfen bir deger giriniz.");
            String value = scn.next();
            isLetterIsDigit(value.charAt(0));
        }
    }
}

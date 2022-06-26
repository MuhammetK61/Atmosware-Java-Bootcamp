package com.Homework;

import java.util.Scanner;

public class Faktoriyel {

    //Scanner fonksiyonu ile kullanıcıdan sayı aldık
    public static int scannerFunction(){
        Scanner faktoriyel = new Scanner(System.in);
        System.out.println("Lufen bir sayi giriniz.");
        int number = faktoriyel.nextInt();
        return number;
    }

    //numberFaktoriyel fonksiyonu ile faktöriyel hesaplaması yaptık
    public static int numberFaktoriyel(){
        int number = Math.abs(scannerFunction());
        int result =1;
        for(int i= number;i>0;i--){
            result*=i;
        }
        System.out.println(result);
        return result;
    }


    //main fonksiyonu
    //ana fonksiyonumuz ile de faktöriyel hesabı yaptığımız foksiyonumuzu çağırdık
    public static void main(String[] args){
        for (;;){
            numberFaktoriyel();
        }

    }
}

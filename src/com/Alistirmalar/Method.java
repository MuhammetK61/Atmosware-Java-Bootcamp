package com.Alistirmalar;

import java.util.Scanner;

public class Method {

    //voidliParametresiz
    public static void voidliPArametresiz(){
        System.out.println("Voidli Parametresiz");
    }

    //voidliParametreli
    public static void voidliParametreli(int count){
        System.out.println("Voidli Parametreli: "+ count);
    }

    //voidsizParametresiz
    public static int voidsizParametresiz(){
        System.out.println("Voidsiz Parametresiz");
        int sayi1 = 4, sayi2=5, toplam=0;
        toplam=sayi1+sayi2;
        return toplam;
    }

    //voidsizParametreli
    public static int voidsizParametreli(int number1, int number2){
        System.out.println("Voidsiz Parametreli");
        int  toplam=0;
        toplam=number1+number2;
        return toplam;
    }

    public static void main(String[] args){
        Scanner klavye = new Scanner(System.in);

        //voidliPArametresiz();


        //System.out.println("Bir sayi giriniz:");
        //int number = klavye.nextInt();
        //voidliParametreli(number);

        //int result=voidsizParametresiz();
        //System.out.println(result);

        System.out.println("Bir sayi giriniz:");
        int number1 = klavye.nextInt();

        System.out.println("2.sayiyi giriniz:");
        int number2 = klavye.nextInt();

        int result=voidsizParametreli(number1,number2);
        System.out.println(result);
    }

}

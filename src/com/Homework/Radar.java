package com.Homework;

import java.util.Scanner;

//Kullanıcı tarafından girilen sayının:
//hız:80 yavaşlayın para cezası: 800tl
//hız:95 yavaşlayın para cezası: 1200tl
//hız: 120 çok hızlı yavaşlayın para cezası 2000Tl

public class Radar {

    //global veriable
    //Toplam odeme miktari
    private static int AMOUNT=0;

    //hizli gitme cezasi
    private static int HOW_MANY_TIMES;


    //scannerSpeed Method
    public static int scannerSpeed(){
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lutfen hizinizi giriniz");
        int amount=0;
        int speed = Math.abs(klavye.nextInt());
        return speed;
    }

    //radar Method
    public static void radar(){
        int speed = scannerSpeed();

        if(80<=speed && speed<=94){
            AMOUNT= AMOUNT+800;
            HOW_MANY_TIMES +=1;
            System.out.println("hiz: " +speed+ " hizli yavaslayın para cezasi: "+ AMOUNT + " "+ HOW_MANY_TIMES + " Kez ceza aldiniz:");
        } else if (95<=speed && speed<=119) {
            AMOUNT+=1200;
            HOW_MANY_TIMES+=1;
            System.out.println("hiz: " +speed+ " hizli yavaslayın para cezasi: "+ AMOUNT + " "+ HOW_MANY_TIMES + " Kez ceza aldiniz:");
        } else if (speed>=120) {
            AMOUNT+=2000;
            HOW_MANY_TIMES+=1;
            System.out.println("hiz: " +speed+ " hizli yavaslayın para cezasi: "+ AMOUNT + " "+ HOW_MANY_TIMES + " Kez ceza aldiniz:");
        }else {
            System.out.println("Hiziniz normal:");
        }
    }


    public static void main(String[] args) {
        for (;;){
        radar();
        }
    }
}

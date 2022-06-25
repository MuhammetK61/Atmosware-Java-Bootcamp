package com.Homework;


//Bir sayi söylüyoruz ve çıkan sonucu tahmin ediyoruz
//sonuc her zaman 11 çıkıyor

//Adım1: tuttuğunuz sayiyi 2 ile çarpın ve sonuca 22ekleyin
//Adım2: cıkan sonucu 2 ile  bölün
//adım3: bu sayıyı ilk sayıdan çıkarın

//Formül:  int sonuc = (((sayi*2)+22)/2)-sayi

import java.util.Scanner;

public class AklindaBirSayiTut {

    public static int scannerNumber(){
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir sayi tutunuz:");
        int tahmin = klavye.nextInt();
        return tahmin;
    }

    public static void preditionNumber(){
        int number = Math.abs(scannerNumber());
        Scanner klavye = new Scanner(System.in);
        if(1<=number && number<=100){
            System.out.println("Simdi su adimlari yapalim.");
            System.out.println("Tuttugunuz sayiyi 2 ile carpin ve sonuca 22 ekleyin");
            System.out.println("Sonucu iki ile bolelim");
            System.out.println("Cikan sayiyi ilk sayidan cikaralim");

            int result = (((number* 2 )+22)/2)-number;
            System.out.println("Cikan sonucu gormek icin bir tusa basiniz:");

            //klavyede bir tusa bastıktan sonra sonucu gormek icin kullandım
            klavye.hasNext();
            System.out.println("sonuc: 11");
        }
    }


    public static void main(String[] args){
        for (;;){
            preditionNumber();
        }
    }
}

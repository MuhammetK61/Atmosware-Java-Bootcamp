package com.Homework;

import java.util.Scanner;

public class MükemmelSayi {

    public static int scannerFunction(){
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz.");
        int number = klavye.nextInt();
        return number;
    }

    public static int perfectNumber(){
        int number = scannerFunction();
        int result = 0;
        for (int i=1; i<number;i++){
           if(number % i==0){
               result += i;
           }
        }
        if (result == number){
            System.out.println("Sayimiz mukemmel sayidir.");
        }else{
            System.out.println("Sayimiz mukemmel sayi degildir.");
        }
        return result;
    }



    public static void main(String[] args) {
        for(;;){
            perfectNumber();
        }
    }
}

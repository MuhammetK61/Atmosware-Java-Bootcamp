package com.Homework;
import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args){
        int number;
        boolean isPrime = true;
        Scanner klavye = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz.");
        number= klavye.nextInt();

        if (number < 1 ){
            System.out.println("Gecersiz sayi!");
            return;
        }
        if(number == 1){
            System.out.println("Sayi asal degildir.");
            return;
        }

        for(int i=2; i<number;i++){
          if (number % 2== 0) {
              isPrime = false;
          }
        }
        if (isPrime){
            System.out.println("Sayi asaldir.");
        }else {
            System.out.println("Sayi asal degildir.");
        }
    }
}

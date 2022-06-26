package com.Homework;

import java.util.Scanner;

public class Fibonacci {

    public static int fibonacciNumber(){
        Scanner value = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;

        System.out.print("Lutfen bir deger giriniz.");
        int number = Math.abs(value.nextInt());
        System.out.print(n1 + " " + n2); //0 ile 1 i yazdırıyoruz

        for (int i = 2; i < number; i++) { //döngü 2den başlıyor çünkü ilk iki terim 0 ve 1 her zaman yazılacak
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
        return 0;
    }

    public static void main(String[] args) {
        for (;;){
            fibonacciNumber();
        }

    }
}

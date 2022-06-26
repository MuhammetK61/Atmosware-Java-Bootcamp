package com.Homework;

import java.util.Scanner;

public class EbobEkok {

    public static void ekok(int number1, int number2) {
        int ekok = (number1 * number2) / ebob(number1, number2);
        System.out.println("Ekok: " + ekok);
    }

    public static int ebob(int number1, int number2) {
        int ebob = 1;
        for (int i = Math.min(number1, number2); i > 0; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
                break;
            }
        }
        return ebob;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        int number1 = scn.nextInt();

        System.out.print("Ikinci sayiyi giriniz: ");
        int number2 = scn.nextInt();

        System.out.println("Ebob: " + ebob(number1, number2));
        ekok(number1, number2);
    }
}


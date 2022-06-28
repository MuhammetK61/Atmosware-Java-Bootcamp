package com.Alistirmalar;

import java.util.Arrays;

public class Diziler3Equals {

    public static void main(String[] args) {
        int[] dizi1 = { 1, 9, 6, 2 };
        int[] dizi2 = { 1, 9, 6, 2 };

        //Arrays.equals(dizi, dizi2)==>boolean döner

        if (Arrays.equals(dizi1,dizi2)){
            System.out.println("Birebir ayni");
        }else {
            System.out.println("Diziler farkli elamanlıdır ama aynı uzunluktadır.");
        }

        //forEach
        for(int temp : dizi1){
            System.out.print(temp+ " ");
        }


    }
}

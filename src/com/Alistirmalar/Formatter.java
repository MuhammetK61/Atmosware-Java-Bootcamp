package com.Alistirmalar;


public class Formatter {
    public static void main(String[] args){
        String str="Java verileri";
        int decimal=44;
        double virgul = 35.44;

        System.out.print("Alt satira gecme");
        System.out.println("Alt satira gecebilirsin");
        //!printf lere dikkat
        System.out.printf("%s %d %f",str, decimal, virgul);
        System.out.println();

        System.out.printf("%25s %d %f",str, decimal, virgul);
        System.out.println();
    }
}

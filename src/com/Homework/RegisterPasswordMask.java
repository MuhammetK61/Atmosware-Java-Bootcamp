package com.Homework;

import java.util.Scanner;


//Kullanıcıdan alınan kelimenin ilk ve son harfi dışındakiler * şeklinde olsun
//Örnek: M******t

public class RegisterPasswordMask {

    //kullanıcıdan alınan data
    public static String scannerValueData(){
        Scanner klavye =  new Scanner(System.in);
        System.out.println("\n Lutfen bir kelime giriniz:");
        String value = klavye.nextLine();
        return value;
    }

    //girilen kelimenin ilk ve son karakter haricini yıldızlayan algoritme
    public String stringPasswordMask(){
        String value = scannerValueData();
        String temp = "", allValue=""; //nullPointerException
        for (int i=0; i<value.length()-1;i++){
            if ((value.charAt(i)==value.charAt(0)) || value.charAt(i) == value.length()-1){
                continue;
            }
            temp+=value.replace(value.charAt(i),'*').charAt(i);
        }
        allValue=value.charAt(0)+temp.concat(value.charAt(value.length()-1)+" ");
        System.out.println(allValue);
        return temp;
    }

    public static void main(String[] args){
        for (;;){
            RegisterPasswordMask mask = new RegisterPasswordMask();
            mask.stringPasswordMask();
        }
    }

}

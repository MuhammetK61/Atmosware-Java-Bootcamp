package com.Homework;
import java.util.Scanner;

public class vizeFinal {

    // kullanıcıdan alınan vize ve final notuna göre geçme(ortalama)
    // not ortalaması: ortalama<50 altında ise kaldı
    // not ortalaması: ortalama==50 Geçti
    // not ortalaması: 55<=x<=70 BB
    // not ortalaması: 70<=x<=84 BA
    // not ortalaması: 84<=x<=100 AA
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int finalNot, vizeNot, ortalama;

        System.out.println("Lutfen vize notunuzu giriniz: ");

        //Vize notu sıfırdan küçük girildiği her sefer yeni vize notu ister.
        while(true){
            vizeNot = klavye.nextInt();
            if (vizeNot<0){
                System.out.println("Vize notu sifirdan kucuk olamaz. Lutfen vize notunuzu tekrar giriniz");
            }else{
                break;
            }
        }

        System.out.println("Lutfen final notunuzu giriniz:");

        //Final notunun sıfırdan küçük girildiği her sefer yeni final notu ister.
        while(true){
            finalNot = klavye.nextInt();
            if (finalNot<0){
                System.out.println("Final notu sifirdan kucuk olamaz. Lutfen final notunuzu tekrar giriniz");
            }else{
                break;
            }
        }

        ortalama = (vizeNot + finalNot)/2;

        if(0<= ortalama && ortalama<50){
            System.out.println("Kaldiniz! Ortalamaniz:" + ortalama);
        }else if(ortalama == 50){
            System.out.println("Gectiniz! Ortalamaniz:" + ortalama);
        }else if(55<=ortalama && ortalama<=70){
            System.out.println("Gectiniz! Ortalamaniz: " + ortalama + " Harf Notunuz: BB");
        }else if(70<= ortalama && ortalama <= 84){
            System.out.println("Gectiniz! Ortalamaniz:" + ortalama + " Harf Notunuz: BA");
        }else if(84<=ortalama && ortalama<=100){
            System.out.println("Gectiniz! Ortalamaniz:" + ortalama + " Harf Notunuz: AA");
        }else {
            System.out.println("Hatali bilgi girdiniz");
        }
    }
}
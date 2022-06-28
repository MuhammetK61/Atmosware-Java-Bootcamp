package com.Alistirmalar;

//diziler eleman sayıları belli olanlardır
//Verilerimizi düzgün bir şekilde tutabilmek gerektiğinde o verilere erişim sağlamak için önemlidir.
//Sıfır(0) indiste başlar
// Tek boyutlu çift boyutlu olarak devam eder

import java.util.Arrays;

public class Diziler {

    public static void main(String[] args) {
       /* int[] dizi = new int[6];
        dizi[0]=1;
        dizi[3]=3;
        dizi[4]=4;
        dizi[5]=5;*/

        int[] dizi = {1,9,6,2};

        //dizileri sıralamak için kullanılır
        Arrays.sort(dizi);


        //Arrays.binarySearch();
        // dikkat binarySearc sıralanması gerekir önce ARrays.sort() yapmamız gerekir.
        //Eğer dizide eleman varsa indir döner yoksa negatif döner.







        //forEach dongusu:sadece ekranda gostermek istiyorsak
        //forEach dongusu: indisi numarası bize gerekmiyorsa

        for( int temp : dizi){
            System.out.print(temp + " ");
        }
    }

}

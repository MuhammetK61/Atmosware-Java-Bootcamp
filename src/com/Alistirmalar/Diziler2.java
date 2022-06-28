package com.Alistirmalar;

import java.util.Arrays;

public class Diziler2 {

    public static void main(String[] args) {

        int[] dizi = {1,9,6,2};

        //dizileri sıralamak için kullanılır
        Arrays.sort(dizi); //1 2 6 9


        //Arrays.binarySearch()
        // dikkat binarySearc sıralanması gerekir önce ARrays.sort() yapmamız gerekir.
        //Eğer dizide eleman varsa indir döner yoksa negatif döner.
        //Bu yüzden döngülerde x>0 ise koşulu koyulmalıdır.
        int number =7;
        int result = Arrays.binarySearch(dizi, number);

        if (result>0){
            System.out.println("Aradiginiz sayi olan: "+number+ " vardir." + result + " indistedir.");
        }else {
            System.out.println("Aradiginiz sayi yoktur.");
        }
    }
}

package com.Homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
// NOT: birden fazla metotla yapalım
// kullanıcıdan alınan sayı kadar dizi elemanı olsun rastgele 1-10 arasındaki bu
// sayıları bir diziye atayalım
// sonra bu diziyi başka bir diziye clone edelim.
// clonelanmış bu dizi bu sayıları küçükten büyüğe doğru sıralayın
// (Arrays.sort())
// en küçük sayıyı ve en büyük sayıyı bulalım ? ( diziyele yapalım)
// bu sayıların toplamını ?
// bu sayıların ortalaması ?

// bu dizideki elemanlardan tek sayılardan kaç tane ve tek sayı toplamları (tek
// sayı dizisi)
// bu dizideki elemanlardan çift sayılardan kaç tane ve çift sayı toplamları
// (çift sayı dizisi)
// dizilerde en büyük ile 25 karşılatıralım dizideki eleman 25 büyük mü
// dizideki elemanlardan 5 sayısı var mı ? (java.util.Arrays.binarySearch())
// dizideki tekrar eden sayıları bir dizide göstrerelim ?
// dizideki tekrar eden sayılar yerine 1 kere tekrar sayı göstersin (tekrarsız
// dizi elemanları)

public class DizilerOdev {

    public static void main(String[] args) {
        int[] firstArray = creatingArray();
        int[] secondArray = cloneArrayFunc(firstArray);
        totalAndAvg(secondArray);
        odd(secondArray);
        even(secondArray);
        searching(secondArray);
        repeatingNumbers(secondArray);
        withoutRepeatingNumbers(secondArray);

    }
    public static int[] creatingArray(){
        Scanner scn =new Scanner(System.in);
        System.out.println("Lutfen dizi boyutu giriniz");
        int size = scn.nextInt();

        int[] myArray = new int[size];
        Random random = new Random();
        for (int i= 0; i<myArray.length;i++){
            myArray[i]+=random.nextInt(10);
        }
        return myArray;
    }

    public static int[] cloneArrayFunc(int[] array){
        int[] cloneArray = array.clone();
        Arrays.sort(cloneArray);
        for (int i: cloneArray){
            System.out.print(i+ " ");
        }
        System.out.println("\nEn kucuk sayi: " + cloneArray[0]);
        System.out.println("En buyuk sayi: " + cloneArray[cloneArray.length-1]);
        return cloneArray;
    }

    public static void totalAndAvg(int[] array){
        float total = 0;
        float avg = 0;

        for (int item: array){
            total+=item;
        }
        System.out.println("Sayilarin toplami: "+ total);
        avg=total/array.length;
        System.out.println("Sayilarin ortalamasi: "+avg);
    }

    public static void odd(int[] array){
        int countOdd=0;
        int totalOdd=0;
        for(int i:array){
            if (i%2==1){
                countOdd++;
                totalOdd+=i;
            }
        }
        System.out.println("Tek sayilarin adedi: " +countOdd);
        System.out.println("Tek sayilarin toplami: "+totalOdd);
    }

    public static void even(int[] array){
        int countEven=0;
        int totalEven=0;
        for(int i: array){
            if (i%2==0){
                countEven++;
                totalEven+=i;
            }
        }
        System.out.println("Cift sayilarin adeti: "+countEven);
        System.out.println("Cift sayilarin toplami: "+totalEven);
    }

    public static void searching(int[] array){
        Scanner scn = new Scanner(System.in);
        System.out.println("Aramak istediginiz sayiyi giriniz.");
        int number = scn.nextInt();
        int position = Arrays.binarySearch(array,number);

        if (position>0){
            System.out.println(number+" Numara dizide var.");
        }else
        {
            System.out.println("Numara dizide yok");
        }
    }

    public static void repeatingNumbers(int[] array){
        int[] repeatingNumbers={};
        System.out.print("Tekrar eden sayilar: ");
        for (int i=0;i<array.length;i++){
            for (int j =i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    System.out.println(array[j]+ " ");
                }
            }
        }
    }

    public static void withoutRepeatingNumbers(int[] array){
        Set<Integer> arraySet = new HashSet<Integer>();

        for (int item: array){
            arraySet.add(item);
        }
        System.out.println("\n Tekrarlayan sayilar olmadan mevcut dizimiz: \n"+arraySet);
    }
}


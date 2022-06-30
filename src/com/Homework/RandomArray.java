package com.Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Odev sayisini giriniz. ");
        int number = scn.nextInt();
        randomArray(number); // kullanıcıdan aldığım datayı randomArray metoduna yolladım.
        scn.close();
    }
    public static String[] studentArray(){
        String[] students =
                {
                        "Ali Furkan Erguvan","Alim Yogurtcu","Arda Kozan","Beytullah Zor",
                "Burak Can Gultekin","Dogus Saglam","Emre Yildiz","Furkan Gurcay","Huseyin Baris Aktas",
                "Ibrahim Bayramli","Kubilay Alp Agacan","Mehmet Mustafa Ozcelik",
                "Mustafa Kemal Celik","Omer Faruk Caliskan","Seyda Ozdemir","Tolga Gureli","Tuba Argin","Yigit Ozen"
        };
        // Dizilerde return yaparken her zaman dizi ismini kullan fonksiyon ismini kullanırsan sonsuz döngü olur
        return students;
    }

    //Dizi oluştururken dizinin türünü(int, String vb.) belirledikten sonra "[]" işaretini unutma
    public static int[] randomArray(int number){
        String[] students = studentArray(); //students dizisini buraya çağırdım
        int [] MyArray = new int[number]; //Dizi boyutu kullanıcıdan aldığım sayı kadar olan MyArray dizisini oluşturdum
        Random random = new Random(); // Random sayı başlangıcı
        MyArray[0]=random.nextInt(students.length)+1; // 0 ile students dizisi boyutu arası rastgele sayı oluşturuyorum
        for(int i= 0; i<MyArray.length; i++) {
            Arrays.sort(MyArray); // Diziyi sıraladım
            while (true){
                int randomNumber = random.nextInt(students.length)+1;
                if (Arrays.binarySearch(MyArray,randomNumber)<0){
                    MyArray[i]=randomNumber;
                    System.out.println((i+1)+ ". Odev: "+students[MyArray[i]-1]);
                    break;
                }
            }
        }
        // Dizilerde return yaparken her zaman dizi ismini kullan fonksiyon ismini kullanırsan sonsuz döngü olur(Recursive)
        return MyArray;
    }
}

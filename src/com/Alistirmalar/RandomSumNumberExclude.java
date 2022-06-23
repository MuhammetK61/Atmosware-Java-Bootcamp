package com.Alistirmalar;

import java.util.Random;


//Örnek= 1-10 arasında 5 tane random sayı üretelim ve bunları toplayalım
//ancak bu sayıların 5'e bölünen sayılarını toplamayalım (key:continue)

public class RandomSumNumberExclude {

    public static void main(String[] args){

        Random rastgele = new Random();
        int sum=0, temp=0;
        for(int i=1;i<=5;i++){
            //rastgele sayı üreti
            temp=(rastgele.nextInt(10)+1);
            if(temp%5==0) {
                continue;
            }
            sum +=temp;
        }

        System.out.println(sum);

    }
}


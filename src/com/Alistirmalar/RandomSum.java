package com.Alistirmalar;
import java.util.Random;
public class RandomSum {
    public static void main(String[] args){
        //1-10 arası 5 tane random sayı oluşturup toplayalım
        Random rastgele = new Random();
        int sum=0;
        int temp=0;
        //String str = "";
        for(int i=1;i<=5;i++){
            //str += (rastgele.nextInt(10) + 1) + " ";
            temp=(rastgele.nextInt(10)+1);
            sum = sum +temp;
        }
        //System.out.println(str);
        System.out.println(sum);

    }
}

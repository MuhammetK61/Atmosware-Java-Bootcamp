package com.Alistirmalar;
//TYPE SAFE SAĞLAR
//java 5 gelen özelliktir
//enum vlass interface
//new oluşturulmaz ==> enum, inteface, abstract
//Enum saymaya sıfırdan başlar
public class EnumMainTest {
    public static void main(String[] args){
            System.out.println(Enum.CARSAMBA);

            Enum enum1 = Enum.CARSAMBA;
            System.out.println(enum1);
            System.out.println("Sira: "+enum1.ordinal());
            System.out.println("Values: " + Enum.values()[2]);

            String str = Enum.CARSAMBA.toString();
            System.out.println(str);

            for (Enum temp : Enum.values()){
                System.out.println(temp + " ");
            }
    }
}


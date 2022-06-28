package com.Alistirmalar;

public class EnumMainTest2 {

    public static void main(String[] args){
            EnumConstructor enumConstructor = EnumConstructor.BUYUK;
            System.out.println(enumConstructor);
            System.out.println("SIRA: " + enumConstructor.ordinal());
            System.out.println("KEY: " + enumConstructor.getKey());
            System.out.println("VALUE: " + enumConstructor.getValue());

            String str = EnumConstructor.BUYUK.toString();
            System.out.println(str);

            String str2 = EnumConstructor.BUYUK.getValue().toString();
            System.out.println(str2);

            System.out.println("***************************");
            for (EnumConstructor temp : EnumConstructor.values()) {
                System.out.println(temp + " " + temp.getKey() + " " + temp.getValue());
            }
    }
}

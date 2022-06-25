package com.Alistirmalar;

import java.util.UUID;

public class RandomUID {

    public static void main(String[] args){
        //32 karakterli random unique data oluşturmak

        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
    }
}

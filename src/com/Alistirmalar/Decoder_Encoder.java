package com.Alistirmalar;

import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;
import java.util.Scanner;

public class Decoder_Encoder {

    //Encoder(Sifrelemek) - Decoder(Cozmek)
    //Encoder: yazılımda bir kelimeyi belli bir formatta şifrelemek için kullanılır.
    //Decoder: yazılımda şifrelenmiş bir kodu, çözmek için kullanılır.
    //Base64 : Bu kutuphaneyi kullanırız.
    //Encoder-Decoder JWT en çok kullanıyoruz.
    //Neden kullanıyoruz ? Buyuk verilerde az yer kaplar.
    //Decoder-Encoder, MD5, SHA ile karıştırmayalım

    //Kullanicidan veri almak
    public static String getDataFromUser(){
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lutfen bir deger yaziniz.");
        String vocabulary = klavye.nextLine();
        return vocabulary;
    }

    //Encoder Method
    public static String getEncodrData(String vocabulary){
        //Encoder(Şifreleme)
        Encoder encoder = Base64.getEncoder();
        String encrpted = encoder.encodeToString(vocabulary.getBytes());

        return encrpted;
    }

    //Decoder(Cozumleme)
    public static String getDecoderData(String vocabulary){
        Decoder decoder = Base64.getDecoder();
        String solved = new String(decoder.decode(vocabulary));
        return solved;
    }

    public static void encoderDecoderMainMethod(){
        String kelime= getDataFromUser();
        System.out.println("Ilk hali: " + kelime);

        //Encoder(Şifreleme)
        String encrpted = getEncodrData(kelime);
        System.out.println("Sifrelenmis data: " + encrpted);

        //Deoder(Cozmek)
        String solved = getDecoderData(getEncodrData(kelime));
        System.out.println("Cozulmus data: "+solved);
    }


    public static void main(String[] args) {
        encoderDecoderMainMethod();
    }
}

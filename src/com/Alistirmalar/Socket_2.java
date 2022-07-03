package com.Alistirmalar;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.util.Scanner;

// One Way (Clint -Server String examples)
// Client Kullanicidan aldigi veriyi Servera göndersin
// Server gelen bu data alsin büyük harflere ve length hesaplayan algoritma ?

// Unutma:
// 1-)oncelikle Server'i çalistirmalisýüin. Sonra Client'i calistiriyoruz
// 2-) PSVM ==> Serverda olur.
// 3-) java.net kutuphanesini import ediyoruz

// Random 49152<=X<=65535
public class Socket_2 {

    static Socket_1 information = new Socket_1();

    // deðiþkenler
    private static String IP_ADDRESS = information.readDataFile()[0];
    private static int PORT = Integer.valueOf(information.readDataFile()[1]);

    // chooise method
    public static int chooise() {
        String originStaticValue = "### Seçim Yapiniz ###".toUpperCase();
        Scanner klavye = new Scanner(System.in);
        System.out.println(originStaticValue + "\n1-)Dosya yaz\n2-)Dosya Oku \n3-)Server Çalýþtýr\n4-)Cikis");
        return klavye.nextInt();
    }

    // mainMethod
    public static void mainMethod() {
        int key = chooise();
        switch (key) {
            case 1:
                System.out.println("Yazma");
                information.writeDataFile();
                break;

            case 2:
                System.out.println("Okuma");
                for (String temp : information.readDataFile()) {
                    System.out.print(temp + " ");
                }
                System.out.println();
                break;
            case 3:
                System.out.println("Server ");
                serverMethod();
                break;

            case 4:
                System.out.println("Cikis");
                System.exit(0);
                break;

            default:
                System.out.println("Seçim dýþýnda bir deger girdiniz....");
                break;
        }
    }

    // Server Method
    private static void serverMethod() {
        String clientValue, bigLetter;
        System.out.println("Server Hazir...");

        // java.net.SocketException: Socket is not bound yet: Port eklenmemis
        // java.net.BindException: Address already in use: bind : Ayni Portu Tekrar
        // kullandiniz
        // server: Clienttan gelen veriyi okumasi gerekiyor.

        System.out.println("Port: " + PORT);
        System.out.println("Ipaddres: " + IP_ADDRESS);

        try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(PORT).accept().getInputStream())) {
            clientValue = dataInputStream.readUTF();
            bigLetter = clientValue.toUpperCase();
            System.out.println(bigLetter + " Harf Sayisi: " + bigLetter.length());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // PSVM
    public static void main(String[] args) {
        for (;;) {
            mainMethod();
        }

    }

}
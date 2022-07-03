package com.Alistirmalar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

// Two Way (Clint -Server String examples)
// Client Kullanicidan aldigi veriyi Servera göndersin
// Client -Server yazismasini File Yazdirsin

// Unutma:
// 1-)öncelikle Server'i calistirmalisin. Sonra Client'i calistiriyoruz.
// 2-) PSVM ==> Serverda olur.
// 3-) java.net kütüphanesini import ediyoruz
public class Socket_5_1 {

    // deðiþkenler
    private static String receiveMessage;// mesaj almak
    private static String sendMessage; // mesa j göndersin

    // twoWayClient
    private static void twoWayClient() {
        try {
            Socket socket = new Socket("localhost", 4545);

            // Client veri gönderecek
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream, true);

            // serverdan gelen veriyi almak
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
            System.out.println("Client: Lütfen mesaj yazýnýz ");

            while (true) {
                // clientten veri almak
                sendMessage = bufferedReader.readLine();
                printWriter.println(sendMessage);
                printWriter.flush();

                if ((receiveMessage = bufferedReader2.readLine()) != null) {
                    System.out.println("SERVER: " + receiveMessage);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // PSVM
    public static void main(String[] args) {
        twoWayClient();
    }
}
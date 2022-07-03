package com.Alistirmalar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// Two Way (Clint -Server String examples)
// Client Kullanicidan aldigi veriyi Servera göndersin
// Client -Server yazismasini File Yazdirsin

// Unutma:
// 1-)öncelikle Server'i calistirmalisin. Sonra Client'i calistiriyoruz.
// 2-) PSVM ==> Serverda olur.
// 3-) java.net kütüphanesini import ediyoruz

public class Socket_5 {

    // deðiþkenler
    private static String receiveMessage;// mesaj almak
    private static String sendMessage; // mesa j göndersin

    // two way Server
    private static void twoWayServer() {
        try {
            System.out.println("Server Hazýr");
            ServerSocket serverSocket = new ServerSocket(4545);
            Socket socket = serverSocket.accept();

            OutputStream outputStream = socket.getOutputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            PrintWriter printWriter = new PrintWriter(outputStream, true);

            InputStream inputStream = socket.getInputStream();
            BufferedReader receiveRead = new BufferedReader(new InputStreamReader(inputStream));

            while (true) {
                if ((receiveMessage = receiveRead.readLine()) != null) {
                    System.out.println("CLIENT: " + receiveMessage);
                    // dosya writer
                }
                sendMessage = bufferedReader.readLine();
                printWriter.println(sendMessage);
                printWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // PSVM
    public static void main(String[] args) {
        twoWayServer();
    }

}

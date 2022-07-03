package com.Alistirmalar;


import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

// One Way (Clint -Server String examples)
// Client Kullanicidan aldigi veriyi Servera göndersin
// Server gelen bu data alsin büyük harflere ve length hesaplayan algoritma ?

// Unutma:
// 1-)oncelikle Server'i çalistirmalisýüin. Sonra Client'i calistiriyoruz
// 2-) PSVM ==> Serverda olur.
// 3-) java.net kutuphanesini import ediyoruz

// Random 49152<=X<=65535

// Random 49152<=X<=65535
public class Socket_3 {

    static Socket_1 information = new Socket_1();

    // deðiþkenler
    private static String IP_ADDRESS = information.readDataFile()[0];
    private static int PORT = Integer.valueOf(information.readDataFile()[1]);

    // Client Method
    private static void clientMethod() {
        // kullanýcýdan alacaðým veri
        String vocabulary = JOptionPane.showInputDialog("Lütfen birseyler yaziniz");
        try (DataOutputStream dataOutputStream = new DataOutputStream(new Socket(IP_ADDRESS, PORT).getOutputStream())) {
            dataOutputStream.writeUTF(vocabulary);
        } catch (IOException e) {
            System.out.println("Client Method IOException Error ");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Client Method Error ");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        clientMethod();
    }

}
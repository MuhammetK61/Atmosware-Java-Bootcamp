package com.Alistirmalar;

// One Way (Clint -Server String examples)
// Client Kullanicidan aldigi veriyi Servera göndersin
// Server gelen bu data alsin büyük harflere ve length hesaplayan algoritma ?

// Unutma:
// 1-)oncelikle Server'i çalistirmalisýüin. Sonra Client'i calistiriyoruz
// 2-) PSVM ==> Serverda olur.
// 3-) java.net kutuphanesini import ediyoruz

// Random 49152<=X<=65535
public class Socket_4 {

    public static void main(String[] args) {

        Socket_2 server = new Socket_2();
        // server.serverMethod();

        Socket_3 client = new Socket_3();
        // client.clientMethod();
    }

}

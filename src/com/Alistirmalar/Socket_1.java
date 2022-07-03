package com.Alistirmalar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

    public class Socket_1 {
        // Dagitik Programlama (distributed System) :Ayni networkteki bilgisayarlarin
        // birbiriyle haberleþmesine denilir.
        // Senkron : Ayni anda tek bir islem yapabilme yetenegidir.
        // Senkron : Ayni anda birden fazla islem yapabilme yeteneðidir.
        // TCP/IP UDP (Client:istemci(Hizmet alan) Server:Hizmet veren :
        // TCP/IP ~ UDP ==> Agdaki Bilgisayarlarin birbiriyle haberlesmesini saglayan
        // protokol adidir.

        // TCP/IP ile UDP arasýndaki farklar
        // TCP/IP: güvenli ,karsi tarafa data gidip gitmedigini kontrol eder. Yavastir.
        // UDP:güvensizdir,karsi tarafa data gidip gitmedigini kontrol etmeezzzzzz.
        // Hizlidir. Canli Live Stream (Online system)

        // RPC > RMI(Java): Remote Method Invocation: Farkli sunuculardaki metotlari
        // çagirip islem
        // yapilmasi durumudur.

        // 2^16=65536 port sayisi (Kapi)
        // 0<=X<=1023 (Well-Know-Port)
        // SSH:22
        // FTP:20
        // HTTP:80, 443

        // 1024<=Y<=49151 ( Registered Port):sabitlenmis
        // Mongo: 27017
        // Postgresql:5432
        // Mysql:3306

        // 49152<=X<=65535 Dynamic Port

        private String ippAddress = "localhost"; // 127.0.0.1
        private String port = "8888";

        private static final String MY_PATH = "C:\\turkcell\\Socket.txt";

        // Method Random
        private int randomInt() {
            Random random = new Random();
            return random.nextInt(65535) + 0;
        }

        /////// write method
        public void writeDataFile() {
            System.out.println("*** Dosya Yaz ***");
            Scanner klavye = new Scanner(System.in);
            Socket_1 socketInformation = new Socket_1();
            System.out.println("ip address yaziniz");
            socketInformation.setIppAddress(klavye.nextLine());
            System.out.println("port");
            socketInformation.setPort(klavye.nextLine());
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(MY_PATH, true))) {
                bufferedWriter.write(socketInformation.getIppAddress() + " " + socketInformation.getPort() + "\n");
                bufferedWriter.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //////// read method
        public String[] readDataFile() {
            String[] dizi = null;
            StringBuilder builder = null;
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(MY_PATH))) {
                builder = new StringBuilder();
                String satir = "";
                while ((satir = bufferedReader.readLine()) != null) {
                    builder.append(satir);
                }
            } catch (Exception e) {
                System.out.println("Okumada sorun oluþtu");
                e.printStackTrace();
            }
            dizi = builder.toString().split(" ");
            return dizi;
        }

        // getter and setter

        public void setIppAddress(String ippAddress) {
            this.ippAddress = ippAddress;
        }

        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }

        public String getIppAddress() {
            return ippAddress;
        }
    }


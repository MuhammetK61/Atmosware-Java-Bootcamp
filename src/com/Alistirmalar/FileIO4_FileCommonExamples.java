package com.Alistirmalar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

//ODEV

// step.1 -) File icin CRUD islemi yapacak bir algoritma yapınız ?

// step.2 -) olusturulan her bir dosyaya enum ile
// ADMIN(yazma,okuma,olusturmadir),WRITER(yazma ve okumadir),USER(okumak)
// rollerini en sola yazalım ==> ADMIN 30/Haziran/2022 12:26:01 yazdimmm

// step.3 -) Bir Dosya okuyacak başka bir dosyaya verileri yazacak ( Object)

// step.4 -) Bu projemiz sunuda yapsin ?
// person.txt ve homework.txt diye bir dosyamiz olsun bu dosyalar
// person.txt dosyasinda ==> kisi ismi ve soyisimi olacak
// homework.txt dosyasinda ==> verilecek ödevler olacak
// Bilgisayar random olarak kisiye odev verecek

public class FileIO4_FileCommonExamples {

    // Sınıf degiskeni (Class variable)
    private static Scanner klavye;

    private static String MY_PATH;

    FileIO4_FileClass pathClass;

    // parametresiz constructor
    public FileIO4_FileCommonExamples(FileIO4_FileClass pathClass) {
        this.pathClass = new FileIO4_FileClass();
    }

    // Chooise Method
    public static int chooise() {
        klavye = new Scanner(System.in);
        System.out.println("Secim yapiniz.");
        System.out.println("0-)Cikis\n1-)Dosya olustur\n2-)Dosya Yaz\n3-)Dosya Oku\n4-)Dosya Sil\n5-)Dosya Bilgileri");
        return klavye.nextInt();
    }

    // mainMethod
    public static void mainMethod() throws IOException {
        int key = chooise();
        switch (key) {
            case 1:
                createDataFile();
                break;

            case 2:
                writeDataFile();
                break;

            case 3:
                ReadDataFile();
                break;

            case 4:
                deleteDataFile();
                break;

            case 5:
                showFileData();
                break;

            case 0:
                systemExist();
                break;

            default:
                System.out.println("Secim disinda bir deger girdiniz....");
                break;
        }
    }

    // data Merge
    private static String dataMerge(String data) {
        StringBuilder builder = new StringBuilder();
        builder.append("C:\\turkcell\\").append(data).append(".txt");
        return builder.toString();
    }

    // create path
    private static String createPath() {
        klavye = new Scanner(System.in);
        // "C:\\turkcell\\data.txt"
        System.out.println("Dosya adini giriniz...");
        String fileName = klavye.nextLine();
        FileIO4_FileClass pathClass = new FileIO4_FileClass(dataMerge(fileName));
        return pathClass.getPath();
    }

    // create method
    private static void createDataFile() throws IOException {
        System.out.println("*** Dosya Olusturmak ***");
        String path = createPath();
        MY_PATH = path;
        File file = new File(path);
        if (file.createNewFile()) {
            System.out.println(file.getAbsolutePath() + " Dosya olusturuldu");
        } else {
            System.out.println("Olusturulmadi");
        }
    }

    /////// write method
    private static void writeDataFile() {
        System.out.println("*** Dosya Yaz ***");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(MY_PATH, true))) {
            klavye = new Scanner(System.in);
            System.out.println("Dosya yazmak icin birseyler yaziniz...");
            String vocabulary = klavye.nextLine();
            FileIO4_FileClass class1 = new FileIO4_FileClass();
            bufferedWriter.write(class1.getDate() + " ==> " + vocabulary);
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //////// read method
    private static void ReadDataFile() {
        System.out.println("*** Dosya Oku ***");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(MY_PATH))) {
            StringBuilder builder = new StringBuilder();
            String satir = "";
            while ((satir = bufferedReader.readLine()) != null) {
                builder.append(satir);
            }
            System.out.println(builder);
        } catch (Exception e) {
            System.out.println("Okumada sorun olustu");
            e.printStackTrace();
        }

    }

    ///// delete method
    private static void deleteDataFile() {
        System.out.println("*** Dosya Sil ***");
        // try-with resources
    }

    ////// exit
    private static void systemExist() {
        System.out.println("*** Cikis ***");
        System.exit(0);

    }

    // show file
    private static void showFileData() {
        File file = new File(MY_PATH);
        System.out.println("toplam karakter sayisi: " + file.length());
        System.out.println("toplam alan : " + file.getTotalSpace());
        System.out.println("absolute path: " + file.getAbsolutePath());
        System.out.println("kullanilabilecegin alan : " + file.getUsableSpace());
        System.out.println("Degisiklik Tarihi: " + new Date(file.lastModified()));
    }

    public static void main(String[] args) {
        try {
            for (;;) {
                mainMethod();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
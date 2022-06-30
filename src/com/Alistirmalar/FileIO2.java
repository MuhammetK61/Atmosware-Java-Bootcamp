package com.Alistirmalar;

import java.io.File;
import java.util.Date;

public class FileIO2 {

    public static void main(String[] args) {
        try {
            File file = new File(FileIO.MY_PATH);

            // isFile() ==> Dosya mı

            if (file.isFile()) {
                System.out.println("Dosyada çalışıyorsunuz");

                // can: return ==> boolean Linux izinleri ==>755 777 4+2+1
                System.out.println("***** CAN ****************");
                System.out.println("çalışabilen dosya mı: " + file.canExecute());
                System.out.println("okunabilen dosya mı: " + file.canRead());
                System.out.println("yazabilen dosya mı: " + file.canWrite());

                // is
                System.out.println("***** IS ****************");
                System.out.println("dizin mi : " + file.isDirectory());
                System.out.println("dosya mi : " + file.isFile());
                System.out.println("gizli dosyamı : " + file.isHidden());

                // get : getirmek
                System.out.println("***** GET ****************");
                System.out.println("class: " + file.getClass());
                System.out.println("absolute path: " + file.getAbsolutePath());
                System.out.println("normal path: " + file.getPath());
                System.out.println("CanonicalPath: " + file.getCanonicalPath());
                System.out.println("parent: " + file.getParent());
                System.out.println("name: " + file.getName());

                // set:Değiştirmek
                System.out.println("***** SET ****************");
                System.out.println("çalışmasınına iznini kapatmak: " + file.setExecutable(false));
                System.out.println("yazılabilir iznini kapatmak: " + file.setWritable(false));
                System.out.println("okunabilir iznini kapatmak: " + file.setReadable(false));

                // file information
                System.out.println("***** INFORMATION ****************");
                System.out.println("toplam karakter sayısı: " + file.length());
                System.out.println("Değişikliği Tarihi: " + new Date(file.lastModified()));
                System.out.println("absolute path: " + file.getAbsolutePath());
                System.out.println("normal path: " + file.getPath());
                System.out.println("CanonicalPath: " + file.getCanonicalPath());
                System.out.println("toplam GB : " + file.getTotalSpace());
                System.out.println("kullanılabileceğin GB : " + file.getUsableSpace());
            } else {
                System.out.println("Dosya değil");
            }

        } catch (Exception e) {

        } finally {
            // System.out.println("Bu kesim her durumda çalışır");
        }
    }
}

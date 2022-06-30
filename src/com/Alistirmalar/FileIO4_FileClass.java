package com.Alistirmalar;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FileIO4_FileClass {

    // Nesne degiskenleri (Object variable)
    private String path;
    private final String date = createdDate();

    // parametresizconstructor
    public FileIO4_FileClass() {
        this.path = "C:\\turkcell\\data.txt";
    }

    // parametreli constructor
    public FileIO4_FileClass(String path) {
        this.path = path;
    }

    private String createdDate() {
        Locale locale = new Locale("tr", "TR");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss", locale);
        // new Date(System.currentTimeMillis());
        return dateFormat.format(new Date());
    }

    // getter and setter
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDate() {
        return date;
    }

}
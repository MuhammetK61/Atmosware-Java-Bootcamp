package com.Alistirmalar;

//Extends

public class Thread3 extends Thread {

    private String className;

    // getter and setter
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    // parametresiz constructor
    public Thread3() {

    }

    // parametreli constructor
    public Thread3(String className) {
        this.className = className;
    }

    // run metodu
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                // 1000ms =1 sn uyu
                Thread.sleep(500);
                if (i == 1) {
                    System.out.println("\n####Baþlangýç####");
                    System.out.println(this.className + "\n");
                } else if (i == 10) {
                    System.out.println("\n####Bitiþ####");
                    System.out.println(this.className + "\n");
                } else {
                    System.out.println(this.className);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

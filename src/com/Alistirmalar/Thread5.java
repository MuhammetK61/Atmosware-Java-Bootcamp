package com.Alistirmalar;

public class Thread5 {

    public static void main(String[] args) throws InterruptedException {

        Thread3 multiple1 = new Thread3("1.instance");
        Thread3 multiple2 = new Thread3("2.instance");
        Thread3 multiple3 = new Thread3("3.instance");

        // Öncelik sirasi
        multiple1.setPriority(Thread.MAX_PRIORITY);
        multiple2.setPriority(Thread.MIN_PRIORITY);
        multiple3.setPriority(Thread.NORM_PRIORITY);

        // start() önce thread yasamaz
        // System.out.println("1. thread " + multiple1.isAlive());

        multiple1.start();
        // öncelikle thread 1 bitmesi gerekiyor 1.thread bittikten sonra digerleri
        // baslar
        multiple1.join();
        System.out.println("1.Thread ID: " + multiple1.getId());
        System.out.println("1.Thread ID: " + multiple1.getName());
        multiple1.setName("Degisti 1: ");
        System.out.println("1.Thread ID: " + multiple1.getName());
        System.out.println("******************************************");

        multiple2.start();
        multiple2.wait(); // 2.emre kadar Thread 2 dursun
        multiple2.notify();
        multiple2.notifyAll();

        multiple3.start();

        // System.out.println("1. thread" + multiple1.isAlive());
        // System.out.println("2. thread" + multiple2.isAlive());
        // System.out.println("3. thread" + multiple3.isAlive());

    }
}
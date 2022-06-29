package com.Alistirmalar;

// Thread Kullanim Sekilleri

// 1-) extends (Kalitim) ==> Class
// public class MultiThreadExam extends Thread{}
// extends ==> javada 1 tane extends kullanabilirsin
// extends zorunlu olarak run metotudunu eklemez
public class Thread2 extends Thread {
    @Override
    public void run() {
    }
}

// 2-) implements (Interface) ==> interface
// public class MultiThreadExam implements Runnable{}
// implements ==> Javada istediðimiz kadar implements virgül koyarak
// yazabiliriz.
// implement zorunlu olarak run metotudunu zorunlu ekler
class Thread2Implements implements Runnable {
    @Override
    public void run() {
    }
}

// 3-) anonymous (isimsiz) ==> Metot olarak
// Thread thread= new Thread(new Runnable(){});
class Thread2Method {
    public void threadMetotu() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
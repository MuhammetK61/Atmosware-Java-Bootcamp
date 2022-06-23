package com.Alistirmalar;

import java.io.IOException;

public class TryCatch {
    // java.lang > Object > Throwable > 1-)Exception 2-) Error
    // try-catch-finally-throw-throws

    //metod
    public static void fakeMailSend(String data) {
        System.out.println("Admine mail gonderildi:" + data);
    }

    public static void main(String[] args) throws  ArithmeticException, NullPointerException, IOException {

      /*  int sayi =10;
        //if(true){ throw new istisnaTuru("Mesaj")}else{}
        if(sayi ==10){
            throw new ArithmeticException("Bunu yazma");
        }else {
            System.out.println("Success");
        }*/
        try {
            //istisna meyfana gelecek kodlar
            int number =4/0;
            System.out.println(number);
        }catch (ArithmeticException | NullPointerException ae){ //catch özelden(hızlı) genele doğru
            fakeMailSend(ae.getMessage());
            fakeMailSend(ae.toString());
            ae.printStackTrace();
        }catch (Exception e){
            fakeMailSend(e.getMessage());
            fakeMailSend(e.toString());
            e.printStackTrace();
        }finally {
            System.out.println("db.closed()  port.close()");
        }
        System.out.println("son satir");
    }
}



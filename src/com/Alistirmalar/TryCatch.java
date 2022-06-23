package com.Alistirmalar;

public class TryCatch {

    public static void fakeMailSend(String data){
        System.out.println("Admine mail gonderildi:"+data);
    }
    public static void main(String[] args){
        //syntax error
        //intx number =4/0;
        //System.out.println(number);

        //logic error: tanımsız,



        try {
            int number =4/0;
            System.out.println(number);
        }catch (ArithmeticException ae){
            ae.printStackTrace();
            //System.out.println(e.getMessage());
            fakeMailSend(ae.getMessage());
        }catch (Exception e){
            e.printStackTrace();
            //System.out.println(e.getMessage());
            fakeMailSend(e.getMessage());
        }finally {
            System.out.println("Mutlaka calisacak yer. db.close() port.close()" );
        }
        System.out.println("son satir");
    }
}

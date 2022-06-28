package com.Alistirmalar;
//TYPE SAFE SAĞLAR
//java 5 gelen özelliktir
//enum vlass interface
//new oluşturulmaz ==> enum, inteface, abstract
//Enum saymaya sıfırdan başlar
// değişkenlerde final kullanmak bize sadece ==> getter metodu gelir
//constructorlarda private oluşturmak new yani instance oluşturmasına izin vermez

public enum EnumConstructor {
    KUCUK(1, "kucuk"), ORTA(2, "orta"), BUYUK(3, "buyuk");

    private final int key;
    private final String value;

    // parametreli constructor
    private EnumConstructor(int key, String value) {
        this.key = key;
        this.value = value;
    }

    // getter
    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

}

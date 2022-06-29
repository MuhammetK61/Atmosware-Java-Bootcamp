package com.Alistirmalar;
import com.Alistirmalar.Ulke.Il.Ilce;

// Inner Class: 1 tane public classımız vardı(inner class haric)
// Inner Class: static class olmaz (inner class haric)
// Çok tane class oluşturmadan tek bir class mantığında çözümlemedir.
// Single Inheritance(Tek kalıtımdır)
// Çok kalıtım gibi kendisini gösterir.

// static olan inner class
// static olmayan inner class
// Local inner class
// Anonymous inner clas

// Nested (Ulke)
public class Ulke {

    private String ulkeAdi;

    public String getUlkeAdi() {
        return ulkeAdi;
    }

    public void setUlkeAdi(String ulkeAdi) {
        this.ulkeAdi = ulkeAdi;
    }

    // İç Class (İl)
    public static class Il {
        private String ilAdi;

        public String getIlAdi() {
            return ilAdi;
        }

        public void setIlAdi(String ilAdi) {
            this.ilAdi = ilAdi;
        }

        // İç Class
        public static class Ilce {
            private String ilceAdi;

            public String getIlceAdi() {
                return ilceAdi;
            }

            public void setIlceAdi(String ilceAdi) {
                this.ilceAdi = ilceAdi;
            }

        }

    }

    // main test
    public static void main(String[] args) {
        Ulke ulke = new Ulke();
        ulke.setUlkeAdi("Türkiye");

        Il il = new Il();
        il.setIlAdi("Malatya");

        Ilce ilce = new Ilce();
        ilce.setIlceAdi("Battalgazi");

        System.out.println(
                "Ülke Adı: " + ulke.getUlkeAdi() + " İl adı: " + il.getIlAdi() + " İlçe Adı: " + ilce.getIlceAdi());
    }
}
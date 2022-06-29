package com.Alistirmalar;

// static olmayaaaaannnn inner class
public class Ulke2 {

    private String ulkeAdi;

    public String getUlkeAdi() {
        return ulkeAdi;
    }

    public void setUlkeAdi(String ulkeAdi) {
        this.ulkeAdi = ulkeAdi;
    }

    // İç olan class (İl)
    public class Il {
        private String ilAdi;

        public String getIlAdi() {
            return ilAdi;
        }

        public void setIlAdi(String ilAdi) {
            this.ilAdi = ilAdi;
        }

        // İç olan class (İlçe)
        public class Ilce {
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
        Ulke2 ulke = new Ulke2();
        ulke.setUlkeAdi("Türkiye");

        Ulke2.Il il = new Ulke2().new Il();
        il.setIlAdi("Malatya");

        Ulke2.Il.Ilce ilce = new Ulke2().new Il().new Ilce();
        ilce.setIlceAdi("Battalgazi");

        System.out.println(
                "Ülke Adı: " + ulke.getUlkeAdi() + " İl adı: " + il.getIlAdi() + " İlçe Adı: " + ilce.getIlceAdi());
    }
}
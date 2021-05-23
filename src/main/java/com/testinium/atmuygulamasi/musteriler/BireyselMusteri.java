package com.testinium.atmuygulamasi.musteriler;

public class BireyselMusteri extends MusteriBilgileri{

    private String evAdresi;

    public BireyselMusteri(String kimlikNo, String musteriNo, String adSoyad, Float hesapBakiyesi, String evAdresi) {
        super(kimlikNo, musteriNo, adSoyad, hesapBakiyesi);
        this.evAdresi=evAdresi;
    }

    @Override
    public void ekranaBastir() {
        System.out.println("Müşteri Tipi: Bireysel");
        super.ekranaBastir();
        System.out.println("Ev adresi: "+getEvAdresi());
    }

    public String getEvAdresi() {
        return evAdresi;
    }

}

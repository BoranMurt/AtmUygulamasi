package com.testinium.atmuygulamasi.musteriler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MusteriBilgileri {
    private String kimlikNo;
    private String musteriNo;
    private String adSoyad;
    private float hesapBakiyesi;

    public MusteriBilgileri(String kimlikNo, String musteriNo, String adSoyad, Float hesapBakiyesi) {
        this.kimlikNo=kimlikNo;
        this.musteriNo=musteriNo;
        this.adSoyad=adSoyad;
        this.hesapBakiyesi=hesapBakiyesi;
    }
    public void ekranaBastir(){
        System.out.println("Musteri Numarasi: " + getMusteriNo());
        System.out.println("TC Kimlik Numarasi: " + getKimlikNo());
        System.out.println("Ad Soyad: " + getAdSoyad());
        System.out.println("Hesa Bakiyesi: " + getHesapBakiyesi());

    }


    public String getKimlikNo() {
        return kimlikNo;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public float getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(float hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }
}

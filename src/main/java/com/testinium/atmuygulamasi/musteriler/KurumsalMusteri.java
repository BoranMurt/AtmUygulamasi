package com.testinium.atmuygulamasi.musteriler;

public class KurumsalMusteri extends MusteriBilgileri{
    private String sirketAdi;

    public KurumsalMusteri(String kimlikNo, String musteriNo, String adSoyad, Float hesapBakiyesi, String sirketAdi) {
        super(kimlikNo, musteriNo, adSoyad, hesapBakiyesi);
        this.sirketAdi = sirketAdi;
    }
    @Override
    public void ekranaBastir() {
        System.out.println("Musteri Tipi: Kurumsal");
        super.ekranaBastir();
        System.out.println("Ev adresi: "+getSirketAdi());
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

}

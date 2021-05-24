package com.testinium.atmuygulamasi.hesapislemleri;

import com.testinium.atmuygulamasi.musteriler.MusteriBilgileri;

import java.util.Scanner;

public class ParaIslemleri {

    public void paraYatir(MusteriBilgileri musteri){
        System.out.println("Lutfen yatirilacak miktari giriniz: ");
        Scanner parainput = new Scanner(System.in);

        Boolean quit=false;
        while (!parainput.hasNextFloat()) {
            if(parainput.hasNext()){
                String mesaj= parainput.nextLine();
                if(mesaj.equals("q") || mesaj.equals("Q")){
                    System.out.println("Iyi gunler...");
                    quit=true;
                    break;
                }
            }
            System.out.println("Gecersiz sayi girdiniz.\nLutfen islem yapilacak miktari giriniz(Çıkış için 'q' tuşunu kullanınız):");
        }

        if(quit==false){
            Float miktar = parainput.nextFloat();
            Float mevcutBakiye=musteri.getHesapBakiyesi();

            if(miktar<=0){
                System.out.println("Gecersiz para yatirma islemi.");
            }
            else{
                Float yenibakiye=mevcutBakiye+miktar;
                musteri.setHesapBakiyesi(yenibakiye);
                System.out.println("Hesabinizdaki yeni bakiye:"+ musteri.getHesapBakiyesi());
            }
        }


    }
    public void paraCekme(MusteriBilgileri musteri){
        System.out.println("Lutfen cekilen miktari giriniz: ");
        Scanner parainput = new Scanner(System.in);
        Boolean quit=false;
        while (!parainput.hasNextFloat()) {
            if(parainput.hasNext()){
                String mesaj= parainput.nextLine();
                if(mesaj.equals("q") || mesaj.equals("Q")){
                    System.out.println("Iyi gunler...");
                    quit=true;
                    break;
                }
            }
            System.out.println("Gecersiz sayi girdiniz.\nLutfen islem yapilacak miktari giriniz(Çıkış için 'q' tuşunu kullanınız):");
        }

        if(quit==false){
            Float miktar = parainput.nextFloat();
            Float mevcutBakiye=musteri.getHesapBakiyesi();
            if(miktar>mevcutBakiye || miktar<0){
                System.out.println("Bakiyeniz yetersizdir.");
            }
            else{
                Float yenibakiye=mevcutBakiye-miktar;
                musteri.setHesapBakiyesi(yenibakiye);
                System.out.println("Hesabinizdaki yeni bakiye:"+ musteri.getHesapBakiyesi());
            }
        }
    }
}

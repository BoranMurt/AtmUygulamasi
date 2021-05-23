package com.testinium.atmuygulamasi;


import com.testinium.atmuygulamasi.hesapislemleri.ParaIslemleri;
import com.testinium.atmuygulamasi.musteriler.BireyselMusteri;
import com.testinium.atmuygulamasi.musteriler.KurumsalMusteri;
import com.testinium.atmuygulamasi.musteriler.MusteriBilgileri;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MusteriBilgileri bireyselMusteri1=new BireyselMusteri("1000000","001","Boran Murt",1500f,"Guzelyali");
        MusteriBilgileri kurumsalMusteri2=new KurumsalMusteri("2000000","002","Kemal Deliceli",1500f,"Yalcin");
        MusteriBilgileri kurumsalMusteri3=new KurumsalMusteri("3000000","003","Ege Yalvac",1500f,"Pendik");
        MusteriBilgileri bireyselMusteri4=new BireyselMusteri("4000000","004","Ishak Boyaci",1500f,"Istanbul");
        MusteriBilgileri bireyselMusteri5=new BireyselMusteri("5000000","005","Serdar Koca",1500f,"London");

        HashMap<String,MusteriBilgileri> musteriListesi=new HashMap<>();
        musteriListesi.put(bireyselMusteri1.getMusteriNo(),bireyselMusteri1);
        musteriListesi.put(kurumsalMusteri2.getMusteriNo(),kurumsalMusteri2);
        musteriListesi.put(kurumsalMusteri3.getMusteriNo(),kurumsalMusteri3);
        musteriListesi.put(bireyselMusteri4.getMusteriNo(),bireyselMusteri4);
        musteriListesi.put(bireyselMusteri5.getMusteriNo(),bireyselMusteri5);
        System.out.println("*************************");
        System.out.println("ATM Uygulamasına Hoşgeldiniz.");
        System.out.println("Kayıtlı Örnek Müşteri Numaraları :001,002...,005");
        System.out.println("*************************");

        while (true){

            System.out.println("(Çıkış için 'q' tuşuna basınız)\nLütfen müşteri numaranızı giriniz: ");

            Scanner input =new Scanner(System.in);
            String musteriNoInput =input.nextLine();
            if(musteriNoInput.equals("q") || musteriNoInput.equals("Q")){
                System.out.println("İyi günler dileriz...");
                break;
            }
            else if (musteriListesi.containsKey(musteriNoInput)==true){
                MusteriBilgileri secilenmusteri=musteriListesi.get(musteriNoInput);
                secilenmusteri.ekranaBastir();
                System.out.println("1-Para Yatırma\n2-Para Çekme\nLütfen işlem türü seçiniz:");
                Scanner input1=new Scanner(System.in);
                int islem =input1.nextInt();
                ParaIslemleri paraIslemleri= new ParaIslemleri();
                if(islem==1){

                    paraIslemleri.paraYatir(secilenmusteri);
                }
                else if(islem==2){
                    paraIslemleri.paraCekme(secilenmusteri);
                }

            }else{
                System.out.println("Geçersiz işlem Yaptınız!");
            }


        }
    }
}

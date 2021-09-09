package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String kullaniciAdi="patika", kullaniciSifre="java159", kullaniciSifreYeni, cevap, ad, sifre;
        Scanner kullanici = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        ad = kullanici.nextLine();
        System.out.print("Şifreniz: ");
        sifre = kullanici.nextLine();
     if(sifre.equals(kullaniciSifre) && ad.equals(kullaniciAdi)){
         System.out.print("Giriş Yapıldı !");
     }else
         System.out.print("Yanlış Bilgi Girdiniz! Şifrenizi Yenilemek İster misiniz? ");

     cevap=kullanici.nextLine();
     if (cevap.equals("evet")){
         System.out.print("Yeni Şifre Giriniz: ");
         kullaniciSifreYeni=kullanici.nextLine();
         if (kullaniciSifreYeni.equals(kullaniciSifre) || kullaniciSifreYeni.equals(sifre)){
             System.out.print("Girdiğiniz Şifre Uygun Değil !!");
         }else
             System.out.print("Şifre Kaydedildi !");
     }else
         System.out.print("Yeniden Giriş Yapın.");
    }
}

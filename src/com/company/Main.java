package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sayi1, sayi2, secim;
        float islem;

        Scanner hesap = new Scanner(System.in);

        System.out.print("1. Sayıyı Girin: ");
        sayi1=hesap.nextInt();
        System.out.print("2. Sayıyı Girin: ");
        sayi2=hesap.nextInt();
        System.out.println("(Toplama:1, Çıkarma:2, Çarpma:3, Bölme:4) İşlem Seçiniz: ");
        secim=hesap.nextInt();

        switch (secim){
            case 1 :
                islem = sayi1+sayi2;
                System.out.print("İşem sonucu: "+islem);
                break;
            case 2 :
               islem = sayi1-sayi2;
                System.out.print("İşem sonucu: "+islem);
                break;
            case 3:
                islem = sayi1*sayi2;
                System.out.print("İşem sonucu: "+islem);
                break;
            case 4:
                islem = sayi1/sayi2;
                System.out.print("İşem sonucu: "+islem);
                break;
        }

    }
}

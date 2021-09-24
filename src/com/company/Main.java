package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi;
        Scanner hesapla = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = hesapla.nextInt();
        for (int i = 1; i <= sayi; i++) {
            if (i % 2 == 0)
                System.out.print(i + ",");
        }

        System.out.println("--------------------------");

        int sayi2,say=0,ort=0,toplamI=0;
        Scanner ortalama = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi2 = ortalama.nextInt();
        for (int i=0; i <= sayi2 ; i++){
            if ((i%3 == 0) || (i%4==0)){
                toplamI += i;
                say++;
            }
        }
        ort = toplamI/say;
        System.out.println("Ortalama: "+ort);
    }
}

package com.company;
import  java.util.Scanner;
public class Main {
    static void asalsayi() {
        int sayi, kontrol=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        sayi= scan.nextInt();
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                kontrol = 1;
                break;
            }
        }
        if(kontrol==0) {
            System.out.println("Sayı Asaldır.");
        }else{
            System.out.println("Sayı Asal Değildir!");
        }
    }
    public static void main(String[] args) {
        asalsayi();
    }
}

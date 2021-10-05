package com.company;
import  java.util.Scanner;
public class Main {
    static void uslusayi() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int taban = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int us = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= us; i++) {
            result *= taban;
        }
        System.out.println("Sonuç : " + result);
        uslusayi();
    }
    public static void main(String[] args) {
        uslusayi();
    }
}

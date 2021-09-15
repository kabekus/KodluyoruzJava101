package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sayiA, sayiB, sayiC;
        Scanner sirala = new Scanner(System.in);

        System.out.print("1. Sayıyı Girin: ");
        sayiA=sirala.nextInt();
        System.out.print("2. Sayıyı Girin: ");
        sayiB=sirala.nextInt();
        System.out.print("3 Sayıyı Girin: ");
        sayiC=sirala.nextInt();

        if (sayiA<sayiB && sayiA<sayiC){
            if (sayiB<sayiC){
                System.out.print("1. Sayı < 2. Sayı < 3. Sayı");
            }else{
                System.out.print("1. Sayı < 3. Sayı < 2. Sayı");
            }
        }else if (sayiB<sayiA && sayiB<sayiC){
            if (sayiA<sayiC){
                System.out.print("2. Sayı < 1. Sayı < 3. Sayı");
            }else{
                System.out.print("2. Sayı < 3. Sayı < 1. Sayı");
            }
        }else if (sayiC<sayiA && sayiC<sayiB){
            if (sayiA<sayiB){
                System.out.print("3. Sayı < 1. Sayı < 2. Sayı");
            }else{
                System.out.print("3. Sayı < 2. Sayı < 1. Sayı");
            }
        }else {
            System.out.print("Sayılar Eşit ^_^");
        }

    }
}

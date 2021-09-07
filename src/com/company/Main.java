package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float kilo=0f, boy=0f,vücutKitleIndeksi=0f;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuz (M): ");
        boy=input.nextFloat();
        System.out.print("Kilonuz (Kg): ");
        kilo=input.nextFloat();

        vücutKitleIndeksi = kilo / (boy*boy);
        System.out.print("Vücut Kitle İndeksiniz: " + vücutKitleIndeksi);
    }
}

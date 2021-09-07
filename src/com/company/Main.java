package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int km;
        double kmTutar=2.20, toplam, baslangicUcret=10;

        Scanner taksiMetre = new Scanner(System.in);
        System.out.print("Gidilecek Yolu KM Cinsinden Girin: ");
        km=taksiMetre.nextByte();

        toplam = km*kmTutar;
        toplam += baslangicUcret;

        toplam = (toplam<20) ? 20 : toplam;
        System.out.print("Toplam Ücret: " + toplam);
    }
}

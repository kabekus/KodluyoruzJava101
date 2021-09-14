package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sicaklik;
        Scanner havaDurumu = new Scanner(System.in);

        System.out.print("Sıcaklık Giriniz: ");
        sicaklik=havaDurumu.nextInt();

        if(sicaklik<5){
            System.out.print("Sıcaklık: "+sicaklik+"°"+" Önerilen Etkinlik: Kayak ");
        }else if (sicaklik>=5 && sicaklik<15){
            System.out.print("Sıcaklık: "+sicaklik+"°"+" Önerilen Etkinlik: Sinema");
        }else if (sicaklik>=15 && sicaklik<25){
            System.out.print("Sıcaklık: "+sicaklik+"°"+" Önerilen Etkinlik: Piknik");
        }else {
            System.out.print("Sıcaklık: "+sicaklik+"°"+" Önerilen Etkinlik: Yüzme");
        }
    }
}

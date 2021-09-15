package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int ay, gun;
        Scanner burc = new Scanner(System.in);

        System.out.print("Doğduğunuz Gün: ");
        gun = burc.nextInt();
        System.out.print("Doğduğunuz Ay: ");
        ay = burc.nextInt();

        if (ay ==1){
            if (gun>=22 && gun<=30){
                System.out.print("Burcunuz : Kova");
            }else if (gun>=1 && gun<22) {
                System.out.print("Burcunuz : Oğlak");
            }
        }else if (ay == 2){
            if (gun>=20 && gun<29){
                System.out.print("Burcunuz : Balık");
            }else if (gun>=1 && gun<20) {
                System.out.print("Burcunuz : Kova");
            }
        }else if (ay == 3){
            if (gun>=21 && gun<=31){
                System.out.print("Burcunuz : Koç");
            }else if (gun>=1 && gun<21) {
                System.out.print("Burcunuz : Balık");
            }
        }else if (ay == 4){
            if (gun>=21 && gun<31){
                System.out.print("Burcunuz : Boğa");
            }else if (gun>=1 && gun<21) {
                System.out.print("Burcunuz : Koç");
            }
        }else if (ay == 5){
            if (gun>=22 && gun<=31){
                System.out.print("Burcunuz : İkizler");
            }else if (gun>=1 && gun<22) {
                System.out.print("Burcunuz : Boğa");
            }
        }else if (ay == 6){
            if (gun>=23 && gun<31){
                System.out.print("Burcunuz : Yengeç");
            }else if (gun>=1 && gun<23) {
                System.out.print("Burcunuz : İkizler");
            }
        }else if (ay == 7){
            if (gun>=23 && gun<=31){
                System.out.print("Burcunuz : Aslan");
            }else if (gun>=1 && gun<=21) {
                System.out.print("Burcunuz : Yengeç");
            }
        }else if (ay == 8){
            if (gun>=23 && gun<=31){
                System.out.print("Burcunuz : Başak");
            }else if (gun>=1 && gun<23) {
                System.out.print("Burcunuz : Aslan");
            }
        }else if (ay == 9){
            if (gun>=23 && gun<31){
                System.out.print("Burcunuz : Terazi");
            }else if (gun>=1 && gun<23) {
                System.out.print("Burcunuz : Başak");
            }
        }else if (ay == 10){
            if (gun>=23 && gun<=31){
                System.out.print("Burcunuz : Akrep");
            }else if (gun>=1 && gun<23) {
                System.out.print("Burcunuz : Terazi");
            }
        }else if (ay == 11){
            if (gun>=22 && gun<31){
                System.out.print("Burcunuz : Yay");
            }else if (gun>=1 && gun<22) {
                System.out.print("Burcunuz : Akrep");
            }
        }else if (ay == 12){
            if (gun>=22 && gun<=31){
                System.out.print("Burcunuz : Oğlak");
            }else if (gun>=1 && gun<22) {
                System.out.print("Burcunuz : Yay");
            }
        }


    }
}

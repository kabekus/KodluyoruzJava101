package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int kenarA, kenarB, kenarC, alan, u;
        Scanner kenar = new Scanner(System.in);
        System.out.print("A kenarı: ");
        kenarA = kenar.nextInt();
        System.out.print("B kenarı: ");
        kenarB = kenar.nextInt();
        System.out.print("C kenarı: ");
        kenarC = kenar.nextInt();
        u = (kenarA+kenarB+kenarC)/2;
        alan= (int) Math.sqrt(u*(u-kenarA)*(u-kenarB)*(u-kenarC));
        System.out.print("Belirlediğiniz Üçgenin Alanı: "+alan);
    }
}

package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat, fizik, kimya, turkce;
        Scanner not = new Scanner(System.in);

        System.out.print("Matematik Ders Notu : ");
        mat = not.nextInt();

        System.out.print("Fizik Ders Notu : ");
        fizik = not.nextInt();

        System.out.print("Kimya Ders Notu : ");
        kimya = not.nextInt();

        System.out.print("Türkçe Ders Notu : ");
        turkce = not.nextInt();

        double ort = (mat+fizik+kimya+turkce)/4;
        System.out.print("Ortalamanız: " + ort);

        String durum = ort>60 ? " Geçti" : " Kaldı";
        System.out.println(durum);

    }
}

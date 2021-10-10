package com.company;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double[] harmonicList = {9,8,7,6,5,4};
        double harmonicSerieTotal =0.0;
        double harmonicSerieAvarage;
        for (double j : harmonicList) {
            harmonicSerieTotal += (1 / j);
        }
        harmonicSerieAvarage = harmonicList.length / harmonicSerieTotal;
        System.out.println("Harmonik Seri Toplamı: " + harmonicSerieTotal);
        System.out.println("Harmonik Seri Ortalaması: " + harmonicSerieAvarage);
    }
}

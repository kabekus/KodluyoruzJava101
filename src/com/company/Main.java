package com.company;
import  java.util.Scanner;
import  java.lang.Math;
public class Main {

    public static void main(String[] args) {

        int n,k,total=1;
        Scanner inp= new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayıyı Girin: ");
        n= inp.nextInt();
        System.out.print("Üs Olacak Sayıyı Girin: ");
        k= inp.nextInt();

        for( int i=1; i<=k; i++){

            total *= n;
        }
        System.out.print("cevap: "+ total);
    }
}

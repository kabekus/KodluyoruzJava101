package com.company;
import  java.util.Scanner;
import  java.lang.Math;
public class Main {

    public static void main(String[] args) {

       int sayi ,islem=0,kuvvet4=0,kuvvet5=0;
        Scanner kuvvet = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = kuvvet.nextInt();

        for (int i=0; i<=sayi ; i++){

            /*islem= (int) Math.pow(2,i);
            System.out.println(islem+",");*/

            kuvvet4=(int) Math.pow(4,i);
            kuvvet5=(int)Math.pow(5,i);
            System.out.print(kuvvet4+",");
            System.out.println(kuvvet5+",");
        }

    }

}

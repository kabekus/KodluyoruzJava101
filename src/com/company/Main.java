package com.company;
import  java.util.Scanner;
import  java.lang.Math;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :  ");
        int number = input.nextInt(),basNumber = 0,tempNumber = number,basValue=0,total=0;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }
        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber%10;
            System.out.println(basValue);
            tempNumber/=10;
            total+=basValue;
        }
        System.out.println("Basamak toplamları: "+total);

    }
}

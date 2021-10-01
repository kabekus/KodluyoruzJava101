package com.company;
import  java.util.Scanner;
import java.lang.ArithmeticException;
public class Main {

    public static void main(String[] args) {
        int tekrar, sayi,max=0, min=0;

        Scanner maxmin = new Scanner(System.in);
        System.out.print("Kaç Sayı Gireceksiniz: ");
        tekrar = maxmin.nextInt();


        for (int i=1;i<=tekrar;i++){
            System.out.print(i+". Sayı: ");
            sayi = maxmin.nextInt();

            if (sayi>=max ){
                max=sayi;

            }else if (sayi<max && sayi<=min){
                min=sayi;
            }
        }
        System.out.print("En büyük: "+ max + " En küçük: " + min);

    }
}

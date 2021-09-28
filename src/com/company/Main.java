package com.company;
import  java.util.Scanner;
import java.lang.ArithmeticException;
public class Main {

    public static void main(String[] args) {

        int sayi1, sayi2,ebob=1;
        Scanner islem =new Scanner(System.in);

        System.out.print("Küçük Sayı: ");
        sayi1=islem.nextInt();
        System.out.print("Büyük Sayı: ");
        sayi2=islem.nextInt();

        for (int i=1; i<=sayi1 ; i++){
            if ((sayi1%i==0) && (sayi2%i==0)){
                ebob = i;
            }
        }
        System.out.println("EBOB(1): "+ebob);

        System.out.println("*********************");

        for (int j=sayi1; j>=1 ; j--){
            if ((sayi1%j==0) && (sayi2%j==0)){
                ebob = j;
                break;
            }
        }
        System.out.println("EBOB(2): "+ebob);

        System.out.println("EKOK ***********************");

        for (int i=1 ; i<=(sayi1*sayi2); i++){
            if ((i%sayi1==0) && (i%sayi2==0)){
                System.out.println(i);
                break;
            }
        }
        System.out.println("***********************");
        System.out.println((sayi1*sayi2)/ebob);
    }
}

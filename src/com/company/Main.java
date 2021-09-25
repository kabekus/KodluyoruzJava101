package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       int number, total=0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Sayı Girin: ");
            number = input.nextInt();
            if (number%2==1){
                total+=number;
            }
        }while(number>0);

        System.out.print("Toplam Sayı: "+total);


     /*
     Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
     girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
     */
        int number1, total1=0;
        Scanner input1 = new Scanner(System.in);

        do{
            System.out.print("Sayı Girin: ");
            number1 = input1.nextInt();

            if (number1%4==0){
                total1 += number1;
            }
        }while(number1%2==0);
        System.out.print("Toplam Sayı: "+total1);
    }

}

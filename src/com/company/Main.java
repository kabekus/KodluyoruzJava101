package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int fizikNot, matematikNot, kimyaNot, turkceNot, notOrtalama;
        Scanner not = new Scanner(System.in);

        System.out.print("Fizik Not: ");
        fizikNot= not.nextInt();
        System.out.print("Matematik Not: ");
        matematikNot= not.nextInt();
        System.out.print("Kimya Not: ");
        kimyaNot= not.nextInt();
        System.out.print("Türkçe Not: ");
        turkceNot= not.nextInt();

        notOrtalama= (fizikNot+matematikNot+kimyaNot+turkceNot)/4;

        if(notOrtalama>0 && notOrtalama<55){
            System.out.print("Not Ortalamanız: "+notOrtalama+" Kaldınız !");
        }else if (notOrtalama>=55 && notOrtalama<=100){
            System.out.print("Not Ortalamanız: "+notOrtalama+" Tebrikler Geçtiniz !");
        }else {
            System.out.print("Girdiğiniz Notları Kontrol ediniz!" );
        }
    }
}

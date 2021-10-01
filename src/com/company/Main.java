package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int kontrol=0;
        for (int i=2 ;i<=100;i++){
            for (int j=2;j<i;j++){
                if (i/j==0){
                        kontrol=1;
                        break;
                }
            }
            if (kontrol==0){
                System.out.print(i+" ");
            }
        }

    }
}

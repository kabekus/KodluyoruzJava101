package com.company;
import  java.util.Scanner;
import java.lang.ArithmeticException;
public class Main {

    public static void main(String[] args) {
        Scanner diamond = new Scanner(System.in);
        System.out.print("Üçgen: ");
        int star = diamond.nextInt();

        for (int i = 1; i <= star; i++) {
            for (int j = 0; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int k = (2*star)-3; k >= (2 * i)-1 ; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

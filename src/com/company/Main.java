package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int yil;

        Scanner artikYil = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        yil=artikYil.nextInt();

        //artık yıl olup olmadığının kontrolü

        // If else:
        if (yil%4==0){
            System.out.println(yil+" yılı ARTIK YIL !");
        }else {
            System.out.println(yil+" yılı ARTIK YIL DEĞİL !");
        }

        // Switch Case:
        int artikMi = yil%4 ;

        switch (artikMi){
            case 0:
                System.out.println(yil+" yılı Artık Yıl !");
                break;
            default:
                System.out.println(yil+" yılı Artık Yıl Değil !");
                break;
        }

    }
}

package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int r, a;
        float pi =3.14f, daireDilimAlanı;

        Scanner daire = new Scanner(System.in);

        System.out.print(" Yarıçap değeri girinz: ");
        r=daire.nextInt();

        System.out.print(" Açı giriniz: ");
        a=daire.nextInt();

        daireDilimAlanı = (pi*(r*r)*a)/360;
        System.out.print("Daire dilimi alanı: "+ daireDilimAlanı);
    }
}

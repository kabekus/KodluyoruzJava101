package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float armutFiyat=2.14f, elmaFiyat=3.67f, domatesFiyat=1.11f,
                muzFiyat=0.95f, patlicanFiyat=5, toplamTutar;
        int armut, elma, domates, muz, patlican;

        Scanner manav = new Scanner(System.in);
        System.out.print("Armut (Kg):");
        armut=manav.nextInt();
        System.out.print("Elma (Kg):");
        elma=manav.nextInt();
        System.out.print("Domates (Kg):");
        domates=manav.nextInt();
        System.out.print("Muz (Kg):");
        muz=manav.nextInt();
        System.out.print("Patlıcan (Kg):");
        patlican=manav.nextInt();

        toplamTutar = (armut*armutFiyat)+(elma*elmaFiyat)+(domates*domatesFiyat)+(muz*muzFiyat)+(patlican*patlicanFiyat);
        System.out.print("Toplam Ödenecek Tutar: " + toplamTutar);
    }
}

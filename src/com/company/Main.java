package com.company;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Employe personel = new Employe("Kabe Kuş",950 ,30 ,2019);
        personel.printPerson();
        Employe personel2 = new Employe("Cemile Keklik",2500 ,45 ,2000);
        personel2.printPerson();
    }
}

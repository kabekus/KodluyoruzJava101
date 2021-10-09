package com.company;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Course algoritma = new Course("Algoritma", "Alg101", "ALG");
        Course donanim = new Course("Donanım", "Dn101", "DNNM");

        Teacher t1 = new Teacher("Ahmet Hoca", "90550000000", "ALG");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "DNNM");

        algoritma.addTeacher(t1);
        donanim.addTeacher(t2);

        Student s1 = new Student("Kabe Kuş", 4,"21100903",algoritma,donanim);
        s1.addBulkExamNote(70,65,90,60);
        s1.isPass();

    }
}

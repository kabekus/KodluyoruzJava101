package com.company;
public class Student {
    String name,stuNo;
    int classes;
    Course algoritma;
    Course donanim;
    double avarage;
    boolean isPass;

    Student(String name, int classes,String stuNo,Course algoritma, Course donanim){
        this.name = name;
        this.classes=classes;
        this.stuNo=stuNo;
        this.algoritma=algoritma;
        this.donanim=donanim;
        calcAvarage();
        this.isPass=false;
    }

    public void addBulkExamNote(int algoritma, int donanim,int sozlu1,int sozlu2) {

        if (algoritma >= 0 && algoritma <= 100) {
            this.algoritma.note = algoritma;
            this.algoritma.sozluNot = sozlu1;
        }

        if (donanim >= 0 && donanim <= 100) {
            this.donanim.note = donanim;
            this.donanim.sozluNot=sozlu2;
        }
    }

    public void isPass() {
        if (this.algoritma.note == 0 || this.donanim.note == 0){
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.algoritma.note*0.80)+ (this.algoritma.sozluNot*0.20)) +
                        ((this.donanim.note*0.80)+ (this.donanim.sozluNot*0.20)))  / 2;

    }
    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Algoritma Notu : " + this.algoritma.note);
        System.out.println("Donanım Notu : " + this.donanim.note);
        System.out.println("Algoritma sözlüsü : " + this.algoritma.sozluNot);
        System.out.println("Donanım Sözlüsü : "+this.donanim.sozluNot);
    }
}

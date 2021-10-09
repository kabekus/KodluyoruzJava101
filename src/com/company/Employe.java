package com.company;
public class Employe {
    String name;
    int salary, workHours, hireYear;

    public Employe(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    void tax(){
        double taxSalary;
        if (this.salary>=1000){
            taxSalary=(this.salary*0.03);
            System.out.println("Maaşa uygulanacak vergi: "+taxSalary);
        }else {
            System.out.println("Maaşınıza vergi uygulanmadı!");
        }
    }
    void bonus(){
        if (this.workHours>=40){
            int overtimeWage = (this.workHours-40)*30;
            System.out.println("Mesai ücretiniz: "+ overtimeWage);
        }
    }

    void raiseSalary(){
        int year = 2021 - this.hireYear;
        double extra;
        if (year<10){
            extra= this.salary*0.05;
            System.out.println("Çalışma yılına göre maaş zammı: "+extra);
        }else if (year>9 && year<20){
            extra= this.salary*0.10;
            System.out.println("Çalışma yılına göre maaş zammı: "+extra);
        }else if (year>19){
            extra= this.salary*0.15;
            System.out.println("Çalışma yılına göre maaş zammı: "+extra);
        }
    }
    void printPerson(){
        System.out.println("Personel Adı Soyadı: "+this.name);
        System.out.println("Personel Maaşı: "+this.salary);
        System.out.println("Personelin Haftalık Çalışma Saati: "+this.workHours);
        System.out.println("Personelin İşe Başlangıç Yılı : "+this.hireYear);
        tax();
        bonus();
        raiseSalary();
        System.out.println("*****************************");
    }

}

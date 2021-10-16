package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Oyunun satır uzunluğunu giriniz : ");
        int row= scan.nextInt();
        System.out.print("Oyunun sütun uzunluğunu giriniz : ");
        int column=scan.nextInt();

        if(column>=3&&row>=3){
            MineSweeper m=new MineSweeper(row, column);
            // m.print();
            m.run();
        }else{
            System.out.println("satır ve sütun 3 veya daha büyük olmalıdır");
        }
        scan.close();
    }
}

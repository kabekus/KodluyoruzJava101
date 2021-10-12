package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        System.out.print("Dizi boyutunu girin: ");
        int size = array.nextInt();
        int[] personList=new int[size];

        System.out.println("Dizinin elemanlarını girin");
        for (int i=0; i<personList.length;i++){
            System.out.print(+i+". eleman: ");
            int value=array.nextInt();
           personList[i] = value;
        }
        Arrays.sort(personList);
        System.out.print(Arrays.toString(personList));
    }
}

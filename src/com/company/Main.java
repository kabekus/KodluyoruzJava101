package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] dizi = {9,13,51,88,60,13,64,10,10,13,88,60};
        System.out.println("Dizi: "+ Arrays.toString(dizi));
        frequency(dizi,dizi.length);
    }
    static void frequency(int[] arr,int length){
        boolean[] dizi = new boolean[length];
        Arrays.fill(dizi,false);

        System.out.println("Tekrar Sayıları");
        for(int i=0;i<length;i++){
            if(dizi[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<length;j++){
                if(arr[i]==arr[j]){
                    dizi[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+" sayısı "+count+" kere tekrar edildi");
        }
    }
}

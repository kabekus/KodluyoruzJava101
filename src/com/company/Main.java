package com.company;
import  java.util.Scanner;
import  java.lang.Math;
public class Main {

    public static void main(String[] args) {
        int sayi,total1=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Girin :" );
        sayi= scan.nextInt();

        for(int i=1; i<=sayi; i++){

            total1*= i;
        }
        System.out.print(sayi+ ". Faktöriyel: "+total1 );


        //Ödev

        int a,n,r,totaln=1,totalr=1,total=0, totala=1;
        Scanner input = new Scanner(System.in);
        System.out.print("N Girin :" );
        n= input.nextInt();
        System.out.print("R Girin :" );
        r= input.nextInt();

        for( int i=1; i<=n; i++){
            totaln *=i;
        }
        for(int j=1; j<=r; j++){
            totalr *=j;
        }
        a=(n-r);

        for( int k=1; k<=a; k++){

            totala *=k;
        }
        total=(totaln / (totalr * totala)) ;
        System.out.print( n+"in" + r+"'li"+ " Kombinasyonu: "+ total);
    }


}

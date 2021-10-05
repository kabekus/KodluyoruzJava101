package com.company;
import  java.util.Scanner;
public class Main {
    static int besCikar(int n, boolean dNoktasi, int sayac) {

        /*
         n = Kullanıcının girmiş olduğu sayı.

         dNoktasi = Sayının 0'a eşit veya küçük olmasının kontrolünü yapan değişken. Girilen sayı sıfırdan büyük
         olacağından HER ZAMAN "TRUE"

         sayac = 0 veya -(eksi) değerden önce ekrana basılan sayıların sayısı. Sayaç değişkeni kullanıcıdan alınan
         n değerine bağlı olarak metot içerisinde değişebilir. Ancak başlangıç değeri HER ZAMAN "0" (sıfır) olmalıdır.


         Örnek: 7 2 0 2 7 -> 0'dan önce 2 sayı var (7 ve 2).
         Sayac değişkeni ile n sayısı artırlmaya başlandığında serinin sonsuza gitmesi engellenecek.
        */

        if (dNoktasi) {
            if (n > 0) {
                System.out.print(n + " ");
                sayac++;
                return besCikar(n - 5, true, sayac);
            } else {
                return besCikar(n, false, sayac);
            }
        } else {
            System.out.print(n + " ");
            if (sayac > 0) {
                sayac--;
                return besCikar(n + 5, false, sayac);
            } else {
                return 0;
            }
        }

    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        n = input.nextInt();

        System.out.print("Çıktısı : ");
        besCikar(n, true, 0);

    }
}

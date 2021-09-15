package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Tanımlama
        int mesafe, yas, tip;
        double mesafeUcreti=0.10,normalTutar,indirimliTutar,yasIndirim,tipTutar=0.20, tipIndirim;

        //Kullanıcıdan veri alma ve değişkenlere atama.
        Scanner bilet = new Scanner(System.in);
        System.out.print("Gideceğiniz Mesafe (KM): ");
        mesafe = bilet.nextInt();
        System.out.print("Yaşınız: ");
        yas = bilet.nextInt();
        System.out.print("Yolculuk Tipi (1:Tek Yön, 2:Gidiş-Dönüş): ");
        tip = bilet.nextInt();

        //Bilet ücreti hesaplama
        normalTutar=mesafe*mesafeUcreti;
        if(mesafe>0 && yas>0){
            if (yas<=12){
                switch (tip){
                    case 1:
                        yasIndirim=(normalTutar*50)/100;
                        indirimliTutar=normalTutar-yasIndirim;
                        System.out.print("%50 indirim. Fiyat: "+indirimliTutar+" ₺");
                        break;
                    case 2:
                        yasIndirim=(normalTutar*50)/100;
                        indirimliTutar=normalTutar-yasIndirim;
                        tipIndirim=indirimliTutar*tipTutar;
                        System.out.print("%50+%20 indirim. Fiyat: "+tipIndirim+" ₺");
                        break;
                }
            }else if (yas>12 && yas<=24){
                switch (tip){
                    case 1:
                        yasIndirim=(normalTutar*10)/100;
                        indirimliTutar=normalTutar-yasIndirim;
                        System.out.print("%10 indirim. Fiyat: "+indirimliTutar+" ₺");
                        break;
                    case 2:
                        yasIndirim=(normalTutar*10)/100;
                        indirimliTutar=normalTutar-yasIndirim;
                        tipIndirim=indirimliTutar*tipTutar;
                        System.out.print("%10+%20 indirim. Fiyat: "+tipIndirim+" ₺");
                        break;
                }
            }else if (yas>=65){
                switch (tip){
                    case 1:
                        yasIndirim=(normalTutar*30)/100;
                        indirimliTutar=normalTutar-yasIndirim;
                        System.out.print("%30 indirim. Fiyat: "+indirimliTutar+" ₺");
                        break;
                    case 2:
                        yasIndirim=(normalTutar*30)/100;
                        indirimliTutar=normalTutar-yasIndirim;
                        tipIndirim=indirimliTutar*tipTutar;
                        System.out.print("%30+%20 indirim. Fiyat: "+tipIndirim+" ₺");
                        break;
                }
            }else if (tip==2){
                indirimliTutar=normalTutar*tipTutar;
                System.out.print("%20 indirim. Fiyat: "+indirimliTutar+" ₺");
            }else {
                System.out.print("Fiyat: "+normalTutar+" ₺");
            }
        }else {
           System.out.print("Hatalı Değer Girdiniz !");
        }
    }
}

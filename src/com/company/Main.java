package com.company;
import  java.util.Scanner;
import  java.lang.Math;
public class Main {

    public static void main(String[] args) {
        String kullaniciAdi, sifre;
        int hak=3, secim, bakiye=1500, para;

       while (hak>0){
           Scanner atm = new Scanner(System.in);

           System.out.print("Kullanıcı Adınız: ");
           kullaniciAdi = atm.nextLine();
           System.out.print("Şifreniz: ");
           sifre = atm.nextLine();

           if (kullaniciAdi.equals("patika") && sifre.equals("dev123")){
               System.out.println("Kodluyoruz Bankasına Hoşgeldiniz ^_^");
               do {
                   System.out.println("Yapmak istediğiniz işlemi seçin: \n" +
                           "1-Para Yatırma \n" +
                           "2-Para Çekme \n" +
                           "3-Bakiye Sorgula \n"+
                           "4-Çıkış \n");
                   secim = atm.nextInt();

                   switch (secim){

                       case 1:
                        System.out.println("Yatırılacak Tutar: ");
                        para = atm.nextInt();
                        bakiye+=para;
                           System.out.println("İşlem tamamlandı.Bakiyeniz: "+bakiye);
                        break;

                        case 2:
                            System.out.println("Çekilecek Tutar: ");
                            para = atm.nextInt();
                            if (bakiye < para) {
                                System.out.print("Yetersiz Bakiye !");
                            }else {
                                bakiye -= para;
                                System.out.println("İşlem tamamlandı.Bakiyeniz: "+bakiye);
                            }
                        break;
                        case 3:
                            System.out.println("Bakiyeniz: "+bakiye);
                            break;
                   }
               }while (secim != 4);
               System.out.print("Tekrar Görüşmek Üzere ^_^");
               break;
           }else{
               --hak;
               System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar Deneyin");
               if (hak == 0){
                   System.out.println("Kullanıcı kimliğiniz bloke oldu. Banka ile ilatişime geçin.");
               }else{
                   System.out.println("Kalan hakkınız: "+ hak);
               }
           }
       }
    }
}

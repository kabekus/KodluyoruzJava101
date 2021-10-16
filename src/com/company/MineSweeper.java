package com.company;
import java.util.Scanner;

public class MineSweeper {
    String[][] matris;
    int row;
    int column;
    boolean isWin = false;
    int mineNum;

    // **************************** oyunu kur ve sahayı hazırla
    MineSweeper(int row, int column) {

        this.row = row;
        this.column = column;
        // Matris  iki boyutlu dizisi ataması yapılır
        this.matris = new String[this.row][this.column];
        this.mineNum = (this.row * this.column) / 4;
        for (int i = 0; i < this.matris.length; i++) {
            for (int j = 0; j < this.matris[i].length; j++) {
                this.matris[i][j] = "-"; // çoklu dizi içindeki tüm konumlar "-" ile atanır
            }
        }
        //her oyun başlatıldığında rasgele konumlara toplam
        // konumların çeyreği kadar  mayınlar "*" atanır
        for (int i = 0; i < mineNum; i++) {
            int mineRow = (int) (Math.random() * this.row);
            int mineColumn = (int) (Math.random() * this.column);
            if (!this.matris[mineRow][mineColumn].equals("*")) {
                this.matris[mineRow][mineColumn] = "*";
            } else {
                i--;
            }
        }

    }

//******************************** Oyunu çalıştır

    void run() {


        Scanner scan = new Scanner(System.in);
        int count = 0;
        do {
            System.out.print("Lütfen satır numarasını giriniz : ");
            int selectRow = scan.nextInt();

            System.out.print("Lütfen sütun numarasını giriniz : ");
            int selectColumn = scan.nextInt();

            if (((selectRow < 0) || (selectRow > (this.matris.length - 1)) || (selectColumn < 0) || (selectColumn > (this.matris[0].length - 1)))) {// oyun içinde seçilen satır ve sütün sayıların legal olup olmadığını değerlendirir.

                System.out.println("hatalı satır veya sütun numarası girdiniz");
            } else {
                if (checkMine(selectRow, selectColumn) == false) {// checkMine metodu ile seçilen konumun mayınlı olup olmadığına bakar.
                    // Eğer mayın varsa, oyun biter ve oyunce yenilir.

                    System.out.println("Oyunu Kaybettiniz!");
                    isWin = true; //do while dongusunden çıkmak için isWin true olarak atanır.
                } else {
                    if (checkSelect(selectRow, selectColumn)) {// checkSelect ile daha önce seçilen konum tekrar seçilmemesi sağlanır.

                        this.matris[selectRow][selectColumn] = "" + countMine(selectRow, selectColumn);
                        // counMine ile seçilen konum etrafındaki mayın sayısı belirlenir ve o konuma sayı atanır.
                        count++;//count değişkeni kaç tane konum seçildiğini hesaplar.
                        if (count == ((this.matris.length * this.matris[0].length) - this.mineNum)) {
                            //burda count değişkeni matris değikeni içersinde mayın olmayan toplam konum sayısı ile kıyaslanır.
                            // Eğer eşitse mayın hariç tüm konumlar seçilmiş demektir oyuncu oyunu kazanır.
                            System.out.println("Oyunu kazandınız!");
                            isWin = true; //do wile döngüsünden çıklır
                        }
                    } else {
                        System.out.println("daha önce satır ve sütun numaraları girilmiştir!");
                    }
                }
            }
            printCurrent(this.matris);//her aşamada oyunun guncel durumunu yazdırır.
        } while (!isWin);

        scan.close();

    }

    //************************************ belirtilen nokta etrafondaki mayın sayısını hesapla
    int countMine(int row, int column) {

        //  row=0 column=0 row=this.matris.length-1, column=this.matris[0].length-1
        int count = 0;
        if (row >= 0 && row <= (this.matris.length - 1) && column >= 0 && column <= (this.matris[0].length - 1)) {

            //     row-, column-/ row-, colum,/ row-, column+
            //     row, column-/row, cloumn/ row, column+
            //     row+, column-/ row+ , column,/ row+, column+

            //     123
            //     456
            //     789
            //
            if (row == 0 && column == 0) {

                if (!checkMine(row, column + 1)) {
                    count++;
                }

                if (!checkMine(row + 1, column)) {
                    count++;
                }
                if (!checkMine(row + 1, column + 1)) {
                    count++;
                }
            } else if (row == 0) {
                if (column == this.matris[0].length - 1) {

                    if (!checkMine(row, column - 1)) {
                        count++;
                    }
                    if (!checkMine(row + 1, column - 1)) {
                        count++;
                    }
                    if (!checkMine(row + 1, column)) {
                        count++;
                    }

                } else {

                    if (!checkMine(row, column - 1)) {
                        count++;
                    }
                    if (!checkMine(row, column + 1)) {
                        count++;
                    }
                    if (!checkMine(row + 1, column - 1)) {
                        count++;
                    }
                    if (!checkMine(row + 1, column)) {
                        count++;
                    }
                    if (!checkMine(row + 1, column + 1)) {
                        count++;
                    }
                }

            } else if (column == 0) {
                if (row == this.matris.length - 1) {


                    if (!checkMine(row - 1, column)) {
                        count++;
                    }
                    if (!checkMine(row - 1, column + 1)) {
                        count++;
                    }

                    if (!checkMine(row, column + 1)) {
                        count++;
                    }

                } else {

                    if (!checkMine(row - 1, column)) {
                        count++;
                    }
                    if (!checkMine(row - 1, column + 1)) {
                        count++;
                    }

                    if (!checkMine(row, column + 1)) {
                        count++;
                    }

                    if (!checkMine(row + 1, column)) {
                        count++;
                    }
                    if (!checkMine(row + 1, column + 1)) {
                        count++;
                    }
                }

            } else if (row == this.matris.length - 1 && column == this.matris[0].length - 1) {
                if (!checkMine(row - 1, column - 1)) {
                    count++;
                }
                if (!checkMine(row - 1, column)) {
                    count++;
                }

                if (!checkMine(row, column - 1)) {
                    count++;
                }
            } else if (row == this.matris.length - 1) {
                if (!checkMine(row - 1, column - 1)) {
                    count++;
                }
                if (!checkMine(row - 1, column)) {
                    count++;
                }
                if (!checkMine(row - 1, column + 1)) {
                    count++;
                }
                if (!checkMine(row, column - 1)) {
                    count++;
                }
                if (!checkMine(row, column + 1)) {
                    count++;
                }
            } else if (column == this.matris[0].length - 1) {
                if (!checkMine(row - 1, column - 1)) {
                    count++;
                }
                if (!checkMine(row - 1, column)) {
                    count++;
                }
                if (!checkMine(row, column - 1)) {
                    count++;
                }
                if (!checkMine(row + 1, column - 1)) {
                    count++;
                }
                if (!checkMine(row + 1, column)) {
                    count++;
                }
            } else {

                if (!checkMine(row - 1, column - 1)) {
                    count++;
                }
                if (!checkMine(row - 1, column)) {
                    count++;
                }
                if (!checkMine(row - 1, column + 1)) {
                    count++;
                }
                if (!checkMine(row, column - 1)) {
                    count++;
                }
                if (!checkMine(row, column + 1)) {
                    count++;
                }
                if (!checkMine(row + 1, column - 1)) {
                    count++;
                }
                if (!checkMine(row + 1, column)) {
                    count++;
                }
                if (!checkMine(row + 1, column + 1)) {
                    count++;
                }
            }

        }
        return count;
    }

    // *********************************** Belirtilen yerde mayın var mı yok mu?
    boolean checkMine(int row, int column) {

        if (this.matris[row][column].equals("*")) {
            System.out.println();
            return false;
        }
        return true;
    }
//************************************ Daha önce secildi mi

    boolean checkSelect(int row, int column) {
        if (this.matris[row][column].equals("-") || this.matris[row][column].equals("*")) {
            return true;
        }
        return false;
    }
// *************************************Oyun sahasını yazdır
    //  void print(){
    //      for(String[] arr: this.matris){
    //          for(String s: arr){
    //              System.out.print(s);
    //          }
    //          System.out.println();
    //      }
    //  }
//****************************** Güncel durumu yazdır

    void printCurrent(String[][] curArr) {

        String[][] newArr = new String[curArr.length][curArr[0].length];
        for (int i = 0; i < curArr.length; i++) {
            for (int j = 0; j < curArr[0].length; j++) {
                newArr[i][j] = curArr[i][j];
                if (newArr[i][j].equals("*")) {
                    newArr[i][j] = "-";
                }
                System.out.print(newArr[i][j]);
            }
            System.out.println();
        }

    }
}


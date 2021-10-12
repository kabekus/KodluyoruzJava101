package com.company;
public class Main {
    public static boolean isFind(int[] arr,int value){
        for (int i :arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] numList={9,13,51,88,60,13,64,10,10,13,88,60};
        int[] repeatList=new int[numList.length];
        int startIndex = 0;
        for (int i=0 ; i<numList.length ; i++) {
            for (int j = 0; j < numList.length; j++) {
                if ((i != j) && (numList[i] == numList[j])) {
                    if (!isFind(repeatList, numList[i])) {
                        if (numList[i]%2==0){
                            repeatList[startIndex++] = numList[i];
                        }

                    }
                    break;
                }
            }
        }
        for (int value :repeatList){
            if (value!=0){
                System.out.print(value+",");
            }
        }
    }
}

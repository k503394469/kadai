package jp.edodai.i17811lj;

import java.util.Random;

public class InsertSort {
    public static void main(String[] args) {
        Random r=new Random();
        Integer[] arr=new Integer[10];
        for (int e=0;e<arr.length;e++){
            arr[e]=r.nextInt(9)+1;
        }
        show(arr);
        /**
         * InsertSort
         */
        for (int i=0;i<arr.length;i++){
            for (int j=i;j>0;j--){
                if (arr[j-1]<arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }else {
                    break;
                }
            }
        }
        show(arr);
    }
    static void show(Integer []arr){
        for (int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"]"+"="+arr[i]);
        }
        System.out.println();
    }
}

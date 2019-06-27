package jp.edodai.i17811lj;

import java.util.Random;

public class ArrayTest {
    public static void main(String[] args) {
        Integer [] arr=new Integer[5];
        int sum = 0;
        Random r=new Random();
        for (int i=0;i<arr.length;i++){
            int temp=r.nextInt(50)+1;
            arr[i]=temp;
            System.out.println(arr[i]);
        }
        for (int j=0;j<arr.length;j++){
            sum+=arr[j];
        }
        System.out.println("sum="+sum);
    }
}

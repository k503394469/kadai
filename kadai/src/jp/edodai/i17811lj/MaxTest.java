package jp.edodai.i17811lj;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

import java.util.Random;

public class MaxTest {
    public static void main(String[] args) {
        Integer[] arr = new Integer[4];

        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int temp = r.nextInt(50) + 1;
            arr[i] = temp;
            System.out.println("arr[" + i + "]=" + arr[i]);
        }

        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        System.out.println("max=" + max);
    }

    @Test
    public void r() {
        RandomStringUtils r = new RandomStringUtils();
        System.out.println(r.random(6, false, true));
    }
}


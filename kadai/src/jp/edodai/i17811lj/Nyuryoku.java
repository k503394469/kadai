package jp.edodai.i17811lj;

import java.util.Scanner;

public class Nyuryoku {

    static int seisuu() {
        int x = 0;
        System.out.println("xを入力");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        return x;
    }

    static double jisuu() {
        double y = 0;
        System.out.println("yを入力");

        Scanner scanner = new Scanner(System.in);
        y = scanner.nextDouble();
        if (y == 0)
            System.out.println("yは0にしてはならない");
        return y;
    }
}

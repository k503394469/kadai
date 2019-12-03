package jp.edodai.i17811lj;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Jyanken extends JFrame {
    public static void main(String[] args) {
        int you = 0, com=0;
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("コンピュータとジャンケン対決！");
            System.out.println("ジャンケンポン！(グー=1 チョキ=2 パー=3)");
            try {
                String line = in.readLine();
                you = Integer.parseInt(line);
                if (you>3||you<1){
                    System.out.println("1~3の中の一つを入力してください");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("エラーが発生しました。");
                System.exit(0);
            }
            com = (int)(Math.random()*3+1);
            System.out.println("コンピュータは、" + com + "です。");
            if (you == com) {
                System.out.println("あいこ！");
            } else if ((you == 1 && com == 2) || (you == 2 && com == 3) || (you == 3 && com == 1)) {
                System.out.println ("あなたの勝ち！");
            } else {
                System.out.println ("あなたの負け！");
            }
        }
    }
}

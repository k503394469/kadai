package jp.edodai.i17811lj;

import java.util.Scanner;

public class Keisan2 {
    public static void main(String[] args) {
        int x=0;
        double y=0;
        boolean flag=true;
        while (flag) {
            try {
                x=seisuu();
                y=jisuu();
                double add=x+y;
                double min=x-y;
                double sa=x*y;
                double de=x/y;
                if (y==0){
                    continue;
                }
                System.out.println("x+y="+(add)+" x-y="+(min)
                        +" x*y="+(sa)+" x/y="+(de));
            }catch (Exception e){
                System.out.println("数字型のデータを入力してください");
                System.out.println("yは0にしてはならない");
                flag=false;
            }
        }
    }
    static int seisuu(){
        return Nyuryoku.seisuu();
    }
    static double jisuu(){
        return Nyuryoku.jisuu();
    }
}

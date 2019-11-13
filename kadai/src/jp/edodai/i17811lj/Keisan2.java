package jp.edodai.i17811lj;

import java.util.Scanner;

public class Keisan2 {
    public static void main(String[] args) {
//        System.out.println(jissuu());
        System.out.println(seisuu());
    }
    static String jissuu(){
        try {
            Nyuryoku nyuryoku=new Nyuryoku();
            nyuryoku.setJ1();
            nyuryoku.setJ2();
            return "j1+j2="+(nyuryoku.getJ1()+nyuryoku.getJ2())+" j1-j2="+(nyuryoku.getJ1()-nyuryoku.getJ2())+" j1*j2="+(nyuryoku.getJ1()*nyuryoku.getJ2())+" j1/j2="+(nyuryoku.getJ1()/nyuryoku.getJ2());
        } catch (Exception e) {
            return "数字を入力してください";
        }
    }
    static String seisuu(){
        try {
            Nyuryoku nyuryoku=new Nyuryoku();
            nyuryoku.setS1();
            nyuryoku.setS2();
            return "S1+S2="+(nyuryoku.getS1()+nyuryoku.getS2())+" S1-S2="+(nyuryoku.getS1()-nyuryoku.getS2())+" S1*S2="+(nyuryoku.getS1()*nyuryoku.getS2())+" S1/S2="+(nyuryoku.getS1()/nyuryoku.getS2());
        } catch (Exception e) {
            return "数字を入力してください";
        }
    }
}

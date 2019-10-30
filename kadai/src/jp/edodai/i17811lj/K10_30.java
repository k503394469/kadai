package jp.edodai.i17811lj;

import java.util.Scanner;

public class K10_30 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //①
//        while (true) {
//            String input = scan.nextLine();
//            if (input.equals(""))
//                break;
//            System.out.println(input);
//        }
        //②
//        StringBuilder sb=new StringBuilder();
//        for (int i=0;i<2;i++){
//            String input = scan.nextLine();
//            sb.append(input+" ");
//        }
//        System.out.println(sb);
        //③
//        int a = 0;
//        int b = 0;
//        try {
//            a = scan.nextInt();
//            b = scan.nextInt();
//            System.out.println(a+b);
//        } catch (Exception e) {
//            System.out.println("数字を入力してください");
//        }
        //④
//        int a = 0;
//        int b = 0;
//        try {
//            a = scan.nextInt();
//            b = scan.nextInt();
//            System.out.println("a+b="+(a+b)+" a-b="+(a-b)+" a*b="+(a*b)+" a/b="+a/b);
//        } catch (Exception e) {
//            System.out.println("数字を入力してください");
//        }
        //⑤
        double a = 0;
        double b = 0;
        try {
            a = scan.nextDouble();
            b = scan.nextDouble();
            System.out.println("a+b="+(a+b)+" a-b="+(a-b)+" a*b="+(a*b)+" a/b="+a/b);
        } catch (Exception e) {
            System.out.println("数字を入力してください");
        }
    }
}

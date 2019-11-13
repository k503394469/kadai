package jp.edodai.i17811lj;

import java.util.Scanner;

public class Nyuryoku {
    Scanner scanner=new Scanner(System.in);
    private Integer s1;
    private Integer s2;
    private double j1;
    private double j2;

    public Integer getS1() {
        return s1;
    }

    public void setS1() {
        Integer s1=scanner.nextInt();
        this.s1 = s1;
    }

    public Integer getS2() {
        return s2;
    }

    public void setS2() {
        Integer s2=scanner.nextInt();
        this.s2 = s2;
    }

    public double getJ1() {
        return j1;
    }

    public void setJ1() {
        double j1=scanner.nextDouble();
        this.j1 = j1;
    }

    public double getJ2() {
        return j2;
    }

    public void setJ2() {
        double j2=scanner.nextDouble();
        this.j2 = j2;
    }
}

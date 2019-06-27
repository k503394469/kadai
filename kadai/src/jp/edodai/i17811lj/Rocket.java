package jp.edodai.i17811lj;

public class Rocket {
    public static void main(String[] args) throws Exception{
        int byou;
        for (byou=10;byou>=1;byou--){
            System.out.println(byou);
            Thread.sleep(1000);
        }
        System.out.println("発射！");
    }

}

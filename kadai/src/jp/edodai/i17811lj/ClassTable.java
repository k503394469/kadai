package jp.edodai.i17811lj;

public class ClassTable {
    public static void main(String[] args) {
        Student[] zemi = {
                new Student("青木", 21, 70, 85),
                new Student("笠谷", 21, 58, 75),
                new Student("佐藤", 20, 89, 65),
                new Student("高野", 23, 62, 43),
                new Student("中田", 21, 90, 96),
                new Student("浜名", 21, 72, 93),
                new Student("間宮", 20, 55, 78),
                new Student("矢沢", 21, 62, 85),
                new Student("羅門", 22, 89, 98),
                new Student("輪島", 22, 70, 75)
        };
        for (Student s:zemi){
            System.out.println(s.name+"の"+"英語＋情報="+s.total());
        }
    }
}

package jp.edodai.i17811lj;

import java.util.LinkedHashMap;

public class RandomFind {
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
        Student student = find(zemi);
        System.out.println("---------英語の順位---------------");
        for (int i=0;i<zemi.length;i++){
            englishBubble(zemi)[i].showInfo();
        }
        System.out.println("---------情報の順位---------------");
        for (int i=0;i<zemi.length;i++){
            infoBubble(zemi)[i].showInfo();
        }
        LinkedHashMap<String, Integer> ranking = ranking(student, zemi);
        System.out.println("情報の順位"+(((int)ranking.get("情報の順位"))+1));
        System.out.println("英語の順位"+(((int)ranking.get("英語の順位"))+1));

    }
    static Student find(Student[]students){
        int randomIndex=(int)(Math.random()*students.length);
        return students[randomIndex];
    }
    static LinkedHashMap<String,Integer> ranking(Student student, Student[]students){
        LinkedHashMap<String,Integer> ranks=new LinkedHashMap<>();
        student=find(students);
        System.out.println("---------学生情報---------------");
        student.showInfo();
        System.out.println();
        students=englishBubble(students);
        for (int i=0;i<students.length;i++){
            if (student.equals(students[i])){

                ranks.put("英語の順位",i);
            }
        }
        students=infoBubble(students);
        for (int i=0;i<students.length;i++){
            if (student.equals(students[i])){
                ranks.put("情報の順位",i);
            }
        }
        return ranks;

    }
    static Student[] englishBubble(Student[] students){
        Integer []rank=null;
        for (int i=0;i<students.length;i++){
            for (int j=0;j<students.length-i-1;j++){
                if (students[j].english<students[j+1].english){
                    Student temp=students[j];
                    students[j]=students[j+1];
                    students[j+1]=temp;
                }
            }
        }
        return students;
    }
    static Student[] infoBubble(Student[] students){
        Integer []rank=null;
        for (int i=0;i<students.length;i++){
            for (int j=0;j<students.length-i-1;j++){
                if (students[j].info<students[j+1].info){
                    Student temp=students[j];
                    students[j]=students[j+1];
                    students[j+1]=temp;
                }
            }
        }
        return students;
    }
}

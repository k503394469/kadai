package jp.edodai.i17811lj;

public class Student extends Person {
    double height;
    double weight;
    int english;
    int math;
    int info;
    public Student(String name,int age,int english,int info){
        super(name,age);
        this.age=age;
        this.info=info;
        this.english=english;
    }
    public Student(String name, int age,double height,double weight,int english,int math,int info){
        super(name, age);
        this.height=height;
        this.weight=weight;
        this.english=english;
        this.math=math;
        this.info=info;
    }
    void showInfo(){
        System.out.println("name:"+name+",age:"+age+",english:"+english+",info:"+info) ;
    }

    public int total(){
        int zo=this.english+this.info;
        return zo;
    }

}

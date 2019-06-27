package jp.edodai.i17811lj;

public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void jump(){
        System.out.println(this.name+"はジャンプします");
    }
    void walk(){
        System.out.println(this.name+"は歩きます");
    }
}

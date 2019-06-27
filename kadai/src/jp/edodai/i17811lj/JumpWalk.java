package jp.edodai.i17811lj;

public class JumpWalk {
    public static void main(String[] args) {
//        Person[] persons=new Person[3];
//        persons[0]=new Person("太郎",5);
//        persons[1]=new Person("次郎",4);
//        persons[2]=new Person("三郎",3);
        Person[] persons = {new Person("太郎", 5),
                new Person("次郎", 4),
                new Person("三郎", 3)};
        Student []students={new Student("田中",20,1.85,70,89,90,95),
        new Student("佐藤",21,1.80,80,90,90,87)};
        for (Person p : persons) {
            p.walk();
            p.jump();
        }
        for (Student s:students){
            s.showInfo();
        }
    }
}

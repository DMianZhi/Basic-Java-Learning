package oop.constructor;

public class Student {
    String name;
    int score;

//    作用：在创造对象的时候会自动定义变量，不用像Test.java的6，7行一样创造，在变量多的时候效果更佳

    //    构造器是一种特殊的方法类型，没有返回类型
    public Student() {
        System.out.println("无参数构造器触发了");
    }

    //有参数的构造器
    public Student(String name, int score) {
        System.out.println("有参数的构造器触发了");
        this.name = name;
        this.score = score;
    }
}

package oop.define;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.chinese = 90.0;
        s1.math = 87.0;
        s1.printScore();
        s1.printAvgScore();

    }

}

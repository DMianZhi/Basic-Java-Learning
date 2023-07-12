package oop.define;

public class Student {
    String name;
    double math;
    double chinese;

    public void printScore() {
        System.out.println(name + "的总成绩是：" + (chinese + math));
    }

    public void printAvgScore() {
        System.out.println(name + "的平均分是：" + (chinese + math) / 2);
    }
}

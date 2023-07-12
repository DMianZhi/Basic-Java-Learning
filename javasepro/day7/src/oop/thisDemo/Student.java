package oop.thisDemo;

public class Student {
    double score;

    public void printThis() {
        System.out.println(this);
    }

    public void printPass(double score) {
        if (this.score > score) {
            System.out.println("通过~~~");
        } else {
            System.out.println("不通过");
        }
    }
}

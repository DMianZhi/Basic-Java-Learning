package d2_staticmethod;

public class Student {
    double score;

    public static void print() {
        System.out.println("hello world");
    }

    public void printPass() {
        System.out.println("成绩：" + (score > 60 ? "通过" : "不通过"));
    }
}

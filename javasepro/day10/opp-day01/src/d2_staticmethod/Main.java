package d2_staticmethod;

public class Main {
    public static void main(String[] args) {
        // 推荐
        Student.print();

        // 不推荐
        Student s1 = new Student();
        s1.print();

        s1.score = 70;
        s1.printPass();
        // Student.printPass();// 报错
    }
}

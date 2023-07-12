package d4_attention;

public class Student {
    double score;
    public static String name;

    public static void print() {
        name = "牛马";
//        System.out.println(score); // 报错，类方法不能访问实例成员
//        print3(); // 报错

        print4();
    }

    public void print3() {
        // 不管是实例还是类都可以访问
        print5();
        // 在同一类下可以省略类名前缀
        print4();
        score = 12;
        name = "张三";
        Student.print4();

    }

    public static void print4() {

    }

    public void print5() {

    }
}

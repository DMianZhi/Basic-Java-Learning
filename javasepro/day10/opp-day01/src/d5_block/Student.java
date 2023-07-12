package d5_block;

public class Student {
    static int age = 12;
    static String name = "牛马";


    static {
        System.out.println("静态代码块执行了");
    }

    {
        System.out.println("创造了对象" + this);
    }

    public Student() {
        System.out.println("无参数的构造器创建了");
    }
}


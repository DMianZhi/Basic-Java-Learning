package oop.constructor;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "牛马";
        s1.score = 80;

        Student s2 = new Student("gmz", 90);
        System.out.println(s2.name);
        System.out.println(s2.score);


//        在Teacher.Java中没有Teacher这个类，
//        但可以调用，因为Java内部会自动生成一个无参的构造器
        Teacher t1 = new Teacher();

//        一旦创造了一个有参数的构造器就不会了，建议手动创建一个无参数的构造器。

    }
}

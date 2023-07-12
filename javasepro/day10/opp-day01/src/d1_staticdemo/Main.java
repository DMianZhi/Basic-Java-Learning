package d1_staticdemo;

public class Main {
    public static void main(String[] args) {
        Student.name = "张三";
        System.out.println(Student.name);

        // 对象.类变量（不推荐）
        Student s1 =new Student();
        s1.name = "李四";
        System.out.println(s1.name);

        Student s2 =new Student();
        s2.name = "王五";
        System.out.println(s2.name);

        System.out.println(s2.name);//王五
        System.out.println(Student.name); //王五

        s1.age = 23;
        s2.age = 20;

        System.out.println(s1.age); //23
//        System.out.println(Student.age); //报错



    }
}
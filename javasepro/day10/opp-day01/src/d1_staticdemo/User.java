package d1_staticdemo;

public class User {
    public static int number;

    public User() {
//        User.number++;
        number++;// 在同一类中访问自己的量，才可以省略类名不写；
    }
}

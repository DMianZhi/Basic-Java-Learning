package String;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("请输入登录名称：");
            String name = sc.next();
            System.out.println("请输入登录密码：");
            String password = sc.next();

            boolean flag = login(name, password);
            if (flag) {
                System.out.println("进入");
                break;
            } else {
                System.out.println("错误，再重试");
                i++;
            }
        }


    }

    public static boolean login(String name, String password) {
        String login = "admin";
        String loginPassword = "123456";
        return login.equals(name) && loginPassword.equals(password);
    }
}

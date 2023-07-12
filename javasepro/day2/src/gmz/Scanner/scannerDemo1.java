package gmz.Scanner;

import java.util.Scanner;

public class scannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的name：");
        String name = sc.next();
        System.out.println("你的name是：" + name);
        System.out.print("请输入你的age：");
        int age = sc.nextInt();
        System.out.println("你的age是：" + age);
    }
}

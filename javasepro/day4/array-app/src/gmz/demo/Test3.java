package gmz.demo;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int[] codes = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("请以此输入五位员工的工号！");
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位员工的工号：");
            int code = sc.nextInt();
            codes[i] = code;
        }
        Random rd = new Random();
        for (int i = 0; i < codes.length; i++) {
            int random = rd.nextInt(codes.length);
            int temp = codes[i];
            codes[i] = codes[random];
            codes[random] = temp;
        }
        System.out.print("随机排序为：");
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i]+" ");
        }
    }
}

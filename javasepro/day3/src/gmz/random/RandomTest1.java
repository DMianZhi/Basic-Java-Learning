package gmz.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest1 {
    public static void main(String[] args) {
        Random rd = new Random();
        int random = rd.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (true) {
            System.out.println("请输入你的要猜的数字：");
            int test = sc.nextInt();
            if (test > random) {
                System.out.println("你猜的数字大了~");
                count++;
            } else if (test < random) {
                System.out.println("你猜的数字小了~");
                count++;
            } else {
                System.out.println("恭喜你，猜对了，一共猜了" + count+"次");
            }
        }
    }
}

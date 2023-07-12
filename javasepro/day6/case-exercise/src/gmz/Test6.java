/*
抢红包
* */

package gmz;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        int[] luckMoney = {10, 50, 666, 899, 999};
        luckMoney(luckMoney);
    }

    public static void luckMoney(int[] luckMoney) {
        Random rd = new Random();
        for (int i = 0; i < luckMoney.length; i++) {
            int random = rd.nextInt(luckMoney.length);
            int temp = luckMoney[random];
            luckMoney[random] = luckMoney[i];
            luckMoney[i] = temp;
        }
        for (int i = 0; i < luckMoney.length; i++) {
            System.out.print("请按任意键进行开奖：");
            Scanner sc = new Scanner(System.in);
            sc.next();
            System.out.println(luckMoney[i]);
        }
    }
}

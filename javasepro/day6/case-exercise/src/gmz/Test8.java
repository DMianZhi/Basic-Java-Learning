package gmz;

import java.util.Random;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {

        int[] number = userSelectNumber();
        System.out.println("你选择的号码：");
        printArr(number);
        int[] luckNumber = createLuckNumber();
        System.out.println("中奖的号码：");
        printArr(luckNumber);
        judge(number, luckNumber);

    }

    private static void printArr(int[] luckNumber) {
        System.out.print("[");
        for (int i = 0; i < luckNumber.length; i++) {
            System.out.print(i == luckNumber.length - 1 ? luckNumber[i] : luckNumber[i] + ",");
        }
        System.out.println("]");
    }

    private static int[] createLuckNumber() {
        int[] luckNumber = new int[7];
        Random rd = new Random();
//        添加红色球
        for (int i = 0; i < luckNumber.length - 1; i++) {
            while (true) {
                int random = rd.nextInt(33) + 1;
                if (!check(random, luckNumber)) {
                    luckNumber[i] = random;
                    break;
                }
            }
        }
//        添加蓝色球
        int random = rd.nextInt(16) + 1;
        luckNumber[6] = random;
        return luckNumber;

    }

    private static int[] userSelectNumber() {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[7];

        for (int i = 0; i < number.length - 1; i++) {
            while (true) {
                System.out.print("请输入第" + (i + 1) + "位红色球号码（1~33）:");
                int userInput = sc.nextInt();
                if (userInput < 1 || userInput > 33) {
                    System.out.println("请输入的号码不在范围内！请重新选择。");

                } else {
                    if (check(userInput, number)) {
                        System.out.println("该号码已经选择了，请重新选择。");
                    } else {
                        number[i] = userInput;
                        break;
                    }
                }
            }
        }
        while (true) {
            System.out.print("请选择最后的蓝色球的号码（1~16）：");
            int userInput = sc.nextInt();
            if (userInput < 1 || userInput > 16) {
                System.out.println("请输入的号码不在范围内！请重新选择。");
            } else {
                number[6] = userInput;
                break;
            }
        }
        return number;
    }

    private static boolean check(int i, int[] number) {
        for (int j = 0; j < number.length; j++) {
            if (i == number[j]) {
                return true;
            }
        }
        return false;
    }

    private static void judge(int[] userNumber, int[] luckNumber) {
        int redCount = 0;
        int blueCount = 0;
//         判断红色球
        for (int i = 0; i < userNumber.length - 1; i++) {
            for (int i1 = 0; i1 < luckNumber.length - 1; i1++) {
                if (userNumber[i] == luckNumber[i1]) {
                    redCount++;
                    break;
                }
            }
        }
//        判断篮色球
        blueCount = userNumber[6] == luckNumber[6] ? 1 : 0;

//        输入结果
        System.out.println("红球命中的个数是：" + redCount);
        System.out.println("蓝球命中的个数是：" + blueCount);


    }

}


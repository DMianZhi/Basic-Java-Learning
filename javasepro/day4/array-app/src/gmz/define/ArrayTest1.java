package gmz.define;

import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args) {
        double scores[] = new double[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("请依次输入六位评委的分数：");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委的分数：");
            double score = sc.nextDouble();
            scores[i] = score;
        }
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double avg = sum / scores.length;
        System.out.println("平均分为：" + avg);
    }
}

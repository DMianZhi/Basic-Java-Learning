package gmz.branch;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的成绩：");
        double score = sc.nextDouble();
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println("优秀");
            } else if (score >= 80) {
                System.out.println("良好");
            } else if (score >= 60) {
                System.out.println("合格");
            } else {
                System.out.println("不合格");
            }
        } else {
            System.out.println("你输入的成绩不在范围内！");
        }
    }
}

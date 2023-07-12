/*
评委评分
* */
package gmz;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        score(3);
    }

    public static void score(int numOfPeople) {
        Scanner sc = new Scanner(System.in);
        double[] people = new double[numOfPeople];
        for (int i = 0; i < people.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委的评分：");
            double score = sc.nextDouble();
            people[i] = score;
        }
//        double sum = 0;
//        for (int i = 0; i < people.length; i++) {
//            sum += people[i];
//        }
//        double max = people[0];
//        for (int i = 0; i < people.length; i++) {
//            if (people[i] > max) {
//                max = people[i];
//            }
//        }
//        double min = people[0];
//        for (int i = 0; i < people.length; i++) {
//            if (people[i] < min) {
//                min = people[i];
//            }
//        }
        double sum = 0;
        double max = people[0];
        double min = people[0];

        for (int i = 0; i < people.length; i++) {
            sum += people[i];
            if (people[i] > max) {
                max = people[i];
            }
            if (people[i] < min) {
                min = people[i];
            }
        }

        System.out.println("该选手的成绩为");
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("总分：" + sum);
    }
}
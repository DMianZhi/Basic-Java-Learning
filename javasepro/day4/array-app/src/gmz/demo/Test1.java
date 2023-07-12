package gmz.demo;

public class Test1 {
    public static void main(String[] args) {
        int[] score = {12, 23, 34, 45, 6, 78, 34, 89, 12, 34, 90, 45};
        int max = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }
        System.out.println("最大值是：" + max);
//      数组反转。方式一：
        for (int i = score.length - 1; i >= 0; i--) {
            System.out.print(score[i] + " ");
        }
        System.out.println("\n======================");

//        方式二
        for (int i = 0, j = score.length - 1; i < j; i++, j--) {
            int temp = score[i];
            score[i] = score[j];
            score[j] = temp;
        }
        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i] + " ");
        }
    }
}

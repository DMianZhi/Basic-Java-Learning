/*
判断素数方式二
* */
package gmz;

public class Test7_2 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;
        prime(num1, num2);
    }

    public static void prime(int num1, int num2) {
        int count = 0;
        OUT:
        //为外部循环指定标签（名字是自定义的）
        for (int i = num1; i <= num2; i++) {
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    continue OUT;
                }
            }
            count++;
            System.out.println(i);
        }
        System.out.println("个数是：" + count);
    }
}

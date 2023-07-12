/*
判断素数方式一
* */
package gmz;

public class Test7 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;
        prime(num1, num2);
    }

    public static void prime(int num1, int num2) {
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            boolean flag = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("个数是："+count);
    }
}

/*
判断素数方式三：编程思想
* */
package gmz;

public class Test7_3 {
    public static void main(String[] args) {
        for (int i = 100; i < 200; i++) {
            if (check(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean check(int i) {
        for (int j = 2; j < i / 2; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}

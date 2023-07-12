package gmz.define;

public class MethodTest {
    public static void main(String[] args) {
        //    求1-n的和
        int res = total(100);
        System.out.println(res);

        //        判断一个数是否为奇数还是偶数
        judge(10);
        judge(1);


    }

    //    求1-n的和
    public static int total(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    //        判断一个数是否为奇数还是偶数
    public static void judge(int num) {
        if (num % 2 == 0) {
            System.out.println(num + "为偶数");
        } else {
            System.out.println(num + "为奇数");
        }
    }
}

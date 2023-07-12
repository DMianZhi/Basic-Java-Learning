/*
随机验证码
* */
package gmz;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(ma());
    }

    public static String ma() {
        String ma = "";
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            int j = rd.nextInt(3);
//            0为随机数字，1为随机大写字母，2为随机小写字母。
            switch (j) {
                case 0:
                    ma += rd.nextInt(9);
                    break;
                case 1:
                    ma += (char) (rd.nextInt(26) + 65);
                    break;
                case 2:
                    ma += (char) (rd.nextInt(26) + 97);
                    break;
            }
        }
        return ma;
    }
}

package d3_Util;

import java.util.Random;

public class MyUtil {
    public static void createCode(int n) {
        String code = "";
        String data = "qwertyuioplkjhgfdsazxcvbnm0987654321QAZXSWEDCVFRTGBNHYUJMKIOLP";
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            int random = rd.nextInt(data.length());
            code += data.charAt(random);
        }
        System.out.println(code);
    }
}

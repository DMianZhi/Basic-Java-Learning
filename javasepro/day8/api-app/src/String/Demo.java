package String;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        System.out.println(createCode(5));
        System.out.println(createCode(4));
    }

    public static String createCode(int num) {
        String code = "";
        String data = "qwertyuiopasdfghjklzxcvbnmQWERTYIOPASDFGHJKLZXCVBNM1234567890";
        Random rd = new Random();
        for (int i = 0; i < num; i++) {
            char c = data.charAt(rd.nextInt(data.length()));
            code += c;
        }
        return code;
    }
}

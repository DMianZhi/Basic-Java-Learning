package gmz.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        Random rd = new Random();
        for (int i = 0; i < 20; i++) {
            int random = rd.nextInt(11)+5;
            int rdd = rd.nextInt(37)+78;
            System.out.println(random);
            System.out.println("==================================");
            System.out.println(rdd);
        }
    }
}

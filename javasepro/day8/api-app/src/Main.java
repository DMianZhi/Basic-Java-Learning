import gmz1.Demo1;
import gmz1.Demo2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public static class Test {
        public static void main(String[] args) {

            //        在同一包下的程序可以直接访问；
            Demo d1 = new Demo();
            d1.printWord();

            //        访问其他报下的程序必须导包才可以访问。
            Demo1 d2 = new Demo1();
            d2.printWorld2();

            // 自己的程序中国调用Java提供的程序，也需要导入
            Scanner sc = new Scanner(System.in);
            String s = "黑马";
            Random rd = new Random();

            // 访问多个其他程序包下的程序，这些名字又重复，则第二个要导入名字；
            Demo2 d3 = new Demo2();

            // 第二个要加前缀包名
            gmz2.Demo2 d4 = new gmz2.Demo2();
        }

    }
}
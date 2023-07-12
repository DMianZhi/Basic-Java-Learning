package gmz.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        int i = 10;
        int j = 4;
        System.out.println(1.0 * i / j); // 两个interesting型的数值相除想要得到有精度的结果要乘于1.0
        System.out.println("------------------------");
        int a = 5;
        System.out.println(a + 5);//10
        System.out.println(a + 'a');//  102
        System.out.println(a + "iiuui" + "a");//        5iiuuia
        System.out.println(a + 'a' + "yuhjk");//        102yuhjk

    }
}

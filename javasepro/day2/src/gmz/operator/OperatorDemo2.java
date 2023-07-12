package gmz.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        int i = 10;
        int res = i++; // 先用后加
        System.out.println(i);
        System.out.println(res);

        int j = 10;
        int result = ++j; // 先加后用
        System.out.println(j);
        System.out.println(result);
    }
}

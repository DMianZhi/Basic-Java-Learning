package gmz.define;

public class MethodDemo1 {
    public static void main(String[] args) {
//        1、
        int res = sum(10, 20);
        System.out.println("和为：" + res);

//        2、
        print();
        System.out.println("==========================================");

//        3、
        print_count(6);
    }


//    有参数有返回值
    public static int sum(int a, int b) {
        int total = a + b;
        return total;
    }

//    无参数无返回值
    public static void print(){
        for (int i = 0; i < 3; i++) {
            System.out.println("你好");
        }
    }

//    有参数无返回值
    public static void print_count(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("hello world");
        }
    }
}

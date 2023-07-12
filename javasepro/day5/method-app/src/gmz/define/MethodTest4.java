package gmz.define;

public class MethodTest4 {
    public static void main(String[] args) {
        fire();
        fire(3);
        fire(2,"nama");
    }

    public static void fire() {
        System.out.println("发射了导弹~");
    }

   public static void fire(int num) {
        System.out.println("发射了" + num + "枚导弹~");
    }

    public static void fire(int num, String nation) {
        System.out.println("向" + nation + "发射了" + num + "枚导弹~");
    }
}

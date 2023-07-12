package gmz.define;

public class MethodTest2 {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56};
        print(arr);
        int[] arr2 = null;
        print(arr2);
    }

    public static void print(int[] arr) {
        if (arr == null) {
            System.out.println(arr);
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
//            方式一：
//            if (i == arr.length - 1) {
//                System.out.print(arr[i]);
//            } else {
//                System.out.print(arr[i] + ",");
//            }

//            方式二：
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }
}

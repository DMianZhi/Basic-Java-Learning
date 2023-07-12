/*
拷贝数组
* */
package gmz;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arrCopy = copy(arr);
        print(arrCopy);

    }

    public static int[] copy(int[] arr) {
        int[] arrCopy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrCopy[i] = arr[i];
        }
        return arrCopy;
    }

    public static void print(int[] arrCopy) {
        System.out.print("[");
        for (int i = 0; i < arrCopy.length; i++) {
            System.out.print(i == arrCopy.length - 1 ? arrCopy[i] : arrCopy[i] + ",");
        }
        System.out.println("]");
    }
}

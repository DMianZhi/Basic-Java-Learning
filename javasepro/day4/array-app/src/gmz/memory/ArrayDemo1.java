package gmz.memory;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 22, 33};
        int[] arr2 = arr;
//        地址一样~！！！
        System.out.println(arr);
        System.out.println(arr2);

//      修改了arr，arr2同时也修改了！！！
        arr[0] = 44;
        System.out.println(arr2[0]);

//        数组为 null时访问索引或length会报错！！！
        arr2 = null;
        System.out.println(arr2);
        System.out.println(arr2[1]);
        System.out.println(arr2.length);

    }
}

package gmz.define;

public class ArrayDemo1 {
    public static void main(String[] args) {
//        格式一
        String[] arr1 = {"张三", "李四", "王五"};
        int[] arr2 = {12, 23, 34};

        // 格式二
        String arr3[] = {"张三", "李四", "王五"};
        int arr4[] = {12, 23, 34};

//        格式三
        String[] arr5 = new String[]{"张三", "李四", "王五"};
        int[] arr6 = new int[]{12, 23, 34};
        System.out.println(arr1[0]);

//        修改元素
        arr1[0] = "熊大";
        arr1[2] = "熊二";
        System.out.println(arr1[0] + arr1[1] + arr1[2]);

//        数组个数
        System.out.println(arr1.length);

//        数组最大索引  数组名.length - 1（ 前提是数组有元素）
        System.out.println(arr1.length - 1);

        int[] arr7 = {};
        System.out.println(arr7.length - 1); // 输出 -1
    }
}

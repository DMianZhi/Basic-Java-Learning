package gmz.define;

public class ArrayDemo2 {
    public static void main(String[] args) {
        String[] arr = {"熊大", "熊二", "光头强", "吉吉", "毛毛"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int sum = 0;
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }
        System.out.println(sum);

    }
}

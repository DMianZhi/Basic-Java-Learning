package gmz.define;

public class MethodTest3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {1, 2};
        System.out.println(equals(arr1, arr2));
    }

    public static boolean equals(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            return true;
        }

        if (arr1 == null && arr2 == null) {
            return false;
        }

        if (arr1.length != arr2.length) {
            return false;
        } else {
            for (int i = 0; i < arr2.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }

            }
            return true;
        }


    }
}

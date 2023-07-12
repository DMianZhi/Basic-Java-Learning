/*
 *加密/解密密码
 * */
package gmz;

public class Test4 {
    public static void main(String[] args) {
        String data = ex(8346);
        System.out.println(data);
    }

    public static String ex(int pw) {

        int[] intpw = split(pw);
        for (int i = 0; i < intpw.length; i++) {
            intpw[i] = (intpw[i] + 5) % 10;
        }
        int[] zip = reverse(intpw);

        String data = "";
        for (int i = 0; i < zip.length; i++) {
            data += zip[i];
        }
        return data;
    }

    public static int[] split(int pw) {
        int[] arrpw = new int[4];
        arrpw[0] = pw / 1000;
        arrpw[1] = (pw / 100) % 10;
        arrpw[2] = (pw / 10) % 10;
        arrpw[3] = pw % 10;
        return arrpw;
    }

    public static int[] reverse(int[] reversepw) {
        for (int i = 0, j = reversepw.length - 1; i < j; i++, j--) {
            int temp = reversepw[i];
            reversepw[i] = reversepw[j];
            reversepw[j] = temp;
        }
        return reversepw;
    }
}

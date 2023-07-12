package String;

public class Test {
    public static void main(String[] args) {
        String str1 = "张三";

        // 1、获取字符串的长度
        System.out.println(str1.length()); // 2

        // 2、提取字符串中某个索引位置的字符
        char c = str1.charAt(1);
        System.out.println(c);

        // 字符的遍历
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }

        // 3、把字符串转化为字符数组，再进行遍历
        char[] chars = str1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        // 4、判断字符串内容，内容一样就返回true；
        String str2 = "过密枝";
        String str3 = "张三";
        String str4 = "张三";
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str3); //?
        System.out.println(str3 == str4); //?为什么shitrue
        System.out.println(str1.equals(str3));

        // 5、忽略大小写比较字符串内容

        String str5 = "Asdf4";
        String str6 = "aSDF4";
        System.out.println(str6.equalsIgnoreCase(str5));


        // 6、截断字符串内容（包前不包后）
        String str7 = "万事到头都是梦，休休，明日黄花蝶也愁";
        System.out.println(str7.substring(0,7));
        System.out.println(str7.substring(8));

        // 7、把字符串替换，并返回
        String str8 = "你好";
        System.out.println(str8.replace("好","*"));

        // 8、判断字符串是否包含某个字符；返回boolean
        System.out.println(str7.contains("休休"));

        //9、判断字符串是否以某个字符开头；
        System.out.println(str1.startsWith("张"));

        // 10、把字符串按照某个指定内容分割多个字符串，放到一个数组并返回；
        String str9 = "张三，李四，王五，赵六";
        String[] str = str9.split("，");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

    }
}

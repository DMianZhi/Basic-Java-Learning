package arrayList;

import java.util.ArrayList;

public class define {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(11);
        list.add(23);
        list.add("nihao");
        System.out.println(list);

//      指定集合数据类型的写法
        ArrayList<String> strList = new ArrayList<>();
        strList.add("张三");
        strList.add("李四");
        strList.add("王五");
        strList.add("赵六");
        System.out.println(strList);

        // 指定索引添加
        strList.add(1,"牛马");
        System.out.println(strList);

        // 根据索引获取值；
        System.out.println(strList.get(1));

        // 获得集合个数（类似于长度）
        System.out.println(strList.size());

        // 根据索引删除,并返回
        System.out.println(strList.remove(1));

        // 直接删除指定元素，并返回boolean值。成功true，反之false
        System.out.println(strList.remove("张三"));// true

        // 当有多个重复的元素，会删除先出现的
        strList.add(3,"李四");
        System.out.println(strList);
        strList.remove("李四");
        System.out.println(strList);

        // 根据索引修改元素，并返回被修改的值

        System.out.println(strList.set(1, "牛马"));
    }
}

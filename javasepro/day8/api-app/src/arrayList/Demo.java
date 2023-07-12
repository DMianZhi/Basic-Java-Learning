package arrayList;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("红色");
        list.add("蓝色");
        list.add("天蓝色");
        list.add("黄色");
        list.add("浅蓝色");

        // 方式一：删除成功i往后退
        /*
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            if (temp.contains("蓝色")) {
                list.remove(i);
                i--;
            }
        }*/

        // 方式二：倒叙循环
        for (int i = list.size() - 1; i >= 0; i--) {
            String temp = list.get(i);
            if (temp.contains("蓝色")) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}

package arrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Food> foods = new ArrayList<>();

    public void addFood() {
        Food f = new Food();
        System.out.println("请输入菜品的名字：");
        String foodName = sc.next();
        f.setName(foodName);

        System.out.println("请输入菜品的价格：");
        double foodPrice = sc.nextDouble();
        f.setPrice(foodPrice);

        System.out.println("请输入菜品的描述：");
        String foodDesc = sc.next();
        f.setDesc(foodDesc);

        foods.add(f);
    }

    public void showFood() {
        if (foods.size() == 0) {
            System.out.println("还没有商品，快去添加。");
            return;
        }
        for (int i = 0; i < foods.size(); i++) {
            System.out.println(foods.get(i).getName());
            System.out.println(foods.get(i).getPrice());
            System.out.println(foods.get(i).getDesc());
            System.out.println("----------------------");
        }
    }

    public void startOperator() {

        while (true) {
            System.out.println("1、上架商品");
            System.out.println("2、显示商品");
            System.out.println("3、退出");

            System.out.println("请选择你的操作");
            String create = sc.next();
            switch (create) {
                case "1":
                    addFood();
                    break;
                case "2":
                    showFood();
                    break;
                case "3":
                    System.out.println("下次再来");
                    return;
                default:
                    System.out.println("命令有误请重试！");
            }
        }
    }
}

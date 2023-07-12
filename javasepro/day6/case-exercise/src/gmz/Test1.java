/*
计算机票优惠价格
* */
package gmz;

public class Test1 {
    public static void main(String[] args) {
        double price = count(1000, "经济舱", 9);
        System.out.println("优惠价为：" + price);
    }

    public static double count(double price, String type, int month) {
        if (month >= 5 && month <= 10) {
            switch (type) {
                case "经济舱":
                    price *= 0.9;
                    break;
                case "头等舱":
                    price *= 0.85;
            }
        } else {
            switch (type) {
                case "经济舱":
                    price *= 0.7;
                    break;
                case "头等舱":
                    price *= 0.65;
            }
        }
        return price;
    }
}

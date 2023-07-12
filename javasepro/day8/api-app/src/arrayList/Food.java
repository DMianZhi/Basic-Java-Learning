package arrayList;

public class Food {
    private String name;
    private String desc;
    private double price;

    public Food(String name, String desc, double price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public Food() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

package gmz.branch;

public class SwitchDemo1 {
    public static void main(String[] args) {
        //不能为double，float，long型，因为精度的原因0.1+0.2!=0.3
        String week = "周三";
        switch (week) {
            case "周一":
                System.out.println("今天周一");
                break;
            case "周二":
                System.out.println("今天周二");
                break;
            case "周三":
                System.out.println("今天周三");
                break;
            case "周四":
                System.out.println("今天周四");
                break;
            case "周五":
                System.out.println("今天周五");
                break;
            case "周六":
                System.out.println("今天周六");
                break;

        }
    }
}

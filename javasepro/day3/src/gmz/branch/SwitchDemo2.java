package gmz.branch;

public class SwitchDemo2 {
    public static void main(String[] args) {
        String week = "周"; //不能为double，float，long型，因为精度的原因0.1+0.2!=0.3
        switch (week) {
            case "周一":
            case "周二":
            case "周三":
            case "周四":
            case "周五":
                System.out.println("学习");
                break;
            case "周六":
            case "周日":
                System.out.println("娱乐");
                break;
            default:
                System.out.println("你输入的信息有误！");
        }
    }
}

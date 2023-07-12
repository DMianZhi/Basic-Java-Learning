package oop.encapsuation;

public class Student {

    //    目的：掌握封装的设计规范；合理隐藏，合理暴露
    private int score;

    public void setName(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("数据非法！");
        }

    }

    public int getName() {
        return score;
    }

    //    给用户查看是否合格，是public
    public void printPass() {
        if (score > 60) {
            System.out.println("合格，通过！");
        } else {
            System.out.println("不合格");
        }
    }
}

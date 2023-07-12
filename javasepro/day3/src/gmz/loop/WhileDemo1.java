package gmz.loop;

public class WhileDemo1 {
    public static void main(String[] args) {
        double peakHeight = 8848860;
        double paperThickness = 0.01;
        int count = 0;
        while (paperThickness<peakHeight){
            paperThickness = paperThickness*2;
            count++;
        }
        System.out.println(count);
        System.out.println(paperThickness);
    }
}

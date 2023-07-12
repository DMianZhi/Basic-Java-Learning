package oop.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Movie movie[] = new Movie[4];
        movie[0] = new Movie(1, "水门桥", 38.9, 9.8, "徐克", "吴京", "12万人想看");
        movie[1] = new Movie(2, "出拳吧", 38.9, 9.8, "徐克", "吴京", "12万人想看");
        movie[2] = new Movie(3, "月球陨落", 38.9, 9.8, "徐克", "吴京", "12万人想看");
        movie[3] = new Movie(4, "一点就到家", 38.9, 9.8, "徐克", "吴京", "12万人想看");


        MovieOperator movieOperator = new MovieOperator(movie);
//        movieOperator.printAllMovie();
//        movieOperator.searchMovieById(4);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("==电影信息查询==");
            System.out.println("1、查询全部电影信息。");
            System.out.println("2、根据id查询某个电影的详细信息");
            System.out.println("请你输入操作命令");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    movieOperator.printAllMovie();
                    break;
                case 2:
                    System.out.println("请输入你想查询的电影id");
                    int id = sc.nextInt();
                    movieOperator.searchMovieById(id);
                    break;
                default:
                    System.out.println("你输入的命令有问题");
            }
        }

    }
}

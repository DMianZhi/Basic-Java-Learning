package oop.demo;

public class MovieOperator {
    private Movie[] movie;

    public MovieOperator(Movie[] movie) {
        this.movie = movie;
    }

    public void printAllMovie() {
        System.out.println("全部信息如下");
        for (int i = 0; i < movie.length; i++) {
            System.out.println("电影：" + movie[i].getName());
            System.out.println("票价：" + movie[i].getPrice());
        }
    }

    /* public void searchMovieById(int id) {
         for (int i = 0; i < 1; i++) {
             System.out.println("电影：" + movie[id - 1].getName());
             System.out.println("票价：" + movie[id - 1].getPrice());
             System.out.println("评分：" + movie[id - 1].getScore());
             System.out.println("导演：" + movie[id - 1].getDirector());
             System.out.println("主演：" + movie[id - 1].getActor());
             System.out.println("想看：" + movie[id - 1].getInfo());
             System.out.println("----------------------------------------");
         }
     } */
    public void searchMovieById(int id) {

        for (int i = 0; i < movie.length; i++) {
            Movie m = movie[i];
            if (m.getId() == id) {
                System.out.println("电影：" + m.getName());
                System.out.println("票价：" + m.getPrice());
                System.out.println("评分：" + m.getScore());
                System.out.println("导演：" + m.getDirector());
                System.out.println("主演：" + m.getActor());
                System.out.println("想看：" + m.getInfo());
                System.out.println("----------------------------------------");
                return;
            }
        }
        System.out.println("没有该电影信息。");
    }
}

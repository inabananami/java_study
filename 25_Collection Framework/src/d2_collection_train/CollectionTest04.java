package d2_collection_train;

import java.util.Collection;
import java.util.ArrayList;

public class CollectionTest04 {
    public static void main(String[] args) {
        //コレクション容器を作成する
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("《肖申克的救赎》", 9.7, "罗宾斯"));
        movies.add(new Movie("《肖申克救赎》", 9.5, "罗宾"));
        movies.add(new Movie("《肖申克赎》", 9.0, "罗斯"));

        for (Movie movie : movies) {
            System.out.println("映画の名前：" + movie.getName());
            System.out.println("スコア：" + movie.getScore());
            System.out.println("俳優：" + movie.getActor());
            System.out.println("--------------------------------------------");
        }
    }
}
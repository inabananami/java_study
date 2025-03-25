package d2_collection_train;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("佐藤さん");
        c.add("長崎さん");
        c.add("高松さん");
        c.add("上原さん");
        System.out.println(c);

        //イテレータ
        //lambda表現式で走査する
        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(" " + s + " ");
            }
        });
    }
}

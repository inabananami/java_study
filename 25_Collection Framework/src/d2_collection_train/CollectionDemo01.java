package d2_collection_train;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("佐藤さん");
        c.add("長崎さん");
        c.add("高松さん");
        c.add("上原さん");
        System.out.println(c);

        //イテレータ
        //ループを使って走査したほうがいい
        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

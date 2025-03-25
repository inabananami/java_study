package d1_collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest2API {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("java1");
        collection.add("java1");
        collection.add("java2");
        collection.add("java2");
        collection.add("java3");
        System.out.println(collection);

        //コレクションをクリア
//        collection.clear();
        System.out.println(collection);

        //コレクションは空いているかどうか確認する
        System.out.println(collection.isEmpty());

        //コレクションのボリュームを獲得する
        System.out.println(collection.size());

        //コレクションはあるエレメントを含むかどうか確認する
        System.out.println(collection.contains("java1"));

        //ある要素を削除する
        collection.remove("java1");
        System.out.println(collection);

        //コレクションを配列に転換する(Object類の配列だ)
        Object[] arr = collection.toArray();
        System.out.println(arr[1]);
    }
}

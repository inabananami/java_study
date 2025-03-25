package d1_collection;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionTest1 {
    public static void main(String[] args) {
        //collectionを確認してみる
        ArrayList<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java1");
        list.add("java2");
        System.out.println(list);

        //重複のエレメントを支持しないし、索引もない
        HashSet<String> set = new HashSet<>();
        set.add("java1");
        set.add("java2");
        set.add("java1");
        set.add("java3");
        System.out.println(set);
    }
}
package d3_collection_list;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {
        //ArrayListコレクションオブジェクトを作成する
        List<String> list = new ArrayList<>();   //クラシックなコード
        list.add("A");
        list.add("B");
        list.add("B");
        list.add("C");
        System.out.println(list);

        //ある索引にエレメントを挿入する
        list.add(2, "D");
        System.out.println(list);

        System.out.println("------------------------------------------------------");

        //索引に応じてエレメントを削除
        System.out.println(list.remove(3));
        System.out.println(list);

        System.out.println("------------------------------------------------------");

        //指定された位置のエレメントを返す
        System.out.println(list.get(2));

        System.out.println("------------------------------------------------------");

        //索引の所のエレメントを直す。成功した上、元のデータを返せる
        System.out.println(list.set(2, "E"));
        System.out.println(list);
    }
}

package d5_collection_exception;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class CollectionTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("王麻子");
        list.add("小李子");
        list.add("李爱花");
        list.add("张全蛋");
        list.add("晓李");
        list.add("李玉刚");
        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        //エラーが発生する
        //欲求：コレクションの中で「李」を含んでる名前を探し、コレクションから削除する
        while(iterator.hasNext()){
            String name = iterator.next();
            if(name.contains("李")) {
//                list.remove(name);
                //目前イテレータの走査したデータを削除し、削除した上、i--も実行した
                  iterator.remove();
            }
        }
        System.out.println(list);

        //すべての「李」を含む名前を削除できない
        //forループを使ってコレクションを走査して、「李」を含んでる名前を削除する
//        for(int i = 0; i < list.size(); i++) {
//            String name = list.get(i);
//            if(name.contains("李")) {
//                list.remove(name);
//            }
//        }
//        System.out.println(list);

        System.out.println("--------------------------------------------------------------------------");
        //どう解決すればいいのか
//        for(int i = 0; i < list.size(); i++) {
//            String name = list.get(i);
//            if(name.contains("李")) {
//                list.remove(name);
//                i--;   //　iを前に移動する
//            }
//        }
//        System.out.println(list);

        //増強forループを使ってコレクションを走査してデータを削除することは、バッグを避けられない。
//        for(String s : list) {
//            if (s.contains("李")) {
//                list.remove(s);
//            }
//        }
    }
}

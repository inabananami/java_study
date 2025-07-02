package d3_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        //forループ
        for(int i = 0; i < list.size(); i++){
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println();

        //isNext
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();

        //foreach
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();

        //lambda
        list.forEach(System.out::println);
    }
}

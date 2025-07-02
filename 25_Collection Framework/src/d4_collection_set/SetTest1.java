package d4_collection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest1 {
    public static void main(String[] args) {
        //HashSetを作成した
        //Set<Integer> set = new HashSet<>();
        Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        System.out.println(set);
    }
}
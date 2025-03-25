package d2_collection_train;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("佐藤さん");
        c.add("長崎さん");
        c.add("高松さん");
        c.add("上原さん");
        System.out.println(c);

        //イテレータ
        //増強forループを使って走査する
        for(String ele : c) {
            System.out.print(" " + ele + " ");
        }
        System.out.println();

        //増強forループも配列を走査できる
        String[] str = {"佐藤さん","高松さん"};
        for(String ele : str) {
            System.out.println(ele + " ");
       }
    }
}

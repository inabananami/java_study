import java.util.ArrayList;

public class ArrayListDemo {
        @SuppressWarnings("unchecked")
        public static void main(String[] args) {
        //ArrayListを作成する
        // ArrayList list = new ArrayList();
        // list.add(99);
        // list.add("nijigasaki");
        // list.add("raw");
        // System.out.println(list);

        //特定種類のArrayListを作成する
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(99);
        list2.add(88);
        list2.add(11);
        System.out.println(list2);

        //特定位置で要素を挿入する
        list2.add(1, 101);
        System.out.println(list2);

        //インデックスに従って、データを返す
        int num = list2.get(1);
        System.out.println(num);

        //ArrayListの集合の数を獲得する
        int n = list2.size();
        System.out.println(n);

        //指定されたインデックスに対する要素を削除し、削除された要素を返す
        int num2 = list2.remove(2);
        System.out.println(num2);
        System.out.println(list2);

        //指定された要素を削除し、削除する結果を返す
        boolean IsDel = list2.remove(Integer.valueOf(11));
        System.out.println(IsDel);
        System.out.println(list2);

        //指定されたインデックスのデータを直し、元のものを返す
        int num3 = list2.set(1,1000);
        System.out.println(num3);
        System.out.println(list2);
    }
}

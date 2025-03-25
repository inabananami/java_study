import java.util.Arrays;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        String[] names = {"Boby", "Anger", "ann", "caocao", "uehara", "anon"};

        //並び替えにする(ディフォルトの設定は頭文字番号(ASCll)に従って並び替えることだ)
        Arrays.sort(names);

        //頭文字の大きさを見せずに並び替える
//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                //比較規則を作成する。o1 = "ann"  o2 =  "anon"
//                return o1.compareToIgnoreCase(o2);
//            }
//        });

        //特定類の方法引用
        Arrays.sort(names, (String o1, String o2) -> {
            return o1.compareToIgnoreCase(o2);
        });

        System.out.println(Arrays.toString(names));
    }
}
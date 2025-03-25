package d2_regex;
import java.util.Arrays;

public class RegexTest6 {
    public static void main(String[] args) {
        //レターを「*」に引き換える
        String s1 = "我的叽歪大地啊大海wisisjsjjss豆瓣我我威威1281281281我我娃娃九年wwidssda";
        System.out.println(s1.replaceAll("\\w+","*"));

        //重ねる漢字を削除する
        //　(.)一つの組
        //　\\1:　この組の組番号を宣言する
        //　+:　1又は1以上の数
        //　$1:　第一組を代表する重ねる文字
        String s2 = "我我我我喜喜喜喜欢欢欢欢你你你你你";
        System.out.println(s2.replaceAll("(.)\\1+","$1"));

        //すべての人名を抽出する
        String s3 = "王伟wisisjsjjss刘翔1281281281张伟wwidssda";
        String[] names = s3.split("\\w+");
        System.out.println(Arrays.toString(names));
    }
}

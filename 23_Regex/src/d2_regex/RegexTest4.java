package d2_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest4 {
    public static void main(String[] args) {
        method1();
    }
    public static void method1() {
        //すべての電話番号やメールを抽出する
        String data = "来黑马程序员学习Java，\n" +
                "电话：18512516758,18512508907\n" +
                "座机电话：01036517895,010-98951256\n"+
                "邮箱: bozai@itcast.cn,\n" +
                "邮箱2: dlei0009@163.com,\n" +
                "热线电话：400-618-9090，400-618-4000，4006184000, 4006189090\n";

        //ルールを設定する
        String regex = "(1[3-9]\\d{9}|0\\d{2,4}-?[1-9]\\d{4,19})"+
                                "|(\\w{2,}@\\w{2,20}\\.\\w{2,10})" +
                                "|(400-?\\d{3,7}-?\\d{3,7})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
package d2_regex;

public class Traditional {
    public static void main(String[] args) {
        String qq = "2513234";
        System.out.println(checkQQ(qq));
    }
    public static boolean checkQQ(String qq) {
        //1．qq番号はNULLかどうか確認する
        if(qq == null || qq.startsWith("0") || qq.length() < 6 || qq.length() > 20) {
            return false;
        }

        //2.qq番号は少なくともnull、0で始まりどちらともなく、６から２０までの長さを満足する。
        //qq番号はすべて数字かどうか判断する
        for(int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            if(ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
}

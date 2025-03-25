package d2_regex;

public class RegexVersion {
    public static void main(String[] args) {
        String qq = "2512qq234";
        System.out.println(checkQQ(qq));
    }
    public static boolean checkQQ(String qq) {
        return qq != null && qq.matches("[1-9]\\d{5,19}");
    }
}
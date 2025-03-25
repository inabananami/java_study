package d2_regex;

public class RegexTest2 {
    public static void main(String[] args) {
        //abcを含む
        System.out.println("a".matches("[abc]"));
        //false
        System.out.println("e".matches("[abcd]"));

        //abcを除く
        System.out.println("d".matches("[^abc]"));
        //false
        System.out.println("a".matches("[^abc]"));

        //a-zとA-z限定
        System.out.println("b".matches("a-zA-z"));
        //false
        System.out.println("2".matches("[a-zA-z]"));

        //a-zだが、bとcを除く
        System.out.println("k".matches("[a-z&&[^bc]]"));
        //false
        System.out.println("b".matches("[a-z&&[^bc]]"));

        //false 注意：上記の[内容]を含んだ規則は、すべてひとつの文字しかマルチできない
        System.out.println("ab".matches("[a-zA-z0-9]"));

        //2.事前定義文字「一つの文字しかマルチできない」
        System.out.println("王".matches("."));
        System.out.println("王子".matches("."));

        // ”\”はJavaの中で特別な意味がある：\n = 改行　\t = 一つのインデント
        // Javaの中で、\は\になりたいなら、意味転換の必要がある
        System.out.println("\"");
        System.out.println("3".matches("\\d")); // \d: 0-9
        System.out.println("a".matches("\\d")); //false

        System.out.println(" ".matches("\\s")); // \s: 空白文字と指定している
        System.out.println("a".matches("")); //false

        System.out.println("a".matches("\\S")); // \S：非空白文字と指定している
        System.out.println(" ".matches("\\S")); //false

        System.out.println("a".matches("\\w")); // \w：[a-zA-z_0-9]
        System.out.println("_".matches("\\w")); //true
        System.out.println("王".matches("\\w")); //false

        System.out.println("王".matches("\\W")); // \Wはa-zA-z_0-9になるべきではない
        System.out.println("a".matches("\\W")); //false

        System.out.println("23232".matches("\\d")); //false 注意：上記の[内容]を含んだ規則は、すべてひとつの文字しかマルチできない

        //3．数詞： ?  *  +  {n}  {n, }  {n, m}
        System.out.println("a".matches("\\w?"));  //? 零回又は一回をの意味である
        System.out.println("".matches("\\w?"));    //true
        System.out.println("abc".matches("\\w?")); //false

        System.out.println("abc12".matches("\\w*")); // * 零回又は複数回の意味である
        System.out.println("".matches("\\w*")); //true
        System.out.println("abc12王".matches("\\w*")); //false

        System.out.println("abc12".matches("\\w+"));  //+ 一回又は複数回の意味である
        System.out.println("".matches("\\w+")); //false
        System.out.println("abc12王".matches("\\w+")); //false

        System.out.println("a3c".matches("\\w{3}")); // {n} 丁度ｎ回の意味である
        System.out.println("abcd".matches("\\w{3}"));  //false
        System.out.println("abcd".matches("\\w{3,}"));  // {n,} >=三回の意味である
        System.out.println("ab".matches("\\w{3,}"));  //false
        System.out.println("abcde徐".matches("\\w{3,}"));   //false
        System.out.println("abc232d".matches("\\w{3,9}")); //{3, 9} 3<=n<=9の意味である

        //ほかのよく使われる文字：(?i)大文字と小文字を問わず、又は符号：| 、 組を作る：()
        System.out.println("abc".matches("(?i)abc"));  //true
        System.out.println("ABC".matches("(?i)abc")); //true
        System.out.println("aBc".matches("a((?i)b)c")); //true
        System.out.println("ABc".matches("a((?i)b)c")); //false

        // 欲求1：
    }
}


public class StringMethod {
    public static void main(String[] args) {
        String name = "van";
        String name2 = "van";
        //stringの長さを獲得する
        int length = name.length();
        System.out.println(length);
        //stringの指定の位置のcharのAscllコードを獲得する
        int info_1 = name.charAt(1);
        System.out.println(info_1);
        //stringをchar配列を転換して返す
        char[] toChar = name.toCharArray();
        for(int i = 0; i < toChar.length; i++) {
            System.out.println(toChar[i]);
        }
        //string1とstring2の内容は同じかどうか確認する
        boolean isSame = name.equals(name2);
        System.out.println(isSame);
        //元stringの部分的な文字を獲得し、新たなstringを作成する(前を含んだが、後ろを含まない)
        String s3 = name.substring(0,2);
        System.out.println(s3);
        //元stringの特定な位置から始まり、後ろまで獲得し、新たなstringを作成する
        String s4 = name.substring(2);
        System.out.println(s4);
        //新しいデータを使い、Stringの古いものを差し替え、新たなstringを獲得する
        String s5 = name.replace('a','o');
        System.out.println(s5);
        //stringの中で特定なStringを含むかどうか判断する
        boolean IsTrue = name.contains("an");
        System.out.println(IsTrue);
        //stringは特定なStringで始まるかどうか判断する
        boolean IsStart = name.startsWith("va");
        System.out.println(IsStart);
        //stringを特定なStringを従って割り、String配列を返す
        String sample = "isthatTrue";
        String cut = "that";
        String[] cutted = sample.split(cut);
        System.out.println(cutted[1]);
    }
}

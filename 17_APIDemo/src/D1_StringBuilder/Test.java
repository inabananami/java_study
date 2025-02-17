package D1_StringBuilder;

public class Test {
    public static void main(String[] args) {
        StringBuilder sbuilder = new StringBuilder("みんなが叶える物語");
        StringBuilder sb2 = new StringBuilder("るてしきす");

        //内容を繋ぎ合わせる
        sbuilder.append("、君も一員で、");
        sbuilder.append("No.10だ。");
        System.out.println(sbuilder);

        //stringを反転する
        sb2.reverse();
        System.out.println(sb2);

        //stringの長さを出力する
        System.out.println(sb2.length());

        //StringBuilderはStringへ転換できる
        String s = new String();
        s = sbuilder.toString();
        System.out.println(s);
    }
}

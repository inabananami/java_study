package D2_StringJoiner;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        //空白で間隔にする
        StringJoiner sj = new StringJoiner("  ");
        sj.add("ヒ");
        sj.add("ト");
        sj.add("リ");
        sj.add("ダ");
        sj.add("ケ");
        sj.add("ナ");
        sj.add("ン");
        sj.add("テ");
        sj.add("エ");
        sj.add("ラ");
        sj.add("べ");
        sj.add("ナ");
        sj.add("イ");
        sj.add("ヨ");
        sj.add("ー");
        sj.add("ー");
        System.out.println(sj);

        //参数1:　間隔符号
        //参数2:　始め
        //参数3:　結末
        StringJoiner sj2 = new StringJoiner(", ","[","]");
        sj2.add("ミューズ");
        sj2.add("アクア");
        sj2.add("虹ヶ咲スクールアイドル同好会");
        sj2.add("リェラ");
        sj2.add("蓮ノ空女学院スクールアイドルクラブ");
        System.out.println(sj2);
    }
}
public class SortTurn2 {
    public static void main(String[] args) {
        //演算式の自動類型転換
        byte a = 10;
        int b = 20;
        long c = 30;
        // 最高の類型ではなければ、エラーが発生する
        // int rs = a + b + c;
        //最高の類型になれば、完璧になる
        long rs = a + b + c;
        System.err.println(rs);

        double rs2 = a + b + 1.0;
        System.out.println(rs2);

        byte i = 10;
        //この場合short型からint型まで転換する
        short j = 30; 
        int rs3 = i + j;
        System.out.println(rs3);
    }
}

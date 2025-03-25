import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class ArraysTest1 {
    public static void main(String[] args) {
        //配列の内容を返す
        int[] arr = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(arr));

        //配列をコピー（指定された範囲で、前のものを含んだが、後ろのを含まない）
        int[] arr2 = Arrays.copyOfRange(arr, 0, 4);
        System.out.println(Arrays.toString(arr2));

        //配列をコピー、新しい配列の長さを指定できる
        int[] arr3 = Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(arr3));

        //配列の元のデータを新しいものに直して保存する
        double[] prices = {99.8, 9.98, 99.9, 999.9, 87.5};
        //すべての価格を八割にして、保存する
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return prices[value] * 0.8;
            }
        });
        System.out.println(Arrays.toString(prices));

        //配列を並び替え
        int[] arr10 = {1, 3, 2, 10, 1000, 200, 450, 80, 90};
        Arrays.sort(arr10);
        System.out.println(Arrays.toString(arr10));
    }
}

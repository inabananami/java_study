public class ArrayDynamicInitialize {
    public static void main(String[] args) {
        //ダイナミックな初期化
        int[] arr = new int[3];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.printf("%d ", arr[i]);
        }
    }
}
public class ArrayInitialize {
    public static void main(String[] args) {
        //完全なフォーマット
        int[] arr = new int[]{12, 24, 36};
        double[] arr2 = new double[] {89.9, 78.8, 87.7};

        //簡易化のフォーマット
        int[] age = {18, 19, 20};

        System.out.println(arr[1]);
        System.out.println(arr2[1]);
        System.out.println(age[1]);

        arr[1] = 100;
        arr2[1] = 20.2;
        age[1] = 23;
        System.out.println(arr[1]);
        System.out.println(arr2[1]);
        System.out.println(age[1]);
    }
}

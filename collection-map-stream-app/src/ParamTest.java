public class ParamTest {
    public static void main(String[] args) {
        test();
        test(11,22,33);
        test(new int[]{10, 20, 30, 40, 50});
    }

    public static void test(int... nums) {
        int count = 0;
        for(int num : nums) {
            System.out.println(num);
            count++;
            if(count == 5) {
                System.out.println();
                count = 0;
            }
        }
    }
}

package d3_two_divide_finding;

public class Test {
    public static int find(int[] arr, int number,int left, int right) {
        while (left  <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == number) {
                return mid;
            }
            else if(arr[mid] < number) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //まずは配列を並び替え切れる
        int[] arr = {2, 3, 5, 18, 6, 99, 35, 56, 48};

        for( int i = 0; i < arr.length; i++ ) {
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++ ) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //交換する
            if(minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        //そして、探しコードを書く
        int number = 1;
            int left = 0;
            int right = arr.length - 1;
            System.out.println(find(arr, number, left, right));
    }
}
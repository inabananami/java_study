package d2_choice_sort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
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
        System.out.println(Arrays.toString(arr));
    }
}

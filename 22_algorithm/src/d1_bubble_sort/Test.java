package d1_bubble_sort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 18, 6, 99, 35, 56, 48};

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j< arr.length -i -1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
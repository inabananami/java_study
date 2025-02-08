package project.src;

public class ArrayOutput {
    public static void ArrayOut(int[] arr) {
        String text = "[";
        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                text += arr[i];
                break;
            }
            text += arr[i];
            text += ", ";
        }
        text += "]";
        System.out.println(text);
    }
    public static void main(String[] args) {
        int[] arr = {23,24,25,26,27};
        ArrayOut(arr);
    }
}

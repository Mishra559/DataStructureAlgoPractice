import java.util.Arrays;

public class OptimisedRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int d = 4;
        reverse(arr,0,d-1);
        System.out.println(Arrays.toString(arr));
        reverse(arr,d,n-1);
        System.out.println(Arrays.toString(arr));
        reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}

import java.util.Arrays;

public class LeftRotateByDPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7,8,9};
        int n = arr.length;
        int d = 3;
        int[] arr1 = new int[d];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));


        for(int i = d ; i < n; i++ ){
            arr[i - d] = arr[i];

        }
        System.out.println(Arrays.toString(arr));

        for(int i = 0 ; i < d; i++){
            arr[n-d +i] = arr1[i];

        }
        System.out.println(Arrays.toString(arr));

    }
}

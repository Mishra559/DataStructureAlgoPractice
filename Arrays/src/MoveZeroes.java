import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {4,2,0,6,0,0,1,0};

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                for (int j = i + 1; j < arr.length; j++) {
//                    if (arr[j] != 0) {
//                        int temp = arr[j];
//                        arr[j] = arr[i];
//                        arr[i] = temp;
//                    }
//                }
//            }
//        }

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

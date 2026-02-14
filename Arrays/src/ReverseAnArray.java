import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};


        //brute force
        int[] rev = new int[arr.length];
        int k = 0;
        for(int i = arr.length-1; i >= 0; i--){
            rev[k] = arr[i];
            k++;
        }
        System.out.println(Arrays.toString(rev));


        //optimised approach
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}

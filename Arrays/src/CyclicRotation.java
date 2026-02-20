import java.util.Arrays;
import java.util.Scanner;

public class CyclicRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many terms you want to rotate");

        int s = sc.nextInt();

        swap(arr,0,s-1);
        swap(arr,s,arr.length-1);
        swap(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void swap(int[] arr,int a,int b){
        int n = arr.length;
        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
}

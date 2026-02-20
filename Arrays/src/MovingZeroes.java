import java.util.Arrays;

public class MovingZeroes {
    public static void main(String[] args) {
        int[] arr ={0,0,0,0,0,0,0,0};

        int k = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
              int temp = arr[i];
              arr[i] = arr[k];
              arr[k] = temp;
              k++;
            }
        }

//        for( int i = k; i < arr.length; i++){
//            arr[i]=0;
//        }
       System.out.println(Arrays.toString(arr));
    }
}

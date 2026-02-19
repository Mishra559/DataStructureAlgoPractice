public class MaxDifference {
    public static void main(String[] args) {
        int[] arr = {30,20,10,0};

        int max = maxDifference(arr);
        System.out.println(max);
    }

    private static int maxDifference(int[] arr) {
        int n  = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[j] - arr[i] > max){
                    max = arr[j] - arr[i];
                }
            }
        }
        return max;
    }
}

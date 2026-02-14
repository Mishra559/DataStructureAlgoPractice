public class LargestElement {
    public static void main(String[] args) {
        int[] arr =  {1,6,8,79,777,12,8,9,7};

        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Max number is " + max);
        System.out.println("Max Index is " + maxIndex);


    }
}

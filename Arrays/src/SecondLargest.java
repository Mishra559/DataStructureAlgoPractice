public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,10,10};

        int max = arr[0];
        int secondMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        if(secondMax == 0){
            System.out.println("No second largest element found");

        }
        else{
            System.out.println("Second Largest is " + secondMax);
        }



    }
}

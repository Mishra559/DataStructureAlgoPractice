public class FrequencyOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,5,5,5,5,5,8,8,8,8,8,7,7,7,9,9,10,10,10,16};


        findFrequency(arr);

    }

    private static void findFrequency(int[] arr) {
        int count = 1;
        for (int i = 0; i < arr.length-1; i++) {

            if(arr[i] == arr[i+1]) {
                count++;
            }
            else{
                System.out.println(arr[i] + " " + count);
                count = 1;
            }
        }
        System.out.println(arr[arr.length-1] + " " + count);

    }
}

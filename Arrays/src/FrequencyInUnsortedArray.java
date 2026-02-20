public class FrequencyInUnsortedArray {
    public static void main(String[] args) {
        int[] arr = {1,5,1,4,7,5,6,8,7,5,6,5};

        findFrequencyOfArray(arr);
    }

    private static void findFrequencyOfArray(int[] arr) {

        int len = arr.length;
        int[] visited = new int[len];
        int k = 0;
        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = i+1; j < len; j++) {

            }
        }
    }

}

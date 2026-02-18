public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {10,10,10,20,20,20,30,50,50,60};
        removeDuplicates(arr);
    }
    public static void removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("enter some values");
            return;
        }

        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        System.out.println(res);


    }
}

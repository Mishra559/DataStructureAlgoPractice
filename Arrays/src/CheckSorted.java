public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,6,4,5,7,9};

        boolean flag = true;


        for(int i = 0; i < arr.length -1; i++){
            if(arr[i] > arr[i+1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("sorted array");
        }
        else{
            System.out.println("not a sorted array ");
        }
    }
}

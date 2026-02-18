public class LeaderInAnArray {
    public static void main(String[] args) {
        int[] arr = {7,10,4,10,10,3,6,5,2};
        int n = arr.length;

//        for(int i = 0 ; i < arr.length ; i++){
//            boolean flag = true;
//            for(int j = i+1 ; j < arr.length ; j++){
//                if(arr[i] <= arr[j]){
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag){
//                System.out.println(arr[i]);
//            }
//        }

        int curr_leader = arr[n-1];
        System.out.println(curr_leader);

        for(int i = n-2 ; i >=0; i--)
        {
            if(arr[i] > curr_leader){
                curr_leader = arr[i];
                System.out.println(curr_leader);
            }
        }
    }
}

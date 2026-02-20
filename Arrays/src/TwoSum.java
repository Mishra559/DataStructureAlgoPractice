import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = {1,2,3,4,5};

        boolean flag = checkSum(arr,s);

        if(flag){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    private static boolean checkSum(int[] arr,int n){
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length;j++){
                if(i != j){
                    if(arr[i]+arr[j]==n){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

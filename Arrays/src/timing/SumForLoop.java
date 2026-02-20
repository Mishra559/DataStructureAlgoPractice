package timing;

import java.time.Instant;
import java.util.Scanner;

public class SumForLoop {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers");
        int n = sc.nextInt();
        Instant now = Instant.now();
        System.out.println(now);
        int sum = 0;
        for(int i = 0; i < n; i++){
          sum += i;
        }
        System.out.println(sum);
        Instant end = Instant.now();
        System.out.println(end);
    }


}

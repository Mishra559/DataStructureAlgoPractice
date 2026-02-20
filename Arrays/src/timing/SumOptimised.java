package timing;

import java.time.Instant;
import java.util.Scanner;

public class SumOptimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers");
        int n = sc.nextInt();
        Instant now = Instant.now();
        System.out.println(now);

        System.out.println("The sum is - "  + (n*(n+1))/2);

        Instant end = Instant.now();
        System.out.println(end);
    }
}

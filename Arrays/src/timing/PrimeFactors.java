package timing;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        printPrimeFactors(n);
    }

    private static void printPrimeFactors(int n) {

        for (int i = 2; i <= n; i++) {
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
        }

        if(n>1){
            System.out.println(n);
        }

    }

}

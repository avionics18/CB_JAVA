package code.L06__Loops;

import java.util.Scanner;

public class C05_DigitsSum {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}

package code.L06__Loops;

import java.util.Scanner;

public class C04_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int dividend = sc.nextInt();
        System.out.print("b = ");
        int divisor = sc.nextInt();
        sc.close();

        System.out.printf("GCD of %d and %d = ", dividend, divisor);
        // program to find the GCD of two numbers
        while (dividend % divisor != 0) {
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }

        System.out.print(divisor);

    }
}

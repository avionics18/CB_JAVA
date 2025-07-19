// Fib Series: 0 1 1 2 3 5 8 13 21 34 55
// index:      0 1 2 3 4 5 6 7  8  9  10

package code.L06_Loops;

import java.util.Scanner;

public class C02_Fibonacci {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // nth position of fib number
        sc.close();

        int a = 0, b = 1;

        if (n == 0) {
            System.out.println(n + "th fibonacci number = " + a);
        } else if (n == 1) {
            System.out.println(n + "st fibonacci number = " + b);
        } else {
            // do the sum of a & b, (n-1) number of times
            // to get the nth index fibonacci number
            int c;
            for (int i = 1; i < n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(n + "th fibonacci number = " + b);
        }
    }
}

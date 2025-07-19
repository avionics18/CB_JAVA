// Fib Series: 0 1 1 2 3 5 8 13 21 34 55
// index:      0 1 2 3 4 5 6 7  8  9  10
// [Without If-Else]

package code.L06_Loops;

import java.util.Scanner;

public class C03_Fibonacci_v2 {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // nth index fib number
        sc.close();

        int a = 0, b = 1, c;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " | ");
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println(n + "th fibonacci number is " + a);
    }
}

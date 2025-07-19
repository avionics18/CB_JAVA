// Check if a num is prime or not

package code.L06_Loops;

import java.util.Scanner;

public class C01_Prime_Number {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }

        if (count > 0) {
            System.out.printf("%d is not a prime number.", n);
        } else {
            System.out.printf("%d is a prime number.", n);
        }
    }
}

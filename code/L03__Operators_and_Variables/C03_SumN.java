package code.L03__Operators_and_Variables;

// Find the sum of n natural numbers
import java.util.Scanner;

public class C03_SumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }

        System.out.println("Sum = " + sum);
    }
}
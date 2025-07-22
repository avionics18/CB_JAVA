package code.L07__Data_Types_1;

import java.util.Scanner;

public class C03_Any_To_Any {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the src base = ");
        int srcBASE = sc.nextInt();
        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        System.out.print("Enter the destination base = ");
        int destBASE = sc.nextInt();
        sc.close();

        int sum1 = 0, mul1 = 1;

        // convert from src to base10
        while (n > 0) {
            int rem = n % 10;
            sum1 += rem * mul1;
            mul1 *= srcBASE;
            n = n / 10;
        }

        // the convert from base10 to dest
        int sum2 = 0, mul2 = 1;
        while (sum1 > 0) {
            int rem = sum1 % destBASE;
            sum2 += rem * mul2;
            mul2 *= 10;
            sum1 = sum1 / destBASE;
        }

        // print the result
        System.out.printf("Representation of %d in Base %d is = %d", n, destBASE, sum2);

        // (234)_5 = (69)_10 = (105)_8
    }
}

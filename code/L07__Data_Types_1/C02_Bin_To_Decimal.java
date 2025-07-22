package code.L07__Data_Types_1;

import java.util.Scanner;

public class C02_Bin_To_Decimal {
    public static void main(String[] args) {
        System.out.print("Enter a number in Base 2 = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int sum = 0, mul = 1;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * mul;
            mul *= 2;
            n = n / 10;
        }

        System.out.println("Decimal repr of number is = " + sum);
    }
}
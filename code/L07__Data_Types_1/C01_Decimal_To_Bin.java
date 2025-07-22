package code.L07__Data_Types_1;

import java.util.Scanner;

public class C01_Decimal_To_Bin {
    public static void main(String[] args) {
        System.out.print("Enetr a number in base 10 = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int sum = 0, mul = 1;
        while (n > 0) {
            int rem = n % 2;
            sum += rem * mul;
            mul *= 10;
            n = n / 2;
        }
        System.out.println("Binary Repr of number is = " + sum);
    }
}
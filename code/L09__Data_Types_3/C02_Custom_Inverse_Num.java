package code.L09__Data_Types_3;

import java.util.Scanner;

// In Java,it is not necessary to explicitly import java.lang.Math 
// because the java.lang package is automatically imported into 
// every Java program by default.
import java.lang.Math;

public class C02_Custom_Inverse_Num {
    public static void main(String[] args) {
        int n;
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();

        System.out.print("Inverse of " + n + " = ");

        int pos = 1;
        int result = 0;
        while (n > 0) {
            int digit = n % 10;
            result += pos * Math.pow(10, (digit - 1));
            // RHS will be double but += will cause implicit typecasting

            n = n / 10;
            pos++;
        }

        System.out.println((int) result);

    }
}

package code.L10__Functions;

import java.util.Scanner;

// not needed as java.lang is by default imported
import java.lang.Math;

public class C02_Armstrong_num {
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }

    public static int getDigitPowerSum(int num, int count) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, count);
            num /= 10;
        }

        return sum;
    }

    public static boolean isArmstrong(int num) {
        // 1. Count the number of digits
        int count = countDigits(num);

        // 2. Find the sum of each digit raised to power of digitCount
        int sum = getDigitPowerSum(num, count);

        // 3. If sum == num, return true else false
        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();

        System.out.println(isArmstrong(n));
    }
}

package code.L03__Operators_and_Variables;

import java.util.Scanner;

public class C02_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        sc.close();

        if (n % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is Odd.");
        }
    }
}
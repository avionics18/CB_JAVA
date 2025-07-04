package code.L03__Operators_and_Variables;

import java.util.Scanner;

public class C01_SimpleInterest {
	public static void main(String[] args) {
		System.out.println("=====Simple Interest Calculator=====");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter P = ");
		int p = sc.nextInt();
		System.out.print("Enter R = ");
		int r = sc.nextInt();
		System.out.print("Enter T = ");
		int t = sc.nextInt();
		sc.close();

		double si = (double) (p * r * t) / 100;

		System.out.println("Simple Interest = " + si);

	}
}
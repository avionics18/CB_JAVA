package code.zzTest;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.print("Enter value of n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		System.out.println("Value of n: " + n);
	}
}
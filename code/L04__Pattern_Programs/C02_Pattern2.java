/*

*
* *
* * *
* * * *
* * * * *

*/

import java.util.Scanner;

public class C02_Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n = ");
		int n = sc.nextInt();
		int stars = 1;

		int row = 1;
		while (row <= n) {
			int col = 1;
			while (col <= stars) {
				System.out.print("* ");
				col++;
			}
			// STEP 3: Prep for next row
			row++;
			stars++;
			System.out.println();
		}

		sc.close();
	}
}
/*

*               * 
* *           * * 
* * *       * * * 
* * * *   * * * * 
* * * * * * * * *

*/

package code.L04__Pattern_Programs;

import java.util.Scanner;

public class C12_Pattern12 {
	public static void main(String[] args) {
		// Here there are three steps to be
		// performed in each row.
		// Print stars, spaces & stars.
		// For spaces, it starts with 1 at the (n-1)th row
		// then 3, 5, 7 implies first row will
		// have (2n-1) - 2 spaces i.e. 2n-3.

		System.out.print("Enter the value of n = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // no. of rows
		sc.close();

		// no. of stars and spaces
		int stars = 1, spaces = 2 * n - 3;

		int row = 1;
		while (row <= n) {
			// perform operations in each row
			// 1. print stars
			int i = 1;
			while (i <= stars) {
				System.out.print("* ");
				i++;
			}

			// 2. print spaces
			int j = 1;
			while (j <= spaces) {
				System.out.print("  ");
				j++;
			}

			// 3. print stars
			// - Here we need to be very mindful of
			// the last step, as the no. of stars
			// in the left triangle != right triangle
			// implies, last step need to run one loop less.

			int k = 1;
			if (row == n) {
				k = 2;
			}
			while (k <= stars) {
				System.out.print("* ");
				k++;
			}

			// 4. next row prep
			row++;
			spaces -= 2;
			stars++;
			System.out.println();
		}
	}
}

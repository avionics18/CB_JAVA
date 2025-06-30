/*

        *
      * *
    * * *
  * * * *
* * * * *

*/

import java.util.*;

public class C03_Pattern3 {
	public static void main(String[] args) {
		int n;

		// passing args for debugging purposes
		if (args.length == 0) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the value of n = ");
			n = sc.nextInt(); // no. of rows
			sc.close();
		} else {
			n = Integer.parseInt(args[0]);
		}

		// no. of stars = rowNumber
		int row = 1;
		while (row <= n) {
			// printing spaces
			int spaces = n - row; // no. of spaces = n - rowNumber
			int col = 1;
			while (col <= spaces) {
				// we need to print 2 spaces as
				// each space (2 spaces) is replaced by 2 characters
				// star(*) and space( ) in the subsequent steps.
				System.out.print("  ");
				col++;
			}

			// printing stars
			int stars = row; // no. of stars = rowNumber
			col = 1;
			while (col <= stars) {
				System.out.print("* ");
				col++;
			}

			// next row prep
			row++;
			System.out.println();
		}
	}
}
/*

        * 
      * * 
    * * * 
  * * * * 
* * * * * 
  * * * * 
    * * * 
      * * 
        *

*/

package code.L05__Mirror_and_Number_Pattern;

import java.util.Scanner;

public class C02_Pattern2 {
	public static void main(String[] args) {
		System.out.print("n = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		// no. of rows
		int totalRows = 2 * n - 1, spaces = n - 1, stars = 1;

		int row = 1;
		while (row <= totalRows) {
			// perform steps for each row
			// 1. print spaces
			int i = 1;
			while (i <= spaces) {
				System.out.print("  ");
				i++;
			}

			// 2. print stars
			int j = 1;
			while (j <= stars) {
				System.out.print("* ");
				j++;
			}

			// 3. prepare for the next row
			// Here at the pen-ultimate loop,
			// we need to decrease stars
			// as well as increase spaces
			if (row < n) {
				spaces--;
				stars++;
			} else {
				spaces++;
				stars--;
			}
			row++;
			System.out.println();
		}
	}
}

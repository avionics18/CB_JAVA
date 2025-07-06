/*

* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *

*/

package code.L04__Pattern_Programs;

import java.util.Scanner;

public class C08_Pattern8 {
	public static void main(String[] args) {
		// In the earlier problem, we need not worry about
		// the stars because it was starting with 1.
		// But now for n = 5, we can see there are 9 stars.
		// So, how do we know what will be initail stars count?
		// Easy Peazy, as you can see stars are in A.P i.e.
		// 1,3,5,7,9,.... right! So, it implies we need to
		// find a_n, which is nothing but a + (n-1)d
		// implies here, a_n = 1 + (n-1)2 => 2n - 1

		System.out.print("Enter the value of n = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // no. of rows
		sc.close();

		// no. of stars and spaces
		int stars = 2 * n - 1, spaces = 0;

		int row = 1;
		while (row <= n) {
			// perform the steps for each row
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

			// 3. next row prep
			row++;
			spaces++;
			stars -= 2;
			System.out.println();
		}
	}
}

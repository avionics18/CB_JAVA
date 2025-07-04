package code.L04__Pattern_Programs;

/*

        *
      * * *       
    * * * * *     
  * * * * * * *   
* * * * * * * * *

NOTE: This question has great role in the future - number pattern.

 */

import java.util.Scanner;

public class C07_Pattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n = ");
		int n = sc.nextInt(); // no. of rows
		sc.close();

		int stars = 1, spaces = n - 1;

		int row = 1;
		while (row <= n) {
			// STEP: procedure for each row
			// print spaces
			int i = 1;
			while (i <= spaces) {
				System.out.print("  ");
				i++;
			}

			// print stars
			int j = 1;
			while (j <= stars) {
				System.out.print("* ");
				j++;
			}

			// next row prep
			row++;
			spaces--;
			stars += 2;
			System.out.println();
		}
	}
}

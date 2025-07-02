/*

                * 
            * *   
        * * *     
    * * * *       
* * * * *

 */

import java.util.Scanner;

public class C06_Pattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n = ");
		int n = sc.nextInt(); // no. of rows
		sc.close();

		int stars = 1, spaces = (n - 1) * 2;

		int row = 1;
		while (row <= n) {
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

			// prep for next row
			row++;
			stars++;
			spaces -= 2;
			System.out.println();
		}
	}
}

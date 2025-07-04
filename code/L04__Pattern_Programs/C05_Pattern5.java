package code.L04__Pattern_Programs;

/*

* * * * *         
    * * * *       
        * * *     
            * *   
                *

*/

import java.util.Scanner;

public class C05_Pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n = ");
		int n = sc.nextInt(); // no. of rows
		sc.close();
		int stars = n, spaces = 0;

		int row = 1;
		while (row <= n) {
			int i = 1;
			while (i <= spaces) {
				System.out.print("  ");
				i++;
			}

			int j = 1;
			while (j <= stars) {
				System.out.print("* ");
				j++;
			}

			// prep for next row
			row++;
			stars--;
			spaces += 2;
			System.out.println();
		}
	}
}

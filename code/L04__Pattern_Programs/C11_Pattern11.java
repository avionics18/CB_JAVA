/*

        *
      *   *       
    *   *   *     
  *   *   *   *   
*   *   *   *   *

*/

package code.L04__Pattern_Programs;

import java.util.Scanner;

public class C11_Pattern11 {
    public static void main(String[] args) {
        System.out.print("Enter the value of n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // no. of rows
        sc.close();

        // no. of stars & spaces
        int stars = 1, spaces = n - 1;

        int row = 1;
        while (row <= n) {
            // perform the steps for each row
            // 1. print the spaces
            int i = 1;
            while (i <= spaces) {
                System.out.print("  ");
                i++;
            }

            // 2. print the stars
            int j = 1;
            while (j <= stars) {
                if (j % 2 == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                j++;
            }

            // 3. prep for next row
            row++;
            spaces--;
            stars += 2;
            System.out.println();
        }
    }
}

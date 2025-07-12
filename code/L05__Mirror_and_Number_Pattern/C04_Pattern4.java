/*

      *       
    *   *     
  *       *   
*           * 
  *       *   
    *   *     
      *

*/

package code.L05__Mirror_and_Number_Pattern;

import java.util.Scanner;

public class C04_Pattern4 {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // no. of rows
        sc.close();

        // no. of stars and spaces
        int inner_spaces = -1, outer_spaces = n / 2;

        int row = 1;
        while (row <= n) {
            // steps to perform in each row
            // 1. print outer spaces
            int i = 1;
            while (i <= outer_spaces) {
                System.out.print("  ");
                i++;
            }

            // 2. print star
            System.out.print("* ");

            // 3. print inner spaces
            int j = 1;
            while (j <= inner_spaces) {
                System.out.print("  ");
                j++;
            }

            // 4. print star
            // - row should be neither equal to
            // 1 nor n.
            if (row != 1 && row != n) {
                System.out.print("* ");
            }

            // 5. next row prep
            if (row <= n / 2) {
                outer_spaces--;
                inner_spaces += 2;
            } else {
                outer_spaces++;
                inner_spaces -= 2;
            }
            row++;
            System.out.println();
        }
    }
}

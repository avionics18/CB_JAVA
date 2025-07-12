/*

* * * * * * * 
* * *   * * * 
* *       * * 
*           * 
* *       * * 
* * *   * * * 
* * * * * * *

*/

package code.L05__Mirror_and_Number_Pattern;

import java.util.Scanner;

public class C03_Pattern3 {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // no. of rows
        sc.close();

        // no. of stars and spaces
        // - In case of spaces, we're starting with -1
        // as the spaces will incrment by +2.
        int stars = n / 2 + 1, spaces = -1;

        int row = 1;
        while (row <= n) {
            // perform steps for each row
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
            // - Here we only need to take care of the first and
            // last row for that extra "*" or when stars = n / 2 + 1.
            int k = 1;
            if (stars == n / 2 + 1) {
                k = 2;
            }
            while (k <= stars) {
                System.out.print("* ");
                k++;
            }

            // 4. prep for next row
            if (row < n / 2 + 1) {
                stars--;
                spaces += 2;
            } else {
                stars++;
                spaces -= 2;
            }
            row++;
            System.out.println();
        }
    }
}

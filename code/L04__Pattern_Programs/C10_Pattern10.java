/*

* ! * ! * ! * ! * 
  * ! * ! * ! *   
    * ! * ! *     
      * ! *       
        *

*/

package code.L04__Pattern_Programs;

import java.util.Scanner;

public class C10_Pattern10 {
    public static void main(String[] args) {
        System.out.print("Enter the value of n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // no. of rows
        sc.close();

        // no. of stars/elements & spaces
        int stars = 2 * n - 1, spaces = 0;

        int row = 1;
        while (row <= n) {
            // perform the operations for each step
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
                    System.out.print("! ");
                } else {
                    System.out.print("* ");
                }
                j++;
            }

            // 3. prep for next row
            row++;
            spaces++;
            stars -= 2;
            System.out.println();
        }
    }
}

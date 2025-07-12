/*

* * * * * 
  * * * * 
    * * * 
      * * 
        * 

*/

package code.L04__Pattern_Programs;

import java.util.Scanner;

public class C04_Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt(); // no. of rows
        sc.close();
        int stars = n;
        int spaces = 0;

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
            spaces++;
            stars--;
            System.out.println();
        }
    }
}

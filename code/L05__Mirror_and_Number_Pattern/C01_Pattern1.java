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

public class C01_Pattern1 {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // no. of rows
        int totalRows = 2 * n - 1, stars = 1;

        int row = 1;
        while (row <= totalRows) {
            // perform steps for each row

            // 1. print stars
            int i = 1;
            while (i <= stars) {
                System.out.print("* ");
                i++;
            }

            // 2. next row prep
            // Here we increase the stars till nth row
            // which is when we're in n-1 row, we prep for nth row.
            // Thus row < n and not <= (less than equal to).
            if (row < n) {
                stars++;
            } else {
                stars--;
            }
            row++;
            System.out.println();
        }
    }
}
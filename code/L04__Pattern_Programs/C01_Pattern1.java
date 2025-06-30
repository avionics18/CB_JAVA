/*

* * * *
* * * *
* * * *
* * * *

*/

import java.util.Scanner;

class C01_Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        // STEP 1: How many Rows and Stars you need
        int n = sc.nextInt();
        int stars = n;

        int row = 1;
        while (row <= n) {
            // STEP 2: Task to perform in each row
            int col = 1;
            while (col <= stars) {
                System.out.print("* ");
                col++;
            }

            // STEP 3: Preparation for the next step
            row++;
            System.out.println();
        }

        sc.close();

    }
}
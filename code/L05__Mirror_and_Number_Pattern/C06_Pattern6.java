//                                 1
//                         2       3       4
//                 5       6       7       8       9
//         10      11      12      13      14      15      16        
// 17      18      19      20      21      22      23      24      25

package code.L05__Mirror_and_Number_Pattern;

import java.util.Scanner;

public class C06_Pattern6 {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // no. of items, spaces
        int items = 1, spaces = n - 1;

        int row = 1, val = 1;
        while (row <= n) {
            // Perform steps for each row
            // 1. print spaces
            int i = 1;
            while (i <= spaces) {
                System.out.print("\t");
                i++;
            }

            // 2. print vals for items times
            int j = 1;
            while (j <= items) {
                // use tabs instead of spaces for better formatting
                System.out.print(val + "\t");
                val++;
                j++;
            }

            // 3. prep for next row
            items += 2;
            spaces--;
            row++;
            System.out.println();

        }
    }
}

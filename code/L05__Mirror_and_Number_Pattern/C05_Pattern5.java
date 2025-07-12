//         1
//       2 2 2       
//     3 3 3 3 3     
//   4 4 4 4 4 4 4   
// 5 5 5 5 5 5 5 5 5

package code.L05__Mirror_and_Number_Pattern;

import java.util.Scanner;

public class C05_Pattern5 {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // no. of items and no. of spaces
        int items = 1, spaces = n - 1;

        int row = 1;
        while (row <= n) {
            // perform steps for each row
            // 1. print spaces
            int i = 1;
            while (i <= spaces) {
                System.out.print("  ");
                i++;
            }

            // 2. print row number for items no. of times
            int j = 1;
            while (j <= items) {
                System.out.printf("%d ", row);
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

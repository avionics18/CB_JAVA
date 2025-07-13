//         1     
//       2 3 2   
//     3 4 5 4 3 
//   4 5 6 7 6 5 4   
// 5 6 7 8 9 8 7 6 5 

package code.L05__Mirror_and_Number_Pattern;

import java.util.Scanner;

public class C09_Pattern9 {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // no. of items, spaces
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

            // 2. print val for items times
            int j = 1, val = row; // start from row number
            while (j <= items) {
                System.out.print(val + " ");
                // print till the middle item
                // Vertical Mirror
                if (j < items / 2 + 1) {
                    val++;
                } else {
                    val--;
                }
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

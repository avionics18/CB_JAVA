//         1
//       1 2 1       
//     1 2 3 2 1     
//   1 2 3 4 3 2 1   
// 1 2 3 4 5 4 3 2 1 
//   1 2 3 4 3 2 1   
//     1 2 3 2 1   
//       1 2 1     
//         1

package code.L05__Mirror_and_Number_Pattern;

import java.util.Scanner;

public class C10_Pattern10 {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // no. of rows
        sc.close();

        // no. of items and spaces
        int items = 1, spaces = n - 1;

        int row = 1;
        while (row <= 2 * n - 1) {
            // perform steps for each row
            // 1. print spaces
            int i = 1;
            while (i <= spaces) {
                System.out.print("  ");
                i++;
            }

            // 2. print numbers
            int j = 1, val = 1;
            // if column number reaches (items/2 + 1)
            // stop incrementing and start decrementing
            while (j <= items) {
                System.out.printf("%d ", val);
                // Vertical Mirror
                if (j < items / 2 + 1) {
                    val++;
                } else {
                    val--;
                }
                j++;
            }

            // 3. prep for next row
            // Horizontal Mirror
            if (row < n) {
                spaces--;
                items += 2;
            } else {
                spaces++;
                items -= 2;
            }
            row++;
            System.out.println();
        }
    }
}

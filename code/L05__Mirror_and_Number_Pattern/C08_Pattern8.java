//         1
//       1 2 1       
//     1 2 3 2 1     
//   1 2 3 4 3 2 1   
// 1 2 3 4 5 4 3 2 1

package code.L05__Mirror_and_Number_Pattern;

import java.util.Scanner;

public class C08_Pattern8 {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // no. of items, spaces
        int items = 1, spaces = n - 1;

        int row = 1;
        while (row <= n) {
            // Perform steps for each row
            // 1. print spaces
            int i = 1;
            while (i <= spaces) {
                System.out.print("  ");
                i++;
            }

            // 2. print vals for items times
            int j = 1, val = 1;
            while (j <= items) {
                // use tabs instead of spaces for better formatting
                System.out.print(val + " ");
                // for vertical mirroring
                // you can check column i.e. j with row number
                // or (items / 2) + 1
                // But in the next pattern you will find
                // pattern as 2 3 2 in the second row, then
                // here you can't run till row number, now the pattern
                // starts from row number and goes till middle.
                // Therefore, that middle is (items / 2) + 1
                // -> Vertical Mirror
                if (j < (items / 2 + 1)) {
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

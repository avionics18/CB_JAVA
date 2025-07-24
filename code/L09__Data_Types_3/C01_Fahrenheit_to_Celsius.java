package code.L09__Data_Types_3;

import java.util.Scanner;

public class C01_Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        int min_fahrenheit, max_fahrenheit, step;
        Scanner sc = new Scanner(System.in);
        System.out.print("Min Fahrenheit = ");
        min_fahrenheit = sc.nextInt();
        System.out.print("Max Fahrenheit = ");
        max_fahrenheit = sc.nextInt();
        System.out.print("Step = ");
        step = sc.nextInt();
        sc.close();

        System.out.println("---------------------");
        System.out.println("Fahrenheit\tCelsius");
        System.out.println("---------------------");
        for (int f = min_fahrenheit; f < max_fahrenheit; f += step) {
            // float c = (5 / 9) * (f - 32);
            // The above code will yeild 0 for all f values
            // as (5 / 9) which is (int / int) will result in
            // int i.e. 0 and not 0.55. So the solution is
            // either (5.0 / 9) or explicit typecasting
            // i.e. int c = ((float) 5 / 9) * (f - 32)

            // *NOTE*: (float) (5 / 9) * (f - 32) will yeild 0.0
            // as first (5/9) will be calculated which is 0 (int)
            // and then typecasted to float which will be 0.0

            float c = ((float) 5 / 9) * (f - 32);
            System.out.println(f + "\t\t" + c);
        }
    }
}
package code.L08__Data_Types_2;

public class C01_Typecasting {
    public static void main(String[] args) {
        int a1 = 1000000000;
        System.out.println("a1 = " + a1);
        long a2 = 10000000000L;
        System.out.println("a2 = " + a2);
        float f1 = (float) (5.6);
        System.out.println("f1 = " + f1);
        char ch = 'A';
        while (ch != 'a') {
            System.out.print(ch + " ");
            ch++;
        }
    }
}
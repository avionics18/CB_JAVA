package code.L10__Functions;

public class C01_Fun_Demo {
    public static void main(String[] args) {
        System.out.println("Hello");
        int a = 10, b = 7;
        int c = add(a, b);
        System.out.println("Sum = " + c);
    }

    public static int add(int x, int y) {
        int z = x + y;
        System.out.println(subtract(x, y));
        return z;
    }

    public static int subtract(int p, int q) {
        return p - q;
    }
}

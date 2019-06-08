import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            int n = scan.nextInt();

            System.out.printf("Fib(%d) = %d%n", n, fibonacci(n));
        }

    }

    private static long fibonacci(int n) {
        long fib[] = new long[61];
        long a = 0;
        long b = 1;
        long c = 0;

        for (int i = 1; i <= 60; i++) {
            a = b;
            b = c;
            c = a + b;
            fib[i] = c;
        }
        return fib[n];
    }
}

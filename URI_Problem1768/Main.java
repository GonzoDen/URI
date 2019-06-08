import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int n = input.nextInt();
            StringBuilder build = new StringBuilder("");
            for (int i = 1; i <= n; i += 2) {
                printRow(n, i, build);
            }
            printRow(n, 1, build);
            printRow(n, 3, build);
            System.out.println();
        }
    }

    private static void printRow(int n, int i, StringBuilder build) {
        for (int j = 0; j < (n - i) / 2; j++)
            build.append(' ');
        for (int j = (n - i) / 2; j < (n - i) / 2 + i; j++)
            build.append('*');
        System.out.println(build);
        build.delete(0, build.length());
    }
}

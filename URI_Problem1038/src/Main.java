import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int code, number;
        code = input.nextInt();
        number = input.nextInt();

        if (code == 1)
            System.out.printf("Total: R$ %.2f%n", (double)(number * 4));
        else if (code == 2)
            System.out.printf("Total: R$ %.2f%n", (double)(number * 4.50));
        else if (code == 3)
            System.out.printf("Total: R$ %.2f%n", (double)(number * 5));
        else if (code == 4)
            System.out.printf("Total: R$ %.2f%n", (double)(number * 2));
        else if (code == 5)
            System.out.printf("Total: R$ %.2f%n", (double)(number * 1.50));
    }
}

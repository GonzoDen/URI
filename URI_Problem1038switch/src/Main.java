import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int code, amount;
        code = input.nextInt();
        amount = input.nextInt();

        double total;

        switch (code) {
            case 1:
                total = 4 * amount;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 2:
                total = 4.50 * amount;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 3:
                total = 5 * amount;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 4:
                total = 2 * amount;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 5:
                total = 1.50 * amount;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
        }
    }
}

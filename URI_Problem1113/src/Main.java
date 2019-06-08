import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        while (a != b) {
            int sum = 0;

            if (a > b) {
                System.out.println("Decrescente");
            }

            if (a < b) {
                System.out.println("Crescente");
            }

            a = input.nextInt();
            b = input.nextInt();
            if (a == b) {
                break;
            }
        }
    }
}

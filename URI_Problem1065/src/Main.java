import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int count = 0;

        for (int i = 1; i <= 5; i++) {
            int num = input.nextInt();

            if (num % 2 == 0) {
                count++;
            }
        }

        System.out.printf("%d valores pares%n", count);
    }
}

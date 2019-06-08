import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();

        for (int i = 0; i < count; i++) {
            double num1, num2, num3;
            num1 = input.nextDouble();
            num2 = input.nextDouble();
            num3 = input.nextDouble();

            double w1, w2, w3;
            w1 = 2 * num1;
            w2 = 3 * num2;
            w3 = 5 * num3;

            double average = (w1 + w2 + w3)/10;

            System.out.printf("%.1f%n", average);
        }

    }
}

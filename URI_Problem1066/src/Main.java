import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int countPositive = 0;
        int countNegative = 0;
        int countOdd = 0;
        int countEven = 0;

        for (int i = 1; i <= 5; i++) {
            int num = input.nextInt();

            if (num % 2 == 0) {
                countEven++;
            }
            else
                countOdd++;

            if (num > 0)
                countPositive++;
            else if (num < 0)
                countNegative++;
        }

        System.out.printf("%d valor(es) par(es)%n", countEven );
        System.out.printf("%d valor(es) impar(es)%n", countOdd );
        System.out.printf("%d valor(es) positivo(s)%n", countPositive );
        System.out.printf("%d valor(es) negativo(s)%n", countNegative );
    }
}

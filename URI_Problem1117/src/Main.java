import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 0;
        double media = 0;

        while (n < 2) {
            double num = input.nextDouble();

            if (num <= 10.0 && num >= 0.0) {
                n++;
                media += num;
            }
            else
                System.out.println("nota invalida");

        }

        System.out.printf("media = %.2f%n", media/2);

    }
}

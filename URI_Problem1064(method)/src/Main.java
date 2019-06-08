import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int positive = 0;
        double sum = 0;


        for (int i = 1; i <= 6; i++) {
            double num = input.nextDouble();
            if (isPositive(num)){
                positive++;
                sum += num;
            }
        }

        double average = sum / positive;

        System.out.printf("%d valores positivos%n", positive);
        System.out.printf("%.1f%n", average);


    }

    public static boolean isPositive(double num) {
        if (num >= 0)
            return true;

        return false;
    }
}
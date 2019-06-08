import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num = input.nextDouble();

        double[] list = new double[100];

        for (int i = 0; i < list.length; ++i) {
            list[i] = num;
            num /= 2;
        }

        for(int i = 0; i < list.length; ++i) {
            System.out.printf("N[%d] = %.4f%n", i, list[i]);
        }
    }
}

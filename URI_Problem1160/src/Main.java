import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        int result = 0;

        for (int d = 0; d < count; d++) {
            int PA = scan.nextInt();
            int PB = scan.nextInt();

            double G1 = scan.nextDouble();
            double G2 = scan.nextDouble();

            while (PA <= PB && result <= 100) {

                PA += PA / 100.0 * G1;
                PB += PB / 100.0 * G2;
                result++;
            }

            if (result > 100) {
                System.out.println("Mais de 1 seculo.");
                result = 0;
            } else {
                System.out.println(result + " anos.");
                result = 0;
            }

        }
    }
}

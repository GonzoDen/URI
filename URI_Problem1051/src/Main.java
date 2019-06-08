import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double salary = scan.nextDouble();

        if (salary <= 2000) {
            System.out.println("Isento");
        }
        if (salary > 2000 && salary <= 3000) {
            System.out.printf("R$ %.2f\n", (salary - 2000) * 0.08);
        }
        if (salary > 3000 && salary <= 4500) {
            System.out.printf("R$ %.2f\n", (salary - 3000) * 0.18 + 80);
        }
        if (salary > 4500) {
            System.out.printf("R$ %.2f\n", (salary - 4500) * 0.28 + 80 + 270);
        }
    }
}

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        if ((a == b + c)||(b == a + c)||(c == a + b)){
            double area = c *((a+b)/2);
            System.out.printf("Area = %.1f%n", area);
        }
        else {
            double perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        }

    }
}

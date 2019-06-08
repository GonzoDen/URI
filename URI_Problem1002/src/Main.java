import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double area = r * r * PI;
        System.out.print("A=");
        System.out.printf("%.4f%n", area);
    }

}


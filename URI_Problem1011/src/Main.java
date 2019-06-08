import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double volume = (r * r * r )*(4.0/3)*PI;
        System.out.printf("VOLUME = %.3f%n", volume);
    }

}


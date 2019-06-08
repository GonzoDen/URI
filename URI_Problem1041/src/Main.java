import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double x, y;
        x = input.nextDouble();
        y = input.nextDouble();

        if ((x == 0) && (y == 0))
            System.out.println("Origem");
        if ((x != 0) && (y == 0))
            System.out.println("Eixo X");
        if ((y != 0) && (x == 0))
            System.out.println("Eixo Y");
        if ((x > 0) && (y > 0))
            System.out.println("Q1");
        if ((x < 0) && (y > 0))
            System.out.println("Q2");
        if ((x < 0) && (y < 0))
            System.out.println("Q3");
        if ((x > 0) && (y < 0))
            System.out.println("Q4");



    }
}

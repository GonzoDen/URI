import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        double a, b, c, areaRT, areaC, areaT, areaS, areaR;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        areaRT = 1/2.0 * a * c;
        areaC = c * c * PI;
        areaT = 1/2.0 * (a + b) * c;
        areaS = b * b;
        areaR = a * b;
        System.out.printf("TRIANGULO: %.3f%n", areaRT);
        System.out.printf("CIRCULO: %.3f%n", areaC);
        System.out.printf("TRAPEZIO: %.3f%n", areaT);
        System.out.printf("QUADRADO: %.3f%n", areaS);
        System.out.printf("RETANGULO: %.3f%n", areaR);
    }

}

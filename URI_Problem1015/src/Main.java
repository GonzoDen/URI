import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double x1, x2, y1, y2, dis1,disF;
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        dis1 = ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1));
        disF = Math.pow(dis1, 1.0/2);
        System.out.printf("%.4f%n", disF);

    }

}
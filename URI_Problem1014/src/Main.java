import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int dis = input.nextInt();
        double fuel = input.nextDouble();
        System.out.printf("%.3f km/l%n", dis/fuel);
    }
}
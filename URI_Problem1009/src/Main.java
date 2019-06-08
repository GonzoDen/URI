import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String name = input.next(); //why do we read name if we don't post it
        double salary, products, total;
        salary = input.nextDouble();
        products = input.nextDouble();
        total = salary + 0.15*products;
        System.out.printf("TOTAL = R$ %.2f%n", total);

    }

}
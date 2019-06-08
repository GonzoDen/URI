import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int num, workhours;
        num = input.nextInt();
        workhours = input.nextInt();
        double perhour = input.nextDouble();
        double salary = workhours * perhour;
        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f%n", salary);
    }
}
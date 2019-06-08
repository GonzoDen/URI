import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double grade1 = input.nextDouble();
        double grade2 = input.nextDouble();
        double gradeA = 3.5 * grade1;
        double gradeB = 7.5 * grade2;
        double average = (gradeA + gradeB)/11;
        System.out.print("MEDIA = ");
        System.out.printf("%.5f%n", average);
    }

}
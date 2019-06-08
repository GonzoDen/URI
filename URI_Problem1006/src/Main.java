import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double grade1 = input.nextDouble();
        double grade2 = input.nextDouble();
        double grade3 = input.nextDouble();
        double gradeA = 2 * grade1;
        double gradeB = 3 * grade2;
        double gradeC = 5 * grade3;
        double average = (gradeA + gradeB + gradeC)/10;
        System.out.printf("MEDIA = %.1f%n", average);
    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while(true) {
            int age = input.nextInt();

            if (age < 0)
                break;

            sum += age;
            count++;
        }

        double average = (double)sum/count;

        System.out.printf("%.2f%n", average);
    }
}
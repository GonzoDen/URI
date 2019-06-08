import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int positive = 0;
        double sum = 0;

        for(int i = 1; i <= 6; i++) {
            double num = input.nextDouble();

            if(num >=0){
                positive++;
                sum += num; //+= means sum = sum + num (in case if you forgot this)
            }

        }

        double average = sum / positive;

        System.out.printf("%d valores positivos%n", positive);
        System.out.printf("%.1f%n", average);
    }
}
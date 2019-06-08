import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int positive = 0;
        for (int i = 1; i <= 6; i++){
            double num;
            num = input.nextDouble();
            if (num > 0){
                positive++;
            }
        }
        System.out.printf("%d valores positivos%n", positive);

    }
}
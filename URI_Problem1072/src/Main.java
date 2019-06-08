import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int countIn = 0;
        int countOut = 0;

        int trial = input.nextInt();

        for (int i = 1; i <= trial; i++) {
            int num = input.nextInt();

            if (num >= 10 && num <= 20)
                countIn++;
            else
                countOut++;

        }

        System.out.printf("%d in%n", countIn);
        System.out.printf("%d out%n", countOut);
    }
}

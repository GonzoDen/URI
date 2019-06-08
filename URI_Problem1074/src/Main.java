import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int trial = input.nextInt();

        for (int i = 1; i <= trial; i++) {
            int num = input.nextInt();

            if (num % 2 == 0 && num != 0)
                System.out.print("EVEN ");
            else if (num % 2 != 0 && num != 0)
                System.out.print("ODD ");

            if (num > 0)
                System.out.println("POSITIVE");
            else if (num < 0)
                System.out.println("NEGATIVE");
            else
                System.out.println("NULL");
        }
    }
}

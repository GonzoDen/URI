import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();



        for (int i = 0; i < count; i++) {
            int x = input.nextInt();
            int y = input.nextInt();

            int sum = 0;

            if (x > y) {
                for (int j = y + 1; j < x; ++j) {
                    if (j % 2 != 0)
                        sum += j;
                }
            }

            if (y > x) {
                for (int j = x + 1; j < y; ++j) {
                    if (j % 2 != 0)
                        sum += j;
                }
            }

            System.out.println(sum);
        }
    }
}

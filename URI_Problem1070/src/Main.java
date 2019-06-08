import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for (int i = 1; i <= 6; i++) {
            if (num % 2 == 0) {
                System.out.println(num + 1);
            }
            else {
                System.out.println(num);
            }

            num += 2;
        }
    }
}

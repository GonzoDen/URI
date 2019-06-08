import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();
        int sum = 0;

        for (int i = 0; i < count; i++) {
            int x = input.nextInt();
            int y = input.nextInt();

            if (x % 2 == 0)
                x++;

            for (int j = 0; j < y; j++) {
                sum += x;
                x += 2;
            }

            System.out.println(sum);

            sum = 0;
        }
    }
}

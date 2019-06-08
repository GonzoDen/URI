import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        while (x != 0) {

            int sum = 0;

            if (x % 2 != 0) {
                x++;
            }
            for (int i = 0; i < 5; i++) {
                sum += x;
                x += 2;
            }

            System.out.println(sum);

            x = input.nextInt();
        }
    }
}
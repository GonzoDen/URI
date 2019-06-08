import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = 0;

        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                if (i % 13 != 0)
                    sum += i;
            }
        }

        if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                if (i % 13 != 0)
                    sum += i;
            }
        }

        System.out.println(sum);

    }
}

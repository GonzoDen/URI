import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int count = 1; // cause you already have one num
        int sum = num1;

        while (num2 <= num1) {
            num2 = input.nextInt();
        }

        while(sum < num2) {
            num1++;
            sum += num1;
            count++;
        }

        System.out.println(count);

    }
}

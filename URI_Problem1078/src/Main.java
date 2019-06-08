import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = 1;

        while (num2 <= 10) {
            System.out.println(num2 + " x " + num1 + " = " + num1*num2);
            num2++;
        }
    }
}
